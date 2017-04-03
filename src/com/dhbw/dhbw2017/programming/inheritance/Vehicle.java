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
	public int currentPassengers=0;
	public int maxPassengers=1;
	/***
	 *  0 = 'N' neutral gear
	 *  positive -> forward gears
	 *  -1 = 'R' reverse gear
	 */	
	int gear = 0;
	
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
	
	public void board(){
		if(currentPassengers < maxPassengers){
			if(speed!=0){
				System.out.println("Vehicle is in motion. Please stop first");
			}else{
				System.out.println("Boarding successful");
				currentPassengers++;
			}
		}else{
			System.out.println("Vehicle is already full");
		}
	}
	
	public void unboard(){
		if(currentPassengers<=0){
			System.out.println("Can't unboard. Vehicle is already empty");
		}else if(speed != 0){
			System.out.println("Vehicle is in motion. Please stop first");
		} else {
			if(engineRuninning==true){
				System.out.println("Warning engine is running");
		 }
		 currentPassengers--;
		 System.out.println("Unboarding successful");
		 
		}		
	}
	
	public void shift(int targetGear){
		
		switch (targetGear) {
		case 1:
			if(speed>=0 && speed < 10){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;
		case 2:
			if(speed>=5 && speed <= 20){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;
		case 3:
			if(speed>=10 && speed <= 30){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;
		case 4:
			if(speed>=20 && speed <= 50){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;
		case 5:
			if(speed>=45 && speed < 70){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;	
			
		case 6:
			if(speed>=60 && speed < 90){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;	
			
			
		case 7:
			if(speed>=80 && speed < 110){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;	
			
		case 8:
			if(speed>=90 && speed < 120){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;	
		case 9:
			if(speed>=100 && speed < 130){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;
		case 0: gear = 0; break;
		case -1: 
			if(speed <=0){
				gear = -1;
				System.out.println("Shifted into reverse gear");
			} else{
				System.out.println("Wrong speed for gear "+gear);
			}
			
			
		default:
			System.out.println("Please select a valid gear");
			break;
		}
		
	}
	
	
}
