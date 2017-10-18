import java.util.Scanner;

//class name
public class Circle {

	//field name
	static int radius;
	
	//constructor
	public Circle(int a){	
		radius = a;
	}
	
	//method that calculates the area
	public double getArea(double r){
		return r*r*Math.PI;
	}
	
	//accessory method - gets radius
	public int getradius(){
		return radius;
	}

		
}
