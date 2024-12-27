package com.heima.test;

public class StudentTest {
    public static void main(String[]args) {
    	//创建对象
    	//调用空参构造
    	//Student s = new Student();
    	
    	Student s = new Student("张三",23);
    	System.out.println(s.getName());
    	System.out.println(s.getAge());
    }
}
