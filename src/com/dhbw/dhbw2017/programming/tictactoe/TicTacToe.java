package com.dhbw.dhbw2017.programming.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	
	static char [][] playground = {{' ',' ',' '}, {' ',' ',' '}, {' ',' ',' '}};
	static char currentPlayer ='x';

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to TicTacToe 2017");
		printPlayground();
		while(true){
			System.out.println("Player "+currentPlayer+", please make your choice:");
			System.out.println("Enter the number of the row (0-2):");
			int row = Integer.valueOf(scanner.nextLine());
			System.out.println("Enter the number of the column (0-2):");
			int column = Integer.valueOf(scanner.nextLine());
			placeElement(currentPlayer, column, row);
			printPlayground();
			check3inARow();
			checkAllBoxedFilled();
			switchPlayer();
		}
		
	}
	
	private static void checkAllBoxedFilled() {
		
		for (char[] rows : playground) {
			for (char column : rows) {
				if(column == ' ') return;
			}
		}
		System.out.println("Game Over: Draw! All fields are taken.");
		System.exit(0);
	}

	private static void check3inARow() {

if(playground[0][0] != ' ' && playground[0][0] ==  playground[0][1] && playground[0][2] == playground [0][0]){
	win();
}

if(playground[1][0] != ' ' && playground[1][0] ==  playground[1][1] && playground[1][2] == playground [1][0]){
	win();
}

if(playground[2][0] != ' ' && playground[2][0] ==  playground[2][1] && playground[2][2] == playground [2][0]){
	win();
}

if(playground[0][0] != ' ' && playground[0][0] ==  playground[1][0] && playground[2][0] == playground [0][0]){
	win();
}
if( playground[0][1] != ' ' && playground[0][1] ==  playground[1][1] && playground[2][1] == playground [0][1]){
	win();
}
if(playground[0][2] != ' ' && playground[0][2] ==  playground[1][2] && playground[2][2] == playground [0][2]){
	win();
}

if( playground[0][0] != ' ' && playground[0][0] ==  playground[1][1] && playground[2][2] == playground [0][0]){
	win();
}

if(playground[0][2] != ' ' && playground[0][2] ==  playground[1][1] && playground[2][0] == playground [1][1]){
	win();
}
	
	
	}

	private static void win() {
		System.out.println("Game over: Player " + currentPlayer +" won.");
		System.exit(0);
	}

	public static void switchPlayer(){
		if(currentPlayer=='x'){
			currentPlayer = 'o';
		}else{
			currentPlayer='x';
		}
	}

	/***
	 * Prints the playground
	 */
	public static void printPlayground(){
		System.out.println(playground[0][0] + " | " + playground[0][1] + " | " + playground[0][2]);
		System.out.println("---------");
		System.out.println(playground[1][0] + " | " + playground[1][1] + " | " + playground[1][2]);
		System.out.println("---------");
		System.out.println(playground[2][0] + " | " + playground[2][1] + " | " + playground[2][2]);
	}
	/***
	 * Marks the choice of the player on the playground.
	 * @param player
	 * @param column
	 * @param row
	 */
	public static void placeElement(char player, int column, int row ){
		if(player == 'o' || player == 'x'){
			if(playground[row][column]== ' '){
		playground[row][column] = player;
			}else{
				System.out.println("This field is already taken.");
			}
		}else{
			System.out.println("Please only choose x or o");
		}
	}
}
