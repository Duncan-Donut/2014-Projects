import java.util;
import java.io;
import java.text;

public class Program004
{
	public static void main(String[] args)
	{
		Scanner Sc= newScanner (System.in);

		double N1,N2,N3,Ans;

		System.out.println(" We will find the largest of the three numbers");

		System.out.println("Enter the first number");

		N1= Sc.nextDouble();

		System.out.println("Enter the second number");

		N2= Sc.nextDouble();

		System.out.println("Enter the third number");

		N3= Sc.nextDouble();

		Ans= (N1+N2+N3)/3.0;

		if (N1=N2 || N2=N3 || N1=N3)
			system.out.println("Two of your numbers are equal")
		else
			if (N1>N2 && N1>N3)
				system.out.println("Your first number was the biggest");

			else if (N2>N3)
				system.out.println("Your second number was the biggest");
			else
				system.out.println("Your third number was the biggest");
	}
}
		
