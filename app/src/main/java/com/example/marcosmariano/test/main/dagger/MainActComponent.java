package com.example.marcosmariano.test.main.dagger;


import com.example.marcosmariano.test.main.MainActivity;
import com.example.marcosmariano.test.main.MainViewModel;

import dagger.Component;

@Component( modules = {MainActModule.class})
public interface MainActComponent {
    void inject(MainActivity act);
    void inject(MainViewModel mainViewModel);
}
