//Duncan
//10/18/2016
import java.util.Scanner;

public class BadScriptCaught{

	public static void main(String[] args){
		
	//Variables
	String[] names = {"Bruce","Pranav","Duncan","Max","Wassim","Peter","Sid","Milan","Antti","Tanto"};
	int number;
	
	//Input
	Scanner input = new Scanner(System.in);
	
	//Try catch loop
	try{
		System.out.println("Please enter an integer");
		number = input.nextInt();
		System.out.println("Here is the name " + names[number]);
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println(e.getMessage() + " is your error");
	}
		
	
	}	


}
		