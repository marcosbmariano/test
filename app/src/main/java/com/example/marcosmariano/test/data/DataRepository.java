package com.example.marcosmariano.test.data;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import com.example.marcosmariano.test.data.DataContracts.*;
import com.example.marcosmariano.test.data.models.Task;

import java.util.List;


public class DataRepository {
    private LocalDataSource mLocalDSource;
    private RemoteDataSource mRemoteDSource;
    private MutableLiveData<List<Task>> mTasksList = new MutableLiveData<>();

    public DataRepository(LocalDataSource local, RemoteDataSource remote){
        mLocalDSource = local;
        mRemoteDSource = remote;
    }

    public LiveData<List<Task>> getTaskList(){
        if( mTasksList.getValue() == null ){
            loadData();
        }

        return mTasksList;
    }

    public MutableLiveData<List<Task>> getmTasksList() {
        if( mTasksList.getValue() == null){
            loadData();
        }

        return mTasksList;
    }

    private void loadData(){
        //do wherever need to be done

        //mTasksList.setValue();
    }
}
