package com.android.myapplication.dagger_codinginflow.dagger;

import com.android.myapplication.dagger_codinginflow.car.engine.Engine;
import com.android.myapplication.dagger_codinginflow.car.engine.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    //we can directly pass the petrol engine here because constructor is already annotated with @Inject
    abstract Engine bindEngine(PetrolEngine engine);

}
