package com.oops.ClassAndObjects;

public class MainClass {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "Black";
		c1.model = "Honda City";
		c1.fuel = FUEL_TYPE.PETROL;
		c1.transmission = TRANSMISSION.AUTOMATIC;

		c1.drive();
		
		Car c2 = new Car();
		c2.color = "White";
		c2.model = "Ciaz";
		c2.fuel = FUEL_TYPE.DIESEL;
		c2.transmission = TRANSMISSION.MANUAL;

		c2.drive();

	}

}
