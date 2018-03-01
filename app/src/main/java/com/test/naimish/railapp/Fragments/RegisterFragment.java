package com.test.naimish.railapp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.test.naimish.railapp.Activities.LandingActivity;
import com.test.naimish.railapp.R;
import com.test.naimish.railapp.Utils.Validations;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Vivek on 2/18/2018.
 */

public class RegisterFragment extends RailAppFragment {
    private String mEmail;
    private String mName;
    private String mPassword;
    private String mConfirmPassword;
    @BindView(R.id.email)
    EditText mEmailField;
    @BindView(R.id.name)
    EditText mNameField;
    @BindView(R.id.password)
    EditText mPasswordField;
    @BindView(R.id.confirm_password)
    EditText mConfirmPasswordField;

    public static Fragment newInstance() {
        return new RegisterFragment();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @Override
    protected int getResourceId() {
        return R.layout.fragment_register;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @OnClick(R.id.register)
    public void registerUser() {
        mName = mNameField.getText().toString();
        mEmail = mEmailField.getText().toString();
        mPassword = mPasswordField.getText().toString();
        mConfirmPassword = mConfirmPasswordField.getText().toString();
        mNameField.setError(null);
        mEmailField.setError(null);
        mPasswordField.setError(null);
        boolean killSwitch = false;
        View focusView = null;
        if (Validations.isEmpty(mName)) {
            mNameField.setError(getResources().getString(R.string.name_error));
            focusView = mNameField;
            killSwitch = true;
        }
        if (!Validations.checkEmail(mEmail) || Validations.isEmpty(mEmail)) {
            mEmailField.setError(getString(R.string.email_error));
            focusView = mEmailField;
            killSwitch = true;
        }
        if (Validations.isEmpty(mPassword) || (!Validations.checkPassword(mPassword, mConfirmPassword))) {
            mPasswordField.setError(getResources().getString(R.string.password_error));
            focusView = mPasswordField;
            killSwitch = true;
        }
        if (killSwitch) {
            focusView.requestFocus();
        } else {
            signUpUser();
        }
    }

    private void signUpUser() {
        if (true) {
            startActivity(new Intent(getActivity(), LandingActivity.class));
        } else {
            Toast.makeText(getContext(), "Something Went Wrong", Toast.LENGTH_LONG).show();
        }
    }
}
