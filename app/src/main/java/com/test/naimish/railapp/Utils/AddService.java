package com.test.naimish.railapp.Utils;

import android.content.Context;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;

public class AddService {
    public static AdRequest getAdRequest(Context context) {
        MobileAds.initialize(context, "ca-app-pub-3940256099942544~3347511713");
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("00AAAAFC13AD9032B6868EC8AD98E72A").build();
        return adRequest;
    }
}
