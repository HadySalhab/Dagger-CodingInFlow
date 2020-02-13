package com.android.myapplication.dagger_codinginflow.dagger;

import com.android.myapplication.dagger_codinginflow.car.Driver;
import com.android.myapplication.dagger_codinginflow.dagger.modules.DieselEngineModule;
import com.android.myapplication.dagger_codinginflow.dagger.modules.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory{
        //since the driverModule has no default constructor , we have to pass it in the create method
        AppComponent create(DriverModule driverModule);
    }
}
