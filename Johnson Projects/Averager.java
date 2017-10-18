import java.util;
import java.io;
import java.text;

public class Program001
{
	public static void main(String[] args)
	{
		Scanner Sc= new Scanner(System.in);
		
		double N1,N2,N3,Ans;
		
		System.out.println("Insert your first number");
		N1 = Sc.nextDouble();

		System.out.println("Insert your second number");
		N2 = Sc.nextDouble();

		System.out.println("Insert your third number");
		N3 = Sc.nextDouble();

		Ans = (N1+N2+N3)/3.0;

		if (Avg>=70)
			System.out.println("You have passed, congrats");
		else
			System.out.println("You have failed... my condolences");
	}
}