import java.util.Scanner;

public class cylinderTest extends Cylinder {
	
	public cylinderTest(int r, int h) {
		super(r, h);
	}

	public static void main(String[] args) {
		
		Scanner Sf = new Scanner(System.in);
		
		System.out.println("Please enter in an integer radius value");
		
		int first = Sf.nextInt();
		
		System.out.println("Please enter in an integer height value");

		int second = Sf.nextInt();
		
		Cylinder test = new Cylinder(first,second);
		
		System.out.println(test.getVolume());
		
		
	}

}
