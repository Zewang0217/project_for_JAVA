package com;

public class assign3 {
	//find the fastest one
	public static int timeIndex(int[] times) {
		int fastest = 999;
		int index = 0;
		for(int i = 0; i < times.length; i++) {
			if(times[i] < fastest) {
				fastest = times[i];
				index = i;
			}
		}
		return index;
	}
	//find the second
	public static int timeSecond(int first, int[] times) {
		int fastest = 999;
		int index = 0;
		for(int i = 0; i < times.length; i++) {
			//排除最快的,其余一致
			if(i == first) {
				continue;
			}
			if(times[i] < fastest) {
				fastest = times[i];
				index = i;
			}
		}
		return index;
	}
	
	
	
	public static void main(String[] args) {
		String[] names = {
				"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
				"Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
				"Aaron", "Kate"
				};
		int[] times = {
				341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
				343, 317, 265
				};
		
	int firstIndex = 0;
		int secondIndex = 0;
		firstIndex = timeIndex(times);
		secondIndex = timeSecond(firstIndex,times);
		System.out.println(names[firstIndex]);
		System.out.println(names[secondIndex]);
		
	}
}
