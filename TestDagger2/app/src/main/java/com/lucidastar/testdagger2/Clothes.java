package com.lucidastar.testdagger2;

/**
 * Created by hanxiaoxing on 16/12/30.
 */

public class Clothes
{
    private Cloth mCloth;

    public Clothes() {
    }

    public Clothes(Cloth cloth) {
        mCloth = cloth;
    }

    public Cloth getCloth() {
        return mCloth;
    }

    @Override
    public String toString() {
        return mCloth.getColor()+"衣服";
    }
}
