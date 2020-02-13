package com.android.myapplication.dagger_codinginflow.car;

//We will assume that this class is a third party class and we don't have access to its constructor
//we cannot annotate the constructor with @Inject
public class Wheels {
    private Rims rims;
    private Tires tires;

    //constructor cannot be annotated with @Inject
    public Wheels(Rims rims, Tires tires){
        this.rims = rims;
        this.tires = tires;
    }
}
