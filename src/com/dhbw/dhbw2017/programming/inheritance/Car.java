package com.dhbw.dhbw2017.programming.inheritance;

public class Car extends Vehicle{

	@Override
	public void startEngine() {
		System.out.print ("Wroom  ");
		super.startEngine();
	}
	
	public void accelerate(){
		speed += 10;
	}
	
	@Override
	public void decelerate() {
		speed -= 20;
	}
	
	
	
	
}
