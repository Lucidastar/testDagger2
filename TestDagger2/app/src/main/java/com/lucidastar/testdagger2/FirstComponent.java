package com.lucidastar.testdagger2;

import dagger.Component;

/**
 * Created by hanxiaoxing on 16/12/30.
 */
@PerActivity
@Component(modules = FirstModule.class)
public interface FirstComponent {
    void inject(FirstActivity firstActivity);
}
