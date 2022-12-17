package Restaurant;

import java.util.Scanner;

class Mainmenu {
	static boolean ordering = true;
	public double subTotal;
	public static double runningprice;
	public static double itemPrice;
	static Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.println("Welcome to OurRestaurant to order Press \n1 For Pizza ($29.00) \n2 For Burger ($17.50)\n3 For Biryani ($49.00) \n4 To exit menu ");
	}

	public static double itemPrice(int foodItem) {
		if (foodItem == 1) {
			// burger= $29.00
			System.out.println("You've ordered a Pizza");
			itemPrice = 29.00;
		}
		if (foodItem == 2) {
			// fries = $17.50
			System.out.println("You've ordered Burger");
			itemPrice = 17.50;
		}
		if (foodItem == 3) {
			// soda = $49.00
			System.out.println("You've ordered a Biryani");
			itemPrice = 49.00;
		}
		quantity();
		return itemPrice;
	}

	public static double subTotal(double quantity, double itemPrice) {
		double subTotal = quantity * itemPrice;
		System.out.println("Subtotal: " + subTotal);
		runningprice += subTotal;
		return subTotal;
	}

	public static double quantity() {
		System.out.println("Enter quantity");
		double quantity = sc.nextDouble();
		subTotal(quantity, itemPrice);
		return quantity;
	}

	public static void done() {
		ordering = false;
		System.out.println("Total Amount + Taxes\n"+(runningprice/.9));
		System.out.println("Enjoy your meal\nVisit again");
	}

	public class Restaurant {
		public static void main(String[] args) {
			int menuOption;
			int foodItem = 0;
		    runningprice = 0;
			do {

				menu();
				menuOption = sc.nextInt();
				switch (menuOption) {
				case 1:
					foodItem = 1;
					itemPrice(foodItem);
					break;
				case 2:
					foodItem = 2;
					itemPrice(foodItem);
					break;
				case 3:
					foodItem = 3;
					itemPrice(foodItem);
					break;
				case 4:
					done();
					break;
				default:
					System.out.println("Invalid option.");
				}

			} while (ordering);

		}
	}
}
