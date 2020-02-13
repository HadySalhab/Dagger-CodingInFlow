package com.android.myapplication.dagger_codinginflow.dagger;

import com.android.myapplication.dagger_codinginflow.MainActivity;
import com.android.myapplication.dagger_codinginflow.car.Car;

import dagger.Component;

@Component(modules = {DieselEngineModule.class})
public interface CarComponent {
    //the name of the method does not matter
    Car getCar();

    //the name of the method does not matter
    //we cannot specify a superclass as a parameter
    //we have to be specific in the parameter which class we want to inject
    void inject(MainActivity mainActivity);
}
