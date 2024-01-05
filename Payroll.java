/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.payroll;

/**
 *
 * @author nivasharma
 */
import java.util.Scanner;

public class Payroll {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Employee's name:");
		String name = input.next();
		System.out.print("Enter number of hours worked:");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate:");
		double hourlyRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate:");
		double fedTaxWithholdingRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate:");
		double stateTaxWithholdingRate = input.nextDouble();
		
		//note the usefulness of setting variables here
		double grossPay = hourlyRate * hoursWorked;
		double fedWithholding = grossPay * fedTaxWithholdingRate;
		double stateWithholding = grossPay * stateTaxWithholdingRate;
		double totalDeduction = fedWithholding + stateWithholding;
		double netPay = grossPay - totalDeduction;
		
		System.out.println("Employee name: " + name);
		System.out.println("Hours Worked: " + hoursWorked);
		System.out.println("Pay Rate: " + hourlyRate);
		System.out.println("Gross pay: " + grossPay);
		System.out.println("Deductions: ");
		System.out.println("\tFed Withholding (" + fedTaxWithholdingRate*100 +
				"): " + fedWithholding);
		System.out.println("\tState Withholding (" + stateTaxWithholdingRate*100 +
				"): " + stateWithholding);
		System.out.println("\tTotal Deduction: " + totalDeduction);
		System.out.println("Net Pay: " + netPay);


	}
}


