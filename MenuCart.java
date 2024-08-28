package projects;

import java.util.Scanner;

public class MenuCart {
	public static void main(String[] args) {
		System.out.println("---------------------------------");
		System.out.println("Welcome to E-Commerce Application");
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("Select category");
		System.out.println("1. Men's");
		System.out.println("2. Womens");
		System.out.println("3. Kids");
		System.out.println("4. Exit");
		System.out.println();
		System.out.println("Enter Your Choice: ");
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		
		switch (userChoice) {
			case 1: 
				System.out.println("--------------------------");
				System.out.println("Welcome to Men's Selection");
				System.out.println("--------------------------");
				System.out.println("Select Cateogy");
				System.out.println("1. Shirts");
				System.out.println("2. T-Shirts");
				System.out.println("3. paints");
				System.out.println("4. Shoes");
				
				System.out.println("Enter Your Choice: ");
				int mensSide = sc.nextInt();
				switch(mensSide) {
					case 1:
						System.out.println("Men's T-Shirts");
						break;
					case 2:
						System.out.println("Men's Shirts");
						break;
					case 3:
						System.out.println("Men's Paints");
						break;
					case 4:
						System.out.println("Men's Shoes");
						break;
					default :
						System.out.println("Invalid input, please try again....");
				}
			break;
			case 2:
				System.out.println("----------------------------");
				System.out.println("Welcome to Women's Selection");
				System.out.println("----------------------------");
				System.out.println("Select Cateogy");
				System.out.println("1. Dresses");
				System.out.println("2. T-Shirts");
				System.out.println("3. Sarees");
				System.out.println("4. Shoes");
				
				System.out.println("Enter Your Choice: ");
				int womensSide = sc.nextInt();
				switch(womensSide) {
					case 1:
						System.out.println("Women's Dresses");
						break;
					case 2:
						System.out.println("Women's T-Shirts");
						break;
					case 3:
						System.out.println("Sarees");
						break;
					case 4:
						System.out.println("Women's Shoes");
						break;
					default :
						System.out.println("Invalid input, please try again....");
				}
			break;
			case 3:	
				System.out.println("----------------------------");
				System.out.println("Welcome to Women's Selection");
				System.out.println("----------------------------");
				System.out.println("Select Cateogy");
				System.out.println("1. Dresses");
				System.out.println("2. T-Shirts");
				System.out.println("3. Shirts");
				System.out.println("4. Shoes");
				
				System.out.println("Enter Your Choice: ");
				int kidsSide = sc.nextInt();
				switch(kidsSide) {
					case 1:
						System.out.println("Kid's Dresses");
						break;
					case 2:
						System.out.println("Kid's T-Shirts");
						break;
					case 3:
						System.out.println("Kid's Shirts");
						break;
					case 4:
						System.out.println("Kid's Shoes");
						break;
					default :
						System.out.println("Invalid input, please try again....");
				}
			break;
			case 4:
				System.out.println("Vist Again 🙏🏻🙏");
			break;
			default :
				System.out.println("Invalid input, please try again....");
				
		}
		
	}
}
