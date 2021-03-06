package com.basilgregory.onam.annotations;

import com.basilgregory.onam.android.FetchType;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by donpeter on 9/1/17.
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface OneToMany{
    short fetchType() default FetchType.LAZY;
    String referencedColumnName() default  "";
    Class targetEntity() default Object.class;
}
