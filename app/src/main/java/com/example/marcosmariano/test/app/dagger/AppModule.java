package com.example.marcosmariano.test.app.dagger;
import com.example.marcosmariano.test.data.DataContracts.*;
import com.example.marcosmariano.test.data.DataRepository;
import com.example.marcosmariano.test.data.localds.LocalDataSourceImp;
import com.example.marcosmariano.test.data.remoteds.RemoteDataSourceImp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    public LocalDataSource provLocalDataSource(){
        return new LocalDataSourceImp();
    }

    @Singleton
    @Provides
    public RemoteDataSource provRemoteDataSource(){
        return new RemoteDataSourceImp();
    }

    @Singleton
    @Provides
    public DataRepository provDataRepository(){
        return new DataRepository(provLocalDataSource(), provRemoteDataSource());
    }


}
