package com.android.myapplication.dagger_codinginflow;

import dagger.Component;

@Component(modules = {PetrolEngineModule.class})
public interface CarComponent {
    //the name of the method does not matter
    Car getCar();

    //the name of the method does not matter
    //we cannot specify a superclass as a parameter
    //we have to be specific in the parameter which class we want to inject
    void inject(MainActivity mainActivity);
}
