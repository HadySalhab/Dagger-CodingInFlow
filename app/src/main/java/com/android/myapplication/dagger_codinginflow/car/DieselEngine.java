package com.android.myapplication.dagger_codinginflow.car;

import android.util.Log;

import com.android.myapplication.dagger_codinginflow.car.Engine;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;


    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;

    }

    @Override
    public void start() {
        Log.d(TAG, "DieselEngine Started. Horsepower: " + horsePower);

    }
}
