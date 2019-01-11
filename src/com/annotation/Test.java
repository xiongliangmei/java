package com.annotation;
@DBtable
public class Test {
    public static void main(String[] args) {
         DBtable d =  Test.class.getAnnotation(DBtable.class);
        System.out.println(d.tableName());
    }
}
