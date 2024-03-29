package com.test.naimish.railapp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.test.naimish.railapp.Activities.SeatAvalibilityStatusActivity;
import com.test.naimish.railapp.Models.SeatAvailability.TrainSeatBaseModel;
import com.test.naimish.railapp.R;
import com.test.naimish.railapp.Utils.ResponseListener;
import com.test.naimish.railapp.Utils.SeatAvalibilityController;
import com.test.naimish.railapp.Utils.SeatClassAndQuotaContants;
import com.test.naimish.railapp.Utils.StationListAndCode;
import com.test.naimish.railapp.Utils.Validations;
import com.test.naimish.railapp.Views.ProgressLoader;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Vivek on 5/29/2018.
 */

public class SeatAvalibilityEnquiryFragment
        extends RailAppFragment
        implements ResponseListener<TrainSeatBaseModel>,
        AdapterView.OnItemClickListener {
    private String mSourceCode;
    private String mDestinationCode;
    private String mDate;
    private String mTrainNo;
    private String mTrainClassCode;
    private String mTrainQuota;
    private ArrayList<String> mClassCode;
    private ArrayList<String> mQuota;
    private ArrayList<String> mStationName;
    private ArrayList<String> seatStatus;
    private ArrayList<String> suggestedStation;

//    private SeatAvalibilityApiClient mSeatAvalibilityApiClient;

    private ProgressLoader mLoader;

    @BindView(R.id.source_code)
    AutoCompleteTextView trainSourceCode;

    @BindView(R.id.destination_code)
    AutoCompleteTextView trainDestinationCode;

    @BindView(R.id.enter_train)
    EditText trainNo;

    @BindView(R.id.enter_date)
    EditText trainDate;

    @BindView(R.id.class_code)
    Spinner trainClassCode;

    @BindView(R.id.quota_code)
    Spinner trainQuota;


    @Override
    protected int getResourceId() {
        return R.layout.fragment_seat_enquiry;
    }

    public static Fragment newInstance() {
        return new SeatAvalibilityEnquiryFragment();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        createClassCodeSpinnerDropdown();
        createQuotaCodeSpinnerDropdown();


    }

    @OnClick(R.id.submit_button)
    public void seatEnquiry() {
        mTrainNo = trainNo.getText().toString();
        mDate = trainDate.getText().toString();
        mSourceCode = trainSourceCode.getText().toString();
        mDestinationCode = trainDestinationCode.getText().toString();
        trainNo.setError(null);
        trainDate.setError(null);
        trainSourceCode.setError(null);
        trainDestinationCode.setError(null);

        View focusView = null;
        Boolean killSwitch = false;
        if (!Validations.isEmpty(mTrainNo) && Validations.checkTrainNo(mTrainNo)) {
            if (!Validations.isEmpty(mDate)) {
                if (!Validations.isEmpty(mSourceCode)) {
                    mSourceCode = trainSourceCode.getText().toString().substring(trainSourceCode.getText().toString().indexOf('-') + 1, trainSourceCode.getText().toString().length());
                    Toast.makeText(getContext(), mSourceCode, Toast.LENGTH_LONG).show();
                    if (!Validations.isEmpty(mDestinationCode)) {
                        mDestinationCode = trainDestinationCode.getText().toString().substring(trainDestinationCode.getText().toString().indexOf('-') + 1, trainDestinationCode.getText().toString().length());
//                        mSeatAvalibilityApiClient.seatAvalibilityStatus(mTrainNo, mSourceCode, mDestinationCode, mDate, mTrainClassCode, mTrainQuota);
                        mLoader.showLoader();
                    } else {
                        trainDestinationCode.setError(getString(R.string.invalid_code));
                        focusView = trainDestinationCode;
                        killSwitch = true;
                    }
                } else {
                    trainSourceCode.setError(getString(R.string.invalid_code));
                    focusView = trainSourceCode;
                    killSwitch = true;
                }

            } else {
                trainDate.setError(getString(R.string.invalid_date));
                focusView = trainDate;
                killSwitch = true;

            }
        } else {
            trainNo.setError(getString(R.string.invalid_trainno));
            focusView = trainNo;
            killSwitch = true;
        }
        if (killSwitch) {
            if (focusView != null)
                focusView.requestFocus();
//            if (focusViewEmail != null)
//                focusViewEmail.requestFocus();

        }

    }

    private void createClassCodeSpinnerDropdown() {

        mClassCode = new ArrayList<>();
        mClassCode.addAll(SeatClassAndQuotaContants.addClassCode());
//        mClassCode.add("1A");
//        mClassCode.add("2A");
//        mClassCode.add("FC");
//        mClassCode.add("CC");
//        mClassCode.add("SL");
//        mClassCode.add("2S");

        ArrayAdapter<String> classCodeAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, mClassCode);
        classCodeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        trainClassCode.setAdapter(classCodeAdapter);
        trainClassCode.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mTrainClassCode = mClassCode.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    private void createQuotaCodeSpinnerDropdown() {
        mQuota = new ArrayList<>();
        mQuota.addAll(SeatClassAndQuotaContants.addQuotaCode());
        ArrayAdapter<String> quotaAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, mQuota);
        quotaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        trainQuota.setAdapter(quotaAdapter);
        trainQuota.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mTrainQuota = mQuota.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void createSourceCodeSpinnerDropdown() {
        //  = new ArrayList<>();
        //   mQuota.addAll(SeatClassAndQuotaContants.addQuotaCode());
        //  trainSourceCodeSpinner.setVisibility(View.VISIBLE);

//        StationAutoCompleteDetails stationAutoCompleteDetails = new StationAutoCompleteDetails();
//        mStationName = stationAutoCompleteDetails.deatils(stationAutoCompleteBaseModel);
        //  mStationCode=stationAutoCompleteDetails.stationCode(stationAutoCompleteBaseModel);
        ArrayAdapter<String> sourceCodeAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, suggestedStation);
        sourceCodeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        trainSourceCode.setAdapter(sourceCodeAdapter);
        trainDestinationCode.setOnItemClickListener(this);

        trainSourceCode.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                //  trainSourceCode.setText(mStationName.get(i).substring((mStationName.indexOf('-') + 1), mStationName.get(i).length()));
                // trainSourceCodeSpinner.setVisibility(View.GONE);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        String item1 = mStationName.get(position);
        Toast.makeText(getContext(), "Selected Item is: \t" + item1, Toast.LENGTH_LONG).show();
        trainSourceCode.setText(item1.substring(item1.indexOf(("-") + 1), item1.length()));
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mLoader = new ProgressLoader(getActivity());
//        mSeatAvalibilityApiClient = new SeatAvalibilityApiClient(this);
        trainSourceCode.setThreshold(2);
        trainDestinationCode.setThreshold(2);
        trainSourceCode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //  String[] listStation;
//                    long startTime = System.currentTimeMillis();
//                    long elapsedTime = 0L;
//                    elapsedTime = (new Date()).getTime() - startTime;
//                    while (elapsedTime > 2 * 60 * 1000) {

                // StationAutoCompleteApiClient mStationAutoCompleteApiClient = new StationAutoCompleteApiClient(SeatAvalibilityEnquiryFragment.this);
                // mStationAutoCompleteApiClient.stationAutoCompleteInfo(s.toString());
                //  createSourceCodeSpinnerDropdown();
                listOfStationsSuggested(s.toString());
                createSourceCodeSpinnerDropdown();
                // }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        trainDestinationCode.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                if (s.length() >= 3) {
//                    long startTime = System.currentTimeMillis();
//                    long elapsedTime = 0L;
//                    elapsedTime = (new Date()).getTime() - startTime;
//                    while (elapsedTime > 2 * 60 * 1000) {
//                    StationAutoCompleteApiClient mStationAutoCompleteApiClient = new StationAutoCompleteApiClient(SeatAvalibilityEnquiryFragment.this);
//                    mStationAutoCompleteApiClient.stationAutoCompleteInfo(s.toString());

                // }

                listOfStationsSuggested(s.toString());
                createDestinationSpinnerDropdown();

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }


    @Override
    public void onSuccess(TrainSeatBaseModel response) {
        mLoader.dismissLoader();
        // seatAvailabiityModelClass = new ArrayList<>();
        SeatAvalibilityController seatAvalibilityController = new SeatAvalibilityController();
        String responseInfo = seatAvalibilityController.getSeatAvalibilityInfo(response);
        seatStatus = seatAvalibilityController.getSeatStatus(response);
        Intent intent = new Intent(getActivity(), SeatAvalibilityStatusActivity.class);
        intent.putExtra("SeatInfo", responseInfo);
        intent.putExtra("SeatStatus", seatStatus);

        startActivity(intent);


    }

    @Override
    public void onFailure(Throwable throwable) {
        mLoader.dismissLoader();
        Snackbar.make(getView(), throwable.getMessage().toString() + " " + R.string.try_again, Snackbar.LENGTH_SHORT).show();

    }

    @Override
    public void onNullResponse() {
        mLoader.dismissLoader();
        Snackbar.make(getView(), R.string.common_error + " " + R.string.try_again, Snackbar.LENGTH_SHORT).show();


    }

