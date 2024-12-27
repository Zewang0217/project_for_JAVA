package com;

public class Car {
	String make;
	String model;
	int year;
	
	public Car(String mymake,String mymodel, int myyear) {
		make = mymake;
		model = mymodel;
		year = myyear;
	}
	public void startEngine() {
		System.out.println("The " + make + " " + model + " engine started.");
	}
	
}
