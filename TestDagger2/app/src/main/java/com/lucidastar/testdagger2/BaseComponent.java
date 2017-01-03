package com.lucidastar.testdagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by hanxiaoxing on 17/1/3.
 */

@Singleton //对应Module中声明的单例
@Component(modules = BaseModule.class)
public interface BaseComponent {
    ClothHandler getClothHandler();
}
