/* Raymond Calubayan 
Program #1 - This program calculates the amount to pay their employees, before and after taxes, and total taxes withheld.   
Due date: 9/13/18
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class ProgramOne {
	public static void main(String[] args) {
		DecimalFormat decform = new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of first employee: ");
		String employeeOneName = scan.nextLine();
		System.out.println("Enter hourly rate of first employee: ");
		double employeeOneRate = scan.nextDouble();
		System.out.println("Enter number of hours worked by first employee: ");
		double hoursWorkedEmployeeOne = scan.nextDouble();
		scan.nextLine();
		System.out.println("Enter name of second employee: ");
		String employeeTwoName = scan.nextLine();
		System.out.println("Enter hourly rate of second employee: ");
		double employeeTwoRate = scan.nextDouble();
		System.out.println("Enter number of hours worked by second employee: ");
		double hoursWorkedEmployeeTwo = scan.nextDouble();
		scan.nextLine();
		System.out.println("Enter name of third employee: ");
		String employeeThreeName = scan.nextLine();
		System.out.println("Enter hourly rate of third employee: ");
		double employeeThreeRate = scan.nextDouble();
		System.out.println("Enter number of hours worked by third employee: ");
		double hoursWorkedEmployeeThree = scan.nextDouble();
		scan.nextLine();
		System.out.println("Enter the tax rate (between 0 and 1.0): ");
		double taxRate = scan.nextDouble();
		double employeeOneBeforeTax = employeeOneRate * hoursWorkedEmployeeOne;
		double employeeTwoBeforeTax = employeeTwoRate * hoursWorkedEmployeeTwo;
		double employeeThreeBeforeTax = employeeThreeRate * hoursWorkedEmployeeThree;
		double employeeOneTaxes = employeeOneBeforeTax * taxRate;
		double employeeTwoTaxes = employeeTwoBeforeTax * taxRate;
		double employeeThreeTaxes = employeeThreeBeforeTax * taxRate;
		double employeeOneAfterTax = employeeOneBeforeTax - employeeOneTaxes;
		double employeeTwoAfterTax = employeeTwoBeforeTax - employeeTwoTaxes;
		double employeeThreeAfterTax = employeeThreeBeforeTax - employeeThreeTaxes;
		double totalTaxes = employeeOneTaxes + employeeTwoTaxes + employeeThreeTaxes;
		System.out.println(employeeOneName + "'s pay before taxes: $" + decform.format(employeeOneBeforeTax));	
		System.out.println(employeeTwoName + "'s pay before taxes: $" + decform.format(employeeTwoBeforeTax));
		System.out.println(employeeThreeName + "'s pay before taxes: $" + decform.format(employeeThreeBeforeTax));
		System.out.println("\n");
		System.out.println(employeeOneName + "'s taxes: $" + decform.format(employeeOneTaxes));
		System.out.println(employeeTwoName + "'s taxes: $" + decform.format(employeeTwoTaxes));
		System.out.println(employeeThreeName + "'s taxes: $" + decform.format(employeeThreeTaxes));
		System.out.println("\n");
		System.out.println(employeeOneName + "'s pay after taxes: $" + decform.format(employeeOneAfterTax));
		System.out.println(employeeTwoName + "'s pay after taxes: $" + decform.format(employeeTwoAfterTax));
		System.out.println(employeeThreeName + "'s pay after taxes: $" + decform.format(employeeThreeAfterTax));
		System.out.println("\n");
		System.out.println("Total taxes withheld: $" + decform.format(totalTaxes));
		System.out.println("\n");
		System.out.println("Raymond Calubayan");
	}
}
	