import java.util.Scanner;

public class Cylinder {

	private Circle base;
	private static int height;
	static int radius;
	double area;
	
	
	public Cylinder(int r, int h){
		
		Circle base = new Circle(r);
		area = base.getArea(r);
		height = h;
		
	}
	
	public double getVolume(){
		return area*height;
	}

}
