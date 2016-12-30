package com.lucidastar.testdagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hanxiaoxing on 16/12/30.
 */

@Module
public class MainModule {


    @Singleton
    @Provides
    public Cloth getCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }
//

    @Provides
    public Clothes getClothes(Cloth cloth){
        Clothes clothes = new Clothes(cloth);

        return clothes;
    }

//    @Singleton
//    @Provides
//    @Named("blue")
//    public Cloth getBlueCloth() {
//        Cloth cloth = new Cloth();
//        cloth.setColor("蓝色");
//        return cloth;
//    }

//    @Provides
//    public Cloth getRedCloth() {
//        Cloth cloth = new Cloth();
//        cloth.setColor("红色");
//        return cloth;
//    }

}
