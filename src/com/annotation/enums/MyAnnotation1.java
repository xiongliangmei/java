package com.annotation.enums;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation1 {
    String color() default "blue";  //颜色,缺省属性
    String value();
    int[] arrayAttr() default {1,2,3};  ///添加一个int类型数组的属性,缺省属性
    EumTrafficLamp lamp()default EumTrafficLamp.RED; //添加一个枚举的属性,缺省属性
    MetaAnnotation annotationAttr() default @MetaAnnotation("xdp");  ////为注解添加一个注解类型的属性,并指定注解属性的缺省值
}
