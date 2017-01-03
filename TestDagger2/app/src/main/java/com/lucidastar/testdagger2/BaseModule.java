package com.lucidastar.testdagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hanxiaoxing on 17/1/3.
 */

@Module
public class BaseModule {

    @Singleton //单例
    @Provides
    public ClothHandler getClothHandler(){
        return new ClothHandler();
    }
}
