package com.android.myapplication.dagger_codinginflow;

import android.util.Log;

//assume it is a third part class
public class Tires {
    private static final String TAG = "Car";

    void inflate(){
        Log.d(TAG, "Tires inflated");
    }
}
