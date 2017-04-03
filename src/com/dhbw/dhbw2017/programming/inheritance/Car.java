package com.dhbw.dhbw2017.programming.inheritance;

public class Car extends Vehicle{

	public Car(){
		maxPassengers = 4;
	}
	@Override
	public void startEngine() {
		System.out.print ("Wroom  ");
		super.startEngine();
	}
	
	public void accelerate(){
		
		int newSpeed = speed + 10;
		
		switch (gear) {
		case 1:
			if(newSpeed>=0 && newSpeed < 30){
				speed = newSpeed;
			}else{
				System.out.println("Please change gear");
			}			
			break;
		case 2:
			if(newSpeed>=15 && newSpeed <= 50){
				speed = newSpeed;
			}else{
				System.out.println("Please change gear");
			}		
			break;
		case 3:
			if(newSpeed>=30 && newSpeed <= 70){
				speed = newSpeed;
			}else{
				System.out.println("Please change gear");
			}		
			break;
		case 4:
			if(newSpeed>=50 && newSpeed <= 100){
				speed = newSpeed;
			}else{
				System.out.println("Please change gear");
			}		
			break;
		case 5:
			if(newSpeed>=80 && newSpeed < 150){
				speed = newSpeed;
			}else{
				System.out.println("Please change gear");
			}		
			break;	
		case 0: System.out.println("Please change gear"); break;
		case -1: 
			if(speed <=0 && newSpeed >= -50){
				speed = newSpeed;

			} else{
				System.out.println("Please change gear");
			}
		}
	}
	
	@Override
	public void decelerate() {
		speed -= 20;
	}
	
	
public void shift(int targetGear){
		
		switch (targetGear) {
		case 1:
			if(speed>=0 && speed < 30){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;
		case 2:
			if(speed>=15 && speed <= 50){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;
		case 3:
			if(speed>=30 && speed <= 70){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;
		case 4:
			if(speed>=50 && speed <= 100){
				gear = targetGear;
				System.out.println("Shifted into gear "+gear);
			}else{
				System.out.println("Wrong speed for gear "+gear);
			}			
			break;
		case 5:
			if(speed>=80 && speed < 150){
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
