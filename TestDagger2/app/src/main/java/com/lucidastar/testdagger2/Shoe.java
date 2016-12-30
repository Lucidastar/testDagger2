package com.lucidastar.testdagger2;

import javax.inject.Inject;

/**
 * Created by hanxiaoxing on 16/12/30.
 */

public class Shoe {

    @Inject
    public Shoe() {
    }

    @Override
    public String toString() {
        return "鞋子";
    }
}
