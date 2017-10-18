import java.util.*;

public class Program012{
	public static void main(String[] args)
	{
		Scanner Sc = new Scanner(System.in);
		double number;
		double c;

		System.out.println("Insert your number here");
		number = Sc.nextDouble();
		
		c=0;

		for (int i=1;i<=number;i++) 
		
			if (number%i == 0)
				c++;
		if (c==2)
			System.out.println("Your number is prime");
		else
			System.out.println("Your number is composite");
		
		
		
	}
}