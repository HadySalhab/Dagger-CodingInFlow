package com.android.myapplication.dagger_codinginflow;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {
    @Binds
    //we can directly pass the petrol engine here because constructor is already annotated with @Inject
    abstract Engine bindEngine(PetrolEngine engine);

}
