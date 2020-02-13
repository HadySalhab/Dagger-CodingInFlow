package com.android.myapplication.dagger_codinginflow.dagger;

import com.android.myapplication.dagger_codinginflow.car.Driver;
import com.android.myapplication.dagger_codinginflow.dagger.modules.DieselEngineModule;
import com.android.myapplication.dagger_codinginflow.dagger.modules.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    //only the return type is important
    //name can be anything
    //we have to pass all modules of the child component that does not have default constructor
    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);
}
