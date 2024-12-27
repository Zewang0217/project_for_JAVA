package com;

//将 Baby 类移到外部
public class Baby {
	// 字段
	String name; // 名字
	double weight = 5.0; // 体重，默认初始值
	boolean isMale; // 性别
	int numPoops = 0; // 初始排便次数
	Baby[] siblings; // 兄弟姐妹

	// 构造函数
	public Baby(String myname, boolean maleBaby) {
		name = myname;
		isMale = maleBaby;
	}

	// 方法：打印问候
	void sayHi() {
		System.out.println("Hi, my name is " + name + ".");
	}

	// 方法：吃东西
	void eat(double foodWeight) {
		if (foodWeight >= 0 && foodWeight < 10) { // 假设最大吃的量为10
			weight += foodWeight;
			System.out.println(name + " just ate " + foodWeight + " kg of food!");
		} else {
			System.out.println("Food weight is not valid.");
		}
	}

	// 方法：排便
	void poop() {
		numPoops++;
		System.out.println(name + " has pooped. Total poops: " + numPoops);
	}

	public static void main(String[] args) {
		// 创建 Baby 对象
		Baby ourBaby = new Baby("Shiloh Jolie-Pitt", true);

		// 调用方法
		ourBaby.sayHi(); // 打印问候
		ourBaby.eat(2.0); // 吃 2.0 kg 的食物
		ourBaby.poop(); // 排便
		System.out.println("Current weight is: " + ourBaby.weight + " kg");
	}
}
