package com.test.naimish.railapp.Network.LiveTrainNetwork;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.test.naimish.railapp.BuildConfig;
import com.test.naimish.railapp.Fragments.LiveTrainSearchFragment;
import com.test.naimish.railapp.Models.ChangePassword;
import com.test.naimish.railapp.Models.LiveTrainStatusModel.LiveStatusBaseModel;
import com.test.naimish.railapp.R;
import com.test.naimish.railapp.Utils.ResponseListener;

import org.greenrobot.eventbus.EventBus;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.test.naimish.railapp.Utils.RailAppConstants.RAIL_BASE_URL;

/**
 * Created by Vivek on 3/17/2018.
 */

public class LiveTrainApiClient {

    private ResponseListener<LiveStatusBaseModel> responseListener;

    public LiveTrainApiClient(ResponseListener<LiveStatusBaseModel> responseListener) {
        this.responseListener = responseListener;
    }
    public void liveTrainStatus(String trainNo, String date) {
        OkHttpClient.Builder okhttpbuilder = new OkHttpClient.Builder();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        if (BuildConfig.DEBUG) {
            okhttpbuilder.addInterceptor(interceptor);
        }
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RAIL_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okhttpbuilder.build())
                .build();
        LiveTrainApiInterface liveTrainApiInterface = retrofit.create(LiveTrainApiInterface.class);
        Call<LiveStatusBaseModel> call = liveTrainApiInterface.liveTrainInfo(trainNo, date);
        call.enqueue(new Callback<LiveStatusBaseModel>() {
            @Override
            public void onResponse(Call<LiveStatusBaseModel> call, Response<LiveStatusBaseModel> response) {
                if (response.body()!= null) {
                    responseListener.onSuccess(response.body());
                }
                else{
                    responseListener.onNullResponse();
                }
            }

            @Override
            public void onFailure(Call<LiveStatusBaseModel> call, Throwable t) {
                responseListener.onFailure(t);
            }
        });
    }

}
