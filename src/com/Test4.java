package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/***
 * 反射获取方法
 */
public class Test4 {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("com.Student");

        //获取公有的方法
        Method[] methods = clazz.getMethods();
        for (Method m:methods) {
            System.out.println(m);
        }
        System.out.println("==========================================");
        //获取公有方法中的方法  具体的公有方法
        Method method = clazz.getMethod("show1", String.class);
        System.out.println(method);
        System.out.println("==========================================");

        //获取全部的方法(公有的,私有的,默认的,受保护的)
        Method[] methods1 = clazz.getDeclaredMethods();
        for (Method m:methods1) {
            System.out.println(m);
        }
        System.out.println("===========================================");
        //具体的方法
        Method method1 = clazz.getDeclaredMethod("show4",int.class);
        System.out.println(method1);

        System.out.println("===========================================");
        //实力化 调用方法

        Object obj = clazz.getConstructor().newInstance();
        Method m = clazz.getMethod("show1",String.class);

        m.invoke(obj,"liudehua");

    }
}
