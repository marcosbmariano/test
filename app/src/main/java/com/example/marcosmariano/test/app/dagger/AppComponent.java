package com.example.marcosmariano.test.app.dagger;

import com.example.marcosmariano.test.data.DataRepository;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component( modules = {AppModule.class})
public interface AppComponent {
    DataRepository provDataRepository();
}
