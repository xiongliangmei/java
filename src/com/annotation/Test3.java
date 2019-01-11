package com.annotation;

@MyAnnotation("test3")
public class Test3 {
    public static void main(String[] args) {
        MyAnnotation m = Test3.class.getAnnotation(MyAnnotation.class);
        System.out.println(m.value());
    }
}
