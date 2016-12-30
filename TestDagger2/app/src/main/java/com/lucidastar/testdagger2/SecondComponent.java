package com.lucidastar.testdagger2;

import dagger.Component;

/**
 * Created by hanxiaoxing on 16/12/30.
 */
@PerActivity
@Component(modules = SecondModule.class)
public interface SecondComponent {
    void inject(SecondActivity secondActivity);
}
