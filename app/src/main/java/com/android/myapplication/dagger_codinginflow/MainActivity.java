package com.android.myapplication.dagger_codinginflow;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.myapplication.dagger_codinginflow.car.Car;
import com.android.myapplication.dagger_codinginflow.dagger.ActivityComponent;
import com.android.myapplication.dagger_codinginflow.dagger.modules.DieselEngineModule;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1;

    @Inject
    Car car2;

    private ActivityComponent mActivityComponent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mActivityComponent = ((ExampleApp)getApplication()).getAppComponent().getActivityComponentFactory()
                 .create(150,1500);
        mActivityComponent.inject(this);

        car1.drive();
        car2.drive();
    }

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }

}
