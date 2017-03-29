package com.dhbw.dhbw2017.programming.inheritance;

public class Bus extends Vehicle {

	public Bus() {
		maxPassengers=14;
	}
	
	@Override
	public void startEngine() {
		System.out.print("Hmmm");
		super.startEngine();
	}
	
	@Override
	public void accelerate() {
		speed += 7;
	}
	
	@Override
	public void decelerate() {
		speed -= 15;
	}
}
