package com.test.naimish.railapp.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.test.naimish.railapp.R;
import com.test.naimish.railapp.Utils.Validations;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Vivek on 3/9/2018.
 */

public class ChangePasswordFragment extends RailAppFragment {
    private String mOldPassword;
    private String mNewPassword;
    private String mConfirmPassword;
    @BindView(R.id.old_password)
    EditText oldPassword;
    @BindView(R.id.new_password)
    EditText newPassword;
    @BindView(R.id.comfirm_new_password)
    EditText confirmNewPassword;

    @Override
    protected int getResourceId() {
        return R.layout.fragment_forgot_password;
    }

    public static Fragment newInstance() {
        return new ChangePasswordFragment();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @OnClick(R.id.comfirm_new_password_button)
    private void changePassword() {
        mNewPassword = newPassword.getText().toString();
        mConfirmPassword = confirmNewPassword.getText().toString();
        mOldPassword=oldPassword.getText().toString();
        newPassword.setError(null);
        oldPassword.setError(null);
        boolean killSwtich=false;
        View focusView=null;
        if(Validations.isEmpty(mOldPassword)){
            oldPassword.setError("Empty Old Password");
            killSwtich=true;
            focusView=oldPassword;
        }
        if(Validations.checkPassword(mOldPassword)){
            oldPassword.setError("Invalid Old Password");
            killSwtich=true;
            focusView=oldPassword;

        }
        if(Validations.checkPassword(mNewPassword)|| Validations.checkPassword(mNewPassword,mConfirmPassword)){
            newPassword.setError("Inavalid New Password");
            killSwtich=true;
            focusView=newPassword;

        }
        if(killSwtich)
            focusView.requestFocus();
        else
            setNewPassword();




    }
    private static void setNewPassword(){


    }
}
