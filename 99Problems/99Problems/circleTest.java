import java.util.Scanner;

public class circleTest extends Circle{

	public circleTest(int a) {
		super(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sf = new Scanner(System.in);
		
		System.out.println("Please enter in a integer radius value");
		
		int h = Sf.nextInt();
		
		Circle test = new Circle(h);
		System.out.println(test.getArea(radius));
		
	}

}
