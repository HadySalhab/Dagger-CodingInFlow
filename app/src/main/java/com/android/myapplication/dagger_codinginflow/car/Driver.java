package com.android.myapplication.dagger_codinginflow.car;

import javax.inject.Inject;
import javax.inject.Singleton;

//we will assume that this class is a third party class
public class Driver {
    String name;
    public Driver(String name){
        this.name = name;
    }
}