//    @Override
//    public void onResponce(StationAutoCompleteBaseModel stationAutoCompleteBaseModel) {
////        createSourceCodeSpinnerDropdown(stationAutoCompleteBaseModel);
////        createDestinationSpinnerDropdown(stationAutoCompleteBaseModel);
//    }

    public void createDestinationSpinnerDropdown() {

//        StationAutoCompleteDetails stationAutoCompleteDetails = new StationAutoCompleteDetails();
//        mStationName = stationAutoCompleteDetails.deatils(stationAutoCompleteBaseModel);

        ArrayAdapter<String> sourceCodeAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_spinner_dropdown_item, suggestedStation);
        sourceCodeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        trainDestinationCode.setAdapter(sourceCodeAdapter);
        trainDestinationCode.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                trainDestinationCode.setText(mStationName.get(position).substring((mStationName.indexOf('-') + 1), mStationName.get(position).length()));
            }
        });

    }

    private void listOfStationsSuggested(String suggested) {
        String[] listStation;
        int j = 0;
        suggestedStation = new ArrayList<>();
        StationListAndCode stationListAndCode = new StationListAndCode(getContext());
        listStation = stationListAndCode.getStationName();
        for (int i = 0; i < listStation.length; i++) {
            if (suggested.startsWith(listStation[i].toLowerCase())) {
                suggestedStation.add(listStation[i]);
            }
        }

    }


}
