package com.heima.test;

import java.util.Scanner;

public class Stdin {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("请输入第一个整数"); int num1
		 * = sc.nextInt(); System.out.println(num1); System.out.println("请输入第二个整数"); int
		 * num2 = sc.nextInt(); System.out.println(num2);
		 */

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("请输入一个字符转串"); String
		 * str1 = sc.next(); System.out.println(str1); System.out.println("请输入第二个字符串");
		 * String str2 = sc.next(); System.out.println(str2);
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符转串");
		String line1 = sc.nextLine();
		System.out.println(line1);
		System.out.println("请输入二个字符转串");
		String line2 = sc.nextLine();
		System.out.println(line2);
	}

}
