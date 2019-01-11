package com;

public class Test1 {
    public static void main(String[] args)throws Exception {
         // 共有三种反射方式得到对象

        //第一种
         Student stu1 = new Student();
         Class<?> stuClass = stu1.getClass();

         //第二种
         Class<?> stu2 = Student.class;

         //第三种

         Class<?> stu3 = Class.forName("com.Student");
    }
}
