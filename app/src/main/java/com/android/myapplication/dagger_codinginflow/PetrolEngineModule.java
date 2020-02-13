package com.android.myapplication.dagger_codinginflow;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {
    @Provides
    //we can directly pass the petrol engine here because constructor is already annotated with @Inject
    Engine provideEngine(PetrolEngine engine) {
        return engine;
    }

}
