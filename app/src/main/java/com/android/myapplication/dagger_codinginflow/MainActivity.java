package com.android.myapplication.dagger_codinginflow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.myapplication.dagger_codinginflow.car.Car;
import com.android.myapplication.dagger_codinginflow.dagger.CarComponent;
import com.android.myapplication.dagger_codinginflow.dagger.DaggerCarComponent;
import com.android.myapplication.dagger_codinginflow.dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car; //we cannot inject a private and final field

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();
        //will inject all the member variables of this class, that are annotated with @Inject
        carComponent.inject(this);

        car.drive();
    }
}
