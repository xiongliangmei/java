package com.annotation;
@DBtable
public class Test2 {
    public static void main(String[] args) {

        DBtable d =  Test.class.getAnnotation(DBtable.class);
        System.out.println(d.tableName());
    }
}
