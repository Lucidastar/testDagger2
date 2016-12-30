package com.lucidastar.testdagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hanxiaoxing on 16/12/30.
 */
@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
