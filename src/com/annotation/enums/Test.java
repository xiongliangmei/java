package com.annotation.enums;

@MyAnnotation1(color = "red",value = "test",arrayAttr = {2},lamp = EumTrafficLamp.RED,annotationAttr=@MetaAnnotation("dps"))
public class Test {
    public static void main(String[] args) {
        MyAnnotation1 myAnnotation1 = Test.class.getAnnotation(MyAnnotation1.class);
        System.out.println(myAnnotation1.color() +":"+myAnnotation1.value()+":"+myAnnotation1.arrayAttr().length+":"+myAnnotation1.lamp()+":"+myAnnotation1.annotationAttr().value());
    }
}
