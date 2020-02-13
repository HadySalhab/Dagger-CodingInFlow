package com.android.myapplication.dagger_codinginflow;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";


    @Inject Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Wheels wheels) {
        this.wheels = wheels;
    }

    //DAGGER will call this method after calling the constructor
    //cannot be private
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "driving...");
    }
}
