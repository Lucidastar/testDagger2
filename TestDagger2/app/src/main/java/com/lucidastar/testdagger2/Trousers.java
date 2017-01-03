package com.lucidastar.testdagger2;

import javax.inject.Inject;

/**
 * Created by hanxiaoxing on 17/1/3.
 */

public class Trousers {

    private String name;
    private int leg;

    @Inject
    public Trousers() {

    }

    public Trousers(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public String toString() {
        return "Trousers";
    }
}
