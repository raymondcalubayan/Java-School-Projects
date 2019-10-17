/* Name: Raymond Calubayan
 * 
 * Description: This is the User interface class.
 * 
 * Due Date: 11/1/18
 */

import java.util.Scanner;

public class UserInterface {
	public static void main (String args[]){

		PhoneStore verizonStore = new PhoneStore();

		verizonStore.add("Apple", 64, "iPhone XR", 749.99);
		verizonStore.add("Apple", 256, "iPhone XS Max", 1249.99);
		verizonStore.add("Apple", 512, "iPhone XS", 1349.99);
		verizonStore.add("Samsung", 64, "Galaxy S8", 600.00);
		verizonStore.add("Samsung", 64, "Galaxy S9", 720.00);
		verizonStore.add("LG", 64, "Q7", 500.00);
		verizonStore.add("LG", 64, "G7", 600.00);
		verizonStore.add("Google", 128, "Pixel 3", 799.99);
		verizonStore.add("OnePlus", 256, "6", 629.00);
		verizonStore.add("Alcatel", 4, "GO FLIP", 75.00);
		verizonStore.add("ZTE", 16, "Blade X", 109.99);
		verizonStore.add("Coolpad", 16, "Canvas", 49.99);

		Scanner scan = new Scanner (System.in);

		System.out.println("Do you want to search for phone? Please enter: (Yes/No)");
		String answer = scan.nextLine();

		while (answer.equalsIgnoreCase("Yes")){
			System.out.println("Please enter a phone model: ");
			String modelSearched = scan.nextLine();
			Phone found = verizonStore.findPhone(modelSearched);
			System.out.println("\n");
			if (found == null)
				System.out.println("Phone not found.");
			else 
				System.out.println(found);
			System.out.println("\n");
			System.out.println("Do you want to search for phone? Yes or No?");
			answer = scan.nextLine();
		}
		System.out.println("\n");
		System.out.println("Thank you for using the Phone Store program!");
		System.out.println("Raymond Calubayan");
		scan.close();
	}

}
