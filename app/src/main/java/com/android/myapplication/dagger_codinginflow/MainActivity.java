package com.android.myapplication.dagger_codinginflow;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.myapplication.dagger_codinginflow.car.Car;
import com.android.myapplication.dagger_codinginflow.dagger.CarComponent;
import com.android.myapplication.dagger_codinginflow.dagger.DaggerCarComponent;


public class MainActivity extends AppCompatActivity {

    Car car1;

    Car car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarComponent carComponent1 = DaggerCarComponent
                .builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        //will inject all the member variables of this class, that are annotated with @Inject
        /*carComponent.inject(this);*/

        CarComponent carComponent2 = DaggerCarComponent
                .builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();


        //each component will provide different instance singleton
        car1 = carComponent1.getCar();
        car2 = carComponent2.getCar();

        car1.drive();
        car2.drive();
    }
}
