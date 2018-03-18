package com.test.naimish.railapp.Models.LiveTrainStatusModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Vivek on 3/17/2018.
 */

public class CurrentStationModel {
    @SerializedName("code")
    @Expose
    private String trainCode;


    @SerializedName("name")
    @Expose
    private String trainName;

    public String getName() {
        return this.trainName;
    }

    public String getCode() {
        return this.trainCode;
    }

}