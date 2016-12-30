package com.lucidastar.testdagger2;

/**
 * Created by hanxiaoxing on 16/12/30.
 */

public class ClothHandler {


    public Clothes handle(Cloth cloth){
        return new Clothes(cloth);
    }
}
