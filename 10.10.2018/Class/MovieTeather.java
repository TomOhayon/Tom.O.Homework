<<<<<<< HEAD
package com.example.configServer;

import java.util.Scanner;

public class MovieTeather {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 70;
		int max = 90;
		Seat M[][] = new Seat[4][3];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = new Seat(((Math.random()*(max-min))+min),false);
			}
		}
		System.out.println("Please enter number desired seats:");
		int order=scan.nextInt();
		int count = 0;
		 while (count<=order) {
			System.out.println("please enter row & colmn:");
			int row=scan.nextInt();
			int col=scan.nextInt();
			if (M[row][col].isTaken()==true){
				System.out.println("this place is taken, please choose another");
			}else{
				M[row][col].setTaken(true);
				count++;
			}
			
		}
				
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.println("row:"+ i + " , colmn:" + j);
				System.out.println("seat price" + M[i][j].getPrice());
				System.out.println("seat vacancy:" + M[i][j].isTaken());
			}
		}
		
	}

}
=======
package com.example.configServer;

import java.util.Scanner;

public class MovieTeather {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = 70;
		int max = 90;
		Seat M[][] = new Seat[4][3];
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = new Seat(((Math.random()*(max-min))+min),false);
			}
		}
		System.out.println("Please enter number desired seats:");
		int order=scan.nextInt();
		int count = 0;
		 while (count<=order) {
			System.out.println("please enter row & colmn:");
			int row=scan.nextInt();
			int col=scan.nextInt();
			if (M[row][col].isTaken()==true){
				System.out.println("this place is taken, please choose another");
			}else{
				M[row][col].setTaken(true);
				count++;
			}
			
		}
				
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.println("row:"+ i + " , colmn:" + j);
				System.out.println("seat price" + M[i][j].getPrice());
				System.out.println("seat vacancy:" + M[i][j].isTaken());
			}
		}
		
	}

}
>>>>>>> 2133c8c4794f80f89b92069f0e5a1ebd1e238051
