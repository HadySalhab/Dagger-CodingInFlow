package com.android.myapplication.dagger_codinginflow.dagger;

import com.android.myapplication.dagger_codinginflow.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
