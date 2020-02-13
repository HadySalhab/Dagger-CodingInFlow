package com.android.myapplication.dagger_codinginflow;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.myapplication.dagger_codinginflow.car.Car;
import com.android.myapplication.dagger_codinginflow.dagger.ActivityComponent;
import com.android.myapplication.dagger_codinginflow.dagger.DaggerActivityComponent;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1;

    @Inject
    Car car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent carComponent = DaggerActivityComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .appComponent(((ExampleApp)getApplication()).getAppComponent())
                .build();
        carComponent.inject(this);

        car1.drive();
        car2.drive();
    }
}
