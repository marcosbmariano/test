package com.example.marcosmariano.test.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.example.marcosmariano.test.data.DataRepository;
import com.example.marcosmariano.test.data.models.Task;
import com.example.marcosmariano.test.main.dagger.DaggerMainActComponent;
import com.example.marcosmariano.test.main.dagger.MainActComponent;
import com.example.marcosmariano.test.main.dagger.MainActModule;

import java.util.List;

import javax.inject.Inject;

public class MainViewModel extends ViewModel {
    private MainActComponent mComponent;
    @Inject
    DataRepository mDataRepository;



    public MainViewModel(){
        mComponent = DaggerMainActComponent.builder().build();
        mComponent.inject(this);
    }

    public LiveData<List<Task>> getLiveData() {
        return mDataRepository.getTaskList();
    }

    public MainActComponent getComponent(){
        return mComponent;
    }
}
