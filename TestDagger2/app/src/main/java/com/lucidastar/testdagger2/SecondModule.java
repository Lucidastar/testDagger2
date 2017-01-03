package com.lucidastar.testdagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hanxiaoxing on 16/12/30.
 */

@Module
public class SecondModule {
    @PerActivity
    @Provides
    public Cloth getBlueCloth(){
        Cloth cloth = new Cloth();
        cloth.setColor("蓝色");
        return cloth;
    }
//
//    @PerActivity
//    @Provides
//    public ClothHandler getClothHandler(){
//        return new ClothHandler();
//    }
}
