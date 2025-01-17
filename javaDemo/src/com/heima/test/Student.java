package com.heima.test;

public class Student {
	//属性
	String name;
	int age;
	
	//如果我们自己没有加任何一个构造方法
	//那么虚拟机会给我们一个空参构造法
	public Student() {
		System.out.println("看看我执行了没？");
	}
	//有参构造
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
//一个Java文件中可以定义多个class，且只能一个类是public修饰，而且public修饰的类名必须成为代码文件名
//实际开发中建议还是一个文件定义一个class类
//定义成员变量： 修饰符（暂时空） 数据类型 变量名称 = 初始化值（一般无需指定初始化值，存在默认值，默认值为0，0.0，false，null）
