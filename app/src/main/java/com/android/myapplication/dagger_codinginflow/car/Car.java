package com.android.myapplication.dagger_codinginflow.car;

import android.util.Log;

import com.android.myapplication.dagger_codinginflow.car.engine.Engine;
import com.android.myapplication.dagger_codinginflow.car.wheels.Wheels;
import com.android.myapplication.dagger_codinginflow.dagger.PerActivity;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Wheels wheels, Engine engine, Driver driver) {
        this.wheels = wheels;
        this.driver = driver;
        this.engine = engine;
    }

    //DAGGER will call this method after calling the constructor
    //cannot be private
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "driving...");
        Log.d(TAG, driver + " drives " + this);


    }
}
