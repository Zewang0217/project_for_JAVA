package com;


public class Assignment2 {
	public static double caculate(int time, double basicSalary) {
		//判断是否大于40
		if(time <= 40 && time >= 0)
		{
			return basicSalary * time;
		}
		else if(time > 40)
		{
			return basicSalary * (40 + 1.5 * (time - 40)); 
		}
		//计算工资
		//返回
		return 0;
	}
	public static void main(String[] args) {
		double res =caculate(35,7.50);
		System.out.println(res);
	}
	
}
