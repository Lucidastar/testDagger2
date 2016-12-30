package com.lucidastar.testdagger2;

/**
 * Created by hanxiaoxing on 16/12/30.
 */

public class Cloth {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color+"布料";
    }
}
