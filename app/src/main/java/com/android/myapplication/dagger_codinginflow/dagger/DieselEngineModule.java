package com.android.myapplication.dagger_codinginflow.dagger;

import com.android.myapplication.dagger_codinginflow.car.DieselEngine;
import com.android.myapplication.dagger_codinginflow.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine() {
        //instead of passing the horsepower directly into the constructor
/*
* we could have created a provides method for horsepower
* this is necessarily if we want the horsepower in other places as well
* In real app , this is often the case with the application context
* */
        return new DieselEngine(horsePower);
    }

}
