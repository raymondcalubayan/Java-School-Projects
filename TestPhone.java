/* Name: Raymond Calubayan
 * 
 * Description: This program displays information about different Smartphones and their specifications. 
 * Some methods in this program include one for determining the tax, and another for determining if the 
 * phone is affordable.
 * 
 * Due Date: 10/18/18
 * 
 */

import java.util.Scanner;

public class TestPhone {


	public static void main(String[] args) {
		Phone phone1 = new Phone("Samsung", 128, "Galaxy S9", 700.00);
		System.out.println(phone1.getBrand());
		System.out.println(phone1.getCapacity());
		System.out.println(phone1.getModel());
		System.out.println(phone1.getPurchaseprice());
		System.out.println("\n");
		System.out.println(phone1.toString());
		System.out.println("\n");

		Phone phone2 = new Phone("Apple", 64, "iPhone xS", 1000.00);
		System.out.println(phone2.getBrand());
		System.out.println(phone2.getCapacity());
		System.out.println(phone2.getModel());
		System.out.println(phone2.getPurchaseprice());
		System.out.println("\n");
		System.out.println(phone2.toString());
		System.out.println("\n");

		Phone phone3 = new Phone();
		phone3.setBrand("Apple");
		phone3.setCapacity(64);
		phone3.setModel("iPhone xS");
		phone3.setPurchaseprice(1000.00);
		System.out.println("\n");
		System.out.println(phone1.equals(phone2));
		System.out.println("\n");
		System.out.println(phone2.equals(phone3));
		System.out.println("\n");

		Scanner scanner = new Scanner (System.in);

		System.out.println("What is the tax rate?");
		double taxRate = scanner.nextDouble();
		System.out.println("The amount in tax you will pay for the phone is: $ " + phone1.calculateTax(taxRate));

		Scanner scan = new Scanner (System.in);
		System.out.println("\n");
		System.out.println("What is your budget?");
		double budget = scanner.nextDouble();
		System.out.println("\n");

		boolean iCanAfford = phone1.isAffordable(budget);
		if (iCanAfford == true)
			System.out.println("You can afford this phone.");
		else 
			System.out.println("This phone is too expensive.");
		System.out.println("\n");
		System.out.println("Thank you for using the program!");
		System.out.println("Raymond Calubayan");

	}

}
