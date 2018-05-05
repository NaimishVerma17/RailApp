package com.test.naimish.railapp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.test.naimish.railapp.Activities.LiveTrainStatusActivity;
import com.test.naimish.railapp.Models.LiveTrainStatusModel.LiveStatusBaseModel;
import com.test.naimish.railapp.Network.LiveTrainNetwork.LiveTrainApiClient;
import com.test.naimish.railapp.R;
import com.test.naimish.railapp.Utils.RailAppConstants;
import com.test.naimish.railapp.Utils.ResponseListener;
import com.test.naimish.railapp.Utils.StationAdapter;
import com.test.naimish.railapp.Utils.TrainController;
import com.test.naimish.railapp.Views.ProgressLoader;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by Vivek on 4/4/2018.
 */

public class LiveTrainSearchFragment extends RailAppFragment implements ResponseListener<LiveStatusBaseModel>, StationAdapter.StationNameClicklistener {
    private ArrayList<String> mDates;
    private LiveTrainApiClient mApiClient;
    private String mTrainNo;
    private String mSelectedDate;
    private LiveStatusBaseModel statusBaseModel;
    private ProgressLoader loader;

    @BindView(R.id.enter_train)
    EditText trainNo;

    @BindView(R.id.stations_recycler_view)
    RecyclerView stationsRecyclerView;

    @BindView(R.id.date_spinner)
    Spinner dateSpinner;

    @OnClick(R.id.search_live_train)
    public void searchLiveTrain() {
        mTrainNo = trainNo.getText().toString();
        loader.showLoader();
        mApiClient.liveTrainStatus(mTrainNo, mSelectedDate);
    }


    @Override
    protected int getResourceId() {
        return R.layout.live_train_search;
    }

    public static Fragment newInstance() {
        return new LiveTrainSearchFragment();
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        createSpinnerDropdown();
    }

    private void createSpinnerDropdown() {

        mDates = new ArrayList<String>();
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        mDates.add(dateFormat.format(cal.getTime()).toString());
        cal.add(Calendar.DATE, 1);
        mDates.add(dateFormat.format(cal.getTime()).toString());
        cal.add(Calendar.DATE, 1);
        mDates.add(dateFormat.format(cal.getTime()).toString());
        ArrayAdapter<String> dateAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_dropdown_item, mDates);
        dateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dateSpinner.setAdapter(dateAdapter);
        dateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mSelectedDate = mDates.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mApiClient = new LiveTrainApiClient(this);
        loader=new ProgressLoader(getActivity());
    }


    @Override
    public void onSuccess(LiveStatusBaseModel response) {
        loader.dismissLoader();
        this.statusBaseModel=response;
        StationAdapter adapter=new StationAdapter(getContext(),TrainController.getStationList(response.getRoute()));
        stationsRecyclerView.setAdapter(adapter);
        adapter.setClicklistenerInstance(this);
        stationsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    @Override
    public void onFailure(Throwable throwable) {
        loader.dismissLoader();
        Snackbar.make(getView(), throwable.getMessage().toString() + " " + R.string.try_again, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void onNullResponse() {
        loader.dismissLoader();
        Snackbar.make(getView(), R.string.common_error + " " + R.string.try_again, Snackbar.LENGTH_SHORT).show();
    }


    @Override
    public void itemclicked(int position) {
        String response=TrainController.getDisplayInformation(statusBaseModel,position);
        Intent intent=new Intent(getActivity(),LiveTrainStatusActivity.class);
        intent.putExtra(RailAppConstants.SINGLE_STATION_DETAILS,response);
        startActivity(intent);
    }

}

