import java.util;
import java.io;
import java.text;

public class Program003
{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		
		double N1,N2;
		
		System.out.println("We are going to find the larger number")

		System.out.println("Enter your first number")

		N1= Sc.nextDouble();

		System.out.println("Enter your second number")

		N2= Sc.nextDouble();

		if (N1=N2)
			system.out.println("Your two numbers are equal")
			if (N1>N2)
				system.out.println("Your first number is larger than your second");

			else
				system.out.println("Your second number is larger than your first");
	}
}