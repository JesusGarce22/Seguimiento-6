package ui;

import java.util.Scanner;

import model.Conjunto;

public class Main {

	public static Scanner sn=new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] X= new String[4];
		
		Conjunto a=new Conjunto(X);
		
		int option=menu();

		switch(option) {
		case 1:
			a.crearConjunto();
			break;
		case 2:
			a.union();
			break;

		case 3:
			a.interseccion();
			break;
		case 4:
			a.diferencia();
			break;

		case 5:

			System.out.println("has successfully exited the games");
			System.exit(0);
			break;
		}
		
	}
	
	public static int menu() {
		int menu=0;
		System.out.println("                         MAIN  MENU                                                        ");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Enter (1) create a set.");
		System.out.println("Enter (2) to perform a union of two sets");
		System.out.println("Enter (3) to perform an intersection of two sets");
		System.out.println("Enter (4) to make a symmetric difference between two sets.");
		System.out.println("Enter (5) for out the program.");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("Choose the option of your liking");
		menu=sn.nextInt();
		sn.nextLine();

		return menu;
	}
}
