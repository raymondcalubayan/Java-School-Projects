/* Raymond Calubayan 
 * Program #2 - This program accepts zip codes as input and displays information about the US Congressional representative 
 * corresponding to that zip code. 
 * Due Date: 9/27/18
 * 
 * Test Cases:
 * 
 * Input value: 55119
 * Output: 
 		Betty McCollum 
 		Minnesota 
 		4th District 
 		Democrat
 * 
 * Input value: 123 
 * Output: Zip code must be 5 digits 
 * 
 * Input value: abc
 * Output: Please only enter numbers for the zip code
 * 
 * Input value: 90210
 * Output: No data available for this zip code 
 */

import java.util.Scanner;

public class ProgramTwo {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		boolean toContinue = true;
		int zipLength;
		String enteredZip;

		while (toContinue) {
			System.out.println("Enter a zip code (or 0 to quit): ");
			enteredZip = scan.nextLine();
			int enteredZipInt;
			try {
				enteredZipInt = Integer.parseInt(enteredZip);
			} catch (Exception ex) {
				System.out.println("Please only enter numbers for the zip code");
				continue;
			}
			if (enteredZipInt == 0) {
				toContinue = false;
				break;
			} else if (enteredZipInt <= 9999 || enteredZipInt >= 99999) {
				// Tests if the zip is 5 characters long
				System.out.println("Zip code must be 5 digits");
				continue;

			}  else if (enteredZipInt == 55119) {
				System.out.println("\n Betty McCollum \n Minnesota \n 4th District \n Democrat");
				System.out.println();
				continue;

			} else if (enteredZipInt == 92126) {
				System.out.println("\n Scott H. Peters \n California \n 52nd District \n Democrat");
				System.out.println();
				continue;
				
			} else if (enteredZipInt == 94015) {
				System.out.println("\n Jackie Speier \n California \n 14th District \n Democrat");
				System.out.println();
				continue;
				
			} else if (enteredZipInt == 96734) {
				System.out.println("\n Tusli Gabbard \n Hawaii \n 2nd District \n Democrat");
				System.out.println();
				continue;
				
			} else if (enteredZipInt == 99501) {
				System.out.println("\n Don Young \n Alaska \n At-Large District \n Republican");
				System.out.println();
				continue;
				
			} else if (enteredZipInt == 10004) {
				System.out.println("\n Jerrold Nadler \n New York \n 10th District \n Democrat");
				System.out.println();
				continue;
				
			} else if (enteredZipInt == 70116) {
				System.out.println("\n Cedric L. Richmond \n Louisiana \n 2nd District \n Democrat");
				System.out.println();
				continue;
				
			} else if (enteredZipInt == 90704) {
				System.out.println("\n Alan S. Lowenthal \n California \n 47th District \n Democrat");
				System.out.println();
				continue;
				
			} else if (enteredZipInt == 97214) {
				System.out.println("\n Earl Blumenauer \n Oregon \n 3rd District \n Democrat");
				System.out.println();
				continue;
				
			} else if (enteredZipInt == 96815) {
				System.out.println("\n Colleen Hanabusa \n Hawaii \n 1st District \n Democrat");
				System.out.println();
				continue;
				
			} else {
				System.out.println("No data available for this zip code");
				
			}
		}
		System.out.println("Thank you for using the program!");
		System.out.println("-Raymond Calubayan");
	}
}
