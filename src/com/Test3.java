package com;

import java.lang.reflect.Field;

/***
 * 反射获取字段
 */
public class Test3 {
    public static void main(String[] args) throws Exception {

           Class clazz = Class.forName("com.Student");

           //获取公有的成员变量
           Field[] fields = clazz.getFields();
           for (Field f:fields) {
                  System.out.println(f);
           }
           System.out.println("========================================");
           //获取指定字段
           Field name = clazz.getField("name");
           System.out.println(name);

           //获取所有的成员变量 公有的,私有的,默认的
           Field[] fields1 = clazz.getDeclaredFields();
           for (Field f:fields1) {
            System.out.println(f);
           }

           System.out.println("==============================================");
           //获取所有的成员变量 公有的,私有的,默认的 根据名称查询
           Field field = clazz.getDeclaredField("sex");
           System.out.println(field.getName());
    }
}
