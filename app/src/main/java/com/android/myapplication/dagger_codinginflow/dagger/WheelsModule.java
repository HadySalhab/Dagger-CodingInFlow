package com.android.myapplication.dagger_codinginflow.dagger;

import com.android.myapplication.dagger_codinginflow.car.wheels.Tires;
import com.android.myapplication.dagger_codinginflow.car.wheels.Rims;
import com.android.myapplication.dagger_codinginflow.car.wheels.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
//always make your module abstract if all of your provides method are static
public abstract class WheelsModule {
    //methods are static because they do not depends on the instance of this class
    //so whenever we have methods in the module class that are independent of its instances
    //we should use static for better performance

    @Provides
    static Rims provideRimes() { //method name does not matter
        //we cannot annotate the Rim constructor but we can call it ourselves
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        //we cannot annotate the Tires constructor but we can call it ourselves
       Tires tires = new Tires();
       tires.inflate();
       return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }


}
