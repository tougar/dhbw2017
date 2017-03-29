package com.dhbw.dhbw2017.programming.inheritance;

public class Main {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Vehicle v;
		Vehicle b = new Bus();
		Vehicle t = new Truck();
		
		
		v= new Car();
		Vehicle [] vehicles = {vehicle, car, v, b, t};
		
		for (Vehicle vehicle2 : vehicles) {
			vehicle2.board();
			vehicle2.startEngine();
			System.out.println("Value of engine running: "+vehicle2.engineRuninning);
			vehicle2.accelerate();
			System.out.println("Current speed: "+vehicle2.speed);
			vehicle2.steerLeft();
			vehicle2.board();
			vehicle2.unboard();
			vehicle2.decelerate();
			System.out.println("Current speed: "+vehicle2.speed);

			vehicle2.unboard();
		}
		
		
		
	}

}
