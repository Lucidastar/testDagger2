package com.lucidastar.testdagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created by hanxiaoxing on 16/12/30.
 */

@Module
public class FirstModule {


    private String trouserName;

    private int trouserLen;
    @PerActivity
    @Provides
    public Cloth getRedCloth() {
        Cloth cloth = new Cloth();
        cloth.setColor("红色");
        return cloth;
    }

    @PerActivity
    @Provides
     public Clothes getClothes(){
       Clothes clothes = new Clothes();
        Cloth cloth = new Cloth();
        cloth.setColor("lanse");
        clothes.setCloth(cloth);
         return clothes;
     };

    @PerActivity
    @Provides
    Integer len(){
        return trouserLen;
    }



//
//    @PerActivity
//    @Provides
//    public ClothHandler getClothHandler(){
//        return new ClothHandler();
//    }
}
