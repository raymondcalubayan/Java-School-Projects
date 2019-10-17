/*
 * Name: Raymond Calubayan
 * 
 * Brief description: This program takes data from a file containing an array of doubles the 
 * user provides and sorts it in descending order, from largest to smallest.
 * 
 * Due Date: 11/15/18
 * 
 * Pseudocode:
 * 				-User is prompted to enter the file name
 * 				-Count is initialized to 0 for the array
 * 				-Scanner reads the file by line while count increments
 * 				-The insertionSort method is called to print the contents of the file in descending order
 * 				-Exceptions are thrown for NumberFormat, InputMismatch, FileNotFound, ArrayIndexOutOfBounds, and 
 * 				NullPointer. All other exceptions are handled by the default exception.
 * 				-The program ends
 */

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
	public static void main (String[] args) 
	{ 
		try 
		{
			Scanner input = new Scanner (System.in);

			System.out.println("Please enter the file name: ");

			String filename = input.nextLine();

			File file = new File(filename);

			Scanner scan = new Scanner(file);      

			int count = 0;

			while (scan.hasNextDouble()){
				count++;
				System.out.println(scan.nextDouble());
			}

			double[] listreturn = InsertionSortClass.insertionSort(count, filename);
			System.out.print("\n");
			for (int i = 0; i < listreturn.length; i++) {

				System.out.print(listreturn[i] + "\n");
			}

			System.out.println("");
			System.out.println("Thank you for using the program!" + "\n" + "Raymond Calubayan");
			input.close();
			scan.close();
		}
		catch (NumberFormatException e){
			System.out.println("The file contains values which are not numbers. Please check your file and try again.");
		}
		catch (InputMismatchException e){
			System.out.println("Bad data in the file");
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out of Bounds! Please check your file and try again.");
		}
		catch (NullPointerException e){
			System.out.println("Null Pointer Exception. Please check your file and try again.");
		}
		catch (FileNotFoundException e){
			System.out.println("File Not Found. Please check your file and try again.");
		}
		catch (Exception ex){
			System.out.println(ex.toString());
		}	
	}
}

