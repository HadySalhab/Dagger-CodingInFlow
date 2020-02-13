package com.android.myapplication.dagger_codinginflow.dagger;

import com.android.myapplication.dagger_codinginflow.car.engine.DieselEngine;
import com.android.myapplication.dagger_codinginflow.car.engine.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }
    @Provides
    int provideHorsePower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
    return engine;
    }

}
