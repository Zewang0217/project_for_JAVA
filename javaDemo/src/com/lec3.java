package com;

public class lec3 {
	public static void main(String[] args) {
		int[] values = { 2, 3, 4, 5, 6, 4, 7};
		int[] newArr = new int[5];
		newArr[2] = 43;
		int size = values.length;
		System.out.println(values[3]);
		System.out.println(size);
		
		//looping through an array
		int[] values1 = new int[5];
		for(int i = 0; i < values1.length; i++) {
			values1[i] = i;
			int y = values[i] * values[i];
			System.out.println(y);
		}
		System.out.println("");
		//Example 2
		int[] value2 = new int[5];
		int i = 0;
		while(i < value2.length) {
			value2[i] = i;
			int y = value2[i] * value2[i];
			System.out.println(y);
			i++;
		}
	}
	
}
