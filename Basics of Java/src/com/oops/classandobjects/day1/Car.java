package com.oops.classandobjects.day1;

enum FUEL_TYPE {
	PETROL, DIESEL, CNG, ELECTRIC
}

enum TRANSMISSION {
	AUTOMATIC, MANUAL
}

public class Car {
	String model;
	String color;
	FUEL_TYPE fuel;
	TRANSMISSION transmission;

	void drive() {
		System.out.println(
				"Model=" + model + ", Color=" + color + ",Fuel Type=" + fuel + ",Transmission=" + transmission);
	}

}
