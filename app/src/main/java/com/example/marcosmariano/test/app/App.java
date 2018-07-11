package com.example.marcosmariano.test.app;

import android.app.Application;

import com.example.marcosmariano.test.app.dagger.AppComponent;
import com.example.marcosmariano.test.app.dagger.DaggerAppComponent;

public class App extends Application{
    private static App INSTANCE;
    AppComponent mAppComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().build();
        INSTANCE = this;
    }

    public static App getInstance(){
        return INSTANCE;
    }

    public AppComponent getComponent(){
        return mAppComponent;
    }
}
