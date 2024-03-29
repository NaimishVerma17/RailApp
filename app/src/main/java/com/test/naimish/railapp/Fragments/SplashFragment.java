package com.test.naimish.railapp.Fragments;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.test.naimish.railapp.Activities.EnquiryActivity;
import com.test.naimish.railapp.Activities.LandingActivity;
import com.test.naimish.railapp.Models.AuthorizationResponse;
import com.test.naimish.railapp.Network.ApiLayer;
import com.test.naimish.railapp.Network.RetrofitCallBack;
import com.test.naimish.railapp.R;
import com.test.naimish.railapp.Utils.RailAppConstants;
import com.test.naimish.railapp.Utils.ResponseListener;
import com.test.naimish.railapp.Utils.SharedPreference;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by naimish on 4/1/2018.
 */

public class SplashFragment extends RailAppFragment implements ResponseListener<AuthorizationResponse> {

    @BindView(R.id.splash_progress_bar)
    ProgressBar progressBar;

    @BindView(R.id.reload_text)
    TextView reload;

    @OnClick(R.id.reload_text)
    public void onReload() {
        reload.setVisibility(View.INVISIBLE);
        validateUser();
    }

    private String mToken;

    @Override
    protected int getResourceId() {
        return R.layout.fragment_splash;
    }

    public static Fragment newInstance() {
        return new SplashFragment();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (isOnline()) {
            mToken = SharedPreference.getPreference(getContext(), RailAppConstants.TOKEN_CONSTANT);
            if (!mToken.equals(""))
                validateUser();
            else {
                startActivity(new Intent(getActivity(), LandingActivity.class));
                getActivity().finish();
            }
        } else {
            progressBar.setVisibility(View.INVISIBLE);
            reload.setVisibility(View.VISIBLE);
            Snackbar.make(getView(), R.string.internet_connection, Snackbar.LENGTH_SHORT).show();
        }

    }

    private void validateUser() {
        progressBar.setVisibility(View.VISIBLE);
        RetrofitCallBack<AuthorizationResponse> callBack = new RetrofitCallBack<>(this);
        ApiLayer.getInterface().getAutherization(mToken).enqueue(callBack);
    }

    @Override
    public void onSuccess(AuthorizationResponse response) {
        if (response.getmIsLoggedIn()) {
            startActivity(new Intent(getActivity(), EnquiryActivity.class));
            getActivity().finish();
        }
    }

    @Override
    public void onNullResponse() {
        startActivity(new Intent(getActivity(), LandingActivity.class));
        getActivity().finish();
    }

    @Override
    public void onFailure(Throwable throwable) {
        Snackbar.make(getView(), R.string.common_error, Snackbar.LENGTH_SHORT).show();
        progressBar.setVisibility(View.INVISIBLE);
        reload.setVisibility(View.VISIBLE);
    }

    private boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) getActivity().getSystemService(getContext().CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null && cm.getActiveNetworkInfo().isConnectedOrConnecting();
    }
}
