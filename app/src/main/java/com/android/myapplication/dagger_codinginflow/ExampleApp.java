package com.android.myapplication.dagger_codinginflow;

import android.app.Application;

import com.android.myapplication.dagger_codinginflow.dagger.AppComponent;
import com.android.myapplication.dagger_codinginflow.dagger.DaggerAppComponent;

public class  ExampleApp extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        //we dont have any @BindsInstance or module that their constructor
        //requires some argument, so we use create instead of build
        mAppComponent = DaggerAppComponent.create();

    }
    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}
