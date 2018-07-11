package com.example.marcosmariano.test.main.dagger;


import com.example.marcosmariano.test.app.App;
import com.example.marcosmariano.test.data.DataRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActModule {

    @Provides
    public DataRepository provDataRepository(){
        return App.getInstance().getComponent().provDataRepository();
    }

}
