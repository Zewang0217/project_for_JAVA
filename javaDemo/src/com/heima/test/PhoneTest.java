package com.heima.test;

public class PhoneTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		//给手机赋值
		p.brand = "小米";
		p.price = 1999;
		//获取手机对象的值
		System.out.println(p.brand);
		System.out.println(p.price);
		//调用手机中的方法
		p.call();
		p.playGame();
		
		Phone p2 = new Phone() ;
		p2.brand = "apple";
		p2.price = 8999;
		
		p2.call();
	}
}
//小结：
//类：共同特征的描述
//对象：真实存在的具体实例
//public class 类名{
//成员变量（代表属性,名词）
//成员方法（代表行为 call，动词）
//}
//类名 对象名 = new 类名（）；
//对象.成员变量/方法
/*JavaBean类：不写main方法
 * 测试类：带main方法的
 */
