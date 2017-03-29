package com.dhbw.dhbw2017.programming.inheritance;

public class Vehicle {

	boolean engineRuninning = false;
	int speed = 0;
	/***
	 * Direction of the car
	 * 0 means north
	 * 1 means east
	 * 2 means south
	 * 3 means west
	 */
	int heading = 0;
	
	public void startEngine(){
		engineRuninning = true;
		System.out.println("Engine is running");
	}
	
	public void stopEngine(){
		engineRuninning = false;
		System.out.println("Engine is turned off");
	}
	
	public void accelerate(){
		speed++;
	}
	
	public void decelerate(){
		speed--;
	}
	
	public void steerLeft(){
		if(heading == 0){
			heading = 3;
		}else{
		heading-- ;
		}
	}
	
	public void steerRight(){
		if(heading == 3){
			heading = 0;
		}else{
		heading++ ;
		}
	}
	
	
}