package com.android.myapplication.dagger_codinginflow.dagger;

import com.android.myapplication.dagger_codinginflow.car.DieselEngine;
import com.android.myapplication.dagger_codinginflow.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    //we can directly pass the petrol engine here because constructor is already annotated with @Inject
    abstract Engine bindEngine(DieselEngine engine);

}
