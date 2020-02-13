package com.android.myapplication.dagger_codinginflow;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.myapplication.dagger_codinginflow.car.Car;
import com.android.myapplication.dagger_codinginflow.dagger.CarComponent;
import com.android.myapplication.dagger_codinginflow.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car; //we cannot inject a private and final field

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent = DaggerCarComponent
                .builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        //will inject all the member variables of this class, that are annotated with @Inject
        carComponent.inject(this);

        car.drive();
    }
}
