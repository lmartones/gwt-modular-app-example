package com.test.entites;

public class Car {
	public String color;

	public Car(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car {color:" + color + "}";
	}

}
