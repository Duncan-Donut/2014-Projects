//Duncan Rowe
//10/11/16 Prompts the user for information on taxes

import java.util.Scanner;

public class PrepareTax{
	
	//Variables
	public static String socialSecurity;
	public static String lastName;
	public static String firstName;
	public static String address;
	public static String city;
	public static String state;
	public static String zipCode;
	public static String martialStatus;
	public static int annualIncome;
		
	public static void main(String[] args){
		
		prompter();
		
		//Objects
		TaxReturn tax = new TaxReturn(socialSecurity,lastName,firstName,address,city,state,zipCode,annualIncome,martialStatus);
		tax.taxLiability(annualIncome,martialStatus);
		System.out.println("This is your tax liability " + tax.getTaxLiability());
	}
	
	//Methods
	public static void prompter(){
		
		//Input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your Social Security number");
		socialSecurity = input.next();
		
		while(socialSecurity.charAt(3) != '-' || socialSecurity.charAt(6) != '-'){
				System.out.println("Please enter in your social security number properly");
				socialSecurity = input.next();
		}
		
		System.out.println("Please enter your last name");
		lastName = input.next();
		
		System.out.println("Please enter your first name");
		firstName = input.next();
		
		System.out.println("Please enter your address");
		address = input.next();
		
		System.out.println("Please enter your city");
		city = input.next();
		
		System.out.println("Please enter your state");
		state = input.next();
		
		System.out.println("Please enter your zipcode");
		zipCode = input.next();
		
		while(zipCode.length() != 5){
			System.out.println("Please enter in your zipcode properly");
			zipCode = input.next();
		}
		
		System.out.println("Please enter your martial status");
		martialStatus = input.next();
		
		while(martialStatus.charAt(0) != 'S' && martialStatus.charAt(0) != 's' && martialStatus.charAt(0) != 'M' && martialStatus.charAt(0) != 'm') {
			System.out.println("Please enter in your martial status properly");
			martialStatus = input.next();
		}
		
		System.out.println("Please enter your annual income");
		annualIncome = input.nextInt();
		
		while(annualIncome < 0){
			System.out.println("Please enter in your annual income properly");
			annualIncome = input.nextInt();
		}
	
	}
	
	
	
}