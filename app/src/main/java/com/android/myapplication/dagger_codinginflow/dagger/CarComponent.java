package com.android.myapplication.dagger_codinginflow.dagger;

import androidx.core.app.RemoteInput;

import com.android.myapplication.dagger_codinginflow.MainActivity;
import com.android.myapplication.dagger_codinginflow.car.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    //the name of the method does not matter
    Car getCar();

    //the name of the method does not matter
    //we cannot specify a superclass as a parameter
    //we have to be specific in the parameter which class we want to inject
    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
            //Similar to provides,this method allows dagger to provide an int value
            //whenever the object in the graph depends on an integer
            //this method will be attached to the chain
            // of the builder pattern corresponding the creation of this class
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);


        CarComponent build(); //we have to add this method, we cannot avoid it
    }
}
