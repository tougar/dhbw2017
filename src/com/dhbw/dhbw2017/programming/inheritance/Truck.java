package com.dhbw.dhbw2017.programming.inheritance;

public class Truck extends Vehicle {

	public Truck() {
		maxPassengers=2;
	}
	@Override
	public void startEngine() {
		System.out.print("Brooom  ");
		super.startEngine();
	}
	
	
	@Override
	public void accelerate() {
		speed += 2;
	}
	
	@Override
	public void decelerate() {
		speed -= 5;
	}
	
}
