package com.android.myapplication.dagger_codinginflow.dagger;

import com.android.myapplication.dagger_codinginflow.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    @Provides
    @Singleton
    static Driver  provideDriver(){
        return new Driver();
    }
}
