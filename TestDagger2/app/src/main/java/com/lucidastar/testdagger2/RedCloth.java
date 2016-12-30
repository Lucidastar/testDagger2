package com.lucidastar.testdagger2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by hanxiaoxing on 16/12/30.
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface RedCloth {
}
