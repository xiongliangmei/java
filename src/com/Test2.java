package com;

import java.lang.reflect.Constructor;

/***
 * 反射获取构造器并且实列化
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
         Class stu =  Class.forName("com.Student");

         //获取所有的公有构造方法
        Constructor[] conArray = stu.getConstructors();
        for (Constructor c:conArray) {
            System.out.println(c);
        }

        Constructor stuNull = stu.getConstructor(null);

        System.out.println(stuNull);

        System.out.println("=============================================================");

        Constructor stuChar = stu.getConstructor(char.class);

        System.out.println(stuChar);

        System.out.println("==============================================================");
        //获取所有的构造方法（包括私的默认的,受保护的）
        Constructor[] conArray1 = stu.getDeclaredConstructors();
        for (Constructor c:conArray1) {
            System.out.println(c);
        }
        System.out.println("==============================================================");



        //实列化构造器
        stu.getConstructor(String.class,int.class).newInstance("黎明",30);


        stu.getConstructor(null).newInstance(null);

        //调用私有方法
        Constructor conns = stu.getDeclaredConstructor(int.class);
        conns.setAccessible(true);
        conns.newInstance(1);

        System.out.println("=============================================================");

    }
}
