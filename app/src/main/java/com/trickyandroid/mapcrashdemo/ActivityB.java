package com.trickyandroid.mapcrashdemo;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.FragmentActivity;

public class ActivityB extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //This causes crash!
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                .detectDiskReads()
                .penaltyLog()
                .build());

        setContentView(R.layout.activity_b);
    }
}
