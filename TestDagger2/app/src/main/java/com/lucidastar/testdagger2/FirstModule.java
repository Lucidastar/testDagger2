package com.lucidastar.testdagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hanxiaoxing on 16/12/30.
 */

@Module
public class FirstModule {

    @PerActivity
    @Provides
    public Cloth getRedCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @PerActivity
    @Provides
    public ClothHandler getClothHandler(){
        return new ClothHandler();
    }
}
