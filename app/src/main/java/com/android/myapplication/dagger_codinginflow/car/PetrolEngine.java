package com.android.myapplication.dagger_codinginflow.car;

import android.util.Log;

import com.android.myapplication.dagger_codinginflow.car.Engine;

import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine(){

    }

    @Override
    public void start() {
        Log.d(TAG, "PetrolEngine Started");

    }
}
