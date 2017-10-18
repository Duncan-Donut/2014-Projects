
public class QuadraticFunction extends Comparable {
	
	int first, second, third;
	
	public QuadraticFunction(int a, int b, int c){
		first = a;
		second = b;
		third = c;
	}
	
	public double valueAt(double x){
		
		double part1 = first * first * x;
		double part2 = second * x;
		double part3 = third;
		
		double total = part1 + part2 + part3;
		
		return total;
	}
	
	@Override
	public String toString(){
		
		String fin = "";
	
		if(first == 1){
			fin += "x^2";
		}
		else if(first == -1){
			fin += "-x^2";
		}
		else{
			fin += "" + first + "x^2";
		}
		
		if(second == Math.abs(second)){
			fin += "+" + second + "x";
		}
		else{
			fin +=  second + "x";
		}
		
		if(third == Math.abs(third)){
			fin+= "+" + third;
		}
		else{
			fin += third;
		}
		return fin;
		
	}
	
	public Integer getFirst(){

		return first;
		
	}
	public Integer getSecond(){

		return second;
		
	}
	public Integer getThird(){

		return third;
		
	}
	
	
	@Override
	public boolean equals(Object o){
		if(((QuadraticFunction) o).getFirst() == this.getFirst() && ((QuadraticFunction) o).getSecond() == this.getSecond() && ((QuadraticFunction) o).getThird() == this.getThird() ) {
	
					return true;
		}
		
		
		return false;
		
	}
	
	
	 public static void main(String[] args){
		 QuadraticFunction x = new QuadraticFunction(1,2,3);
		 QuadraticFunction y = new QuadraticFunction(2,2,3);
		
		 Comparable b = new Comparable(4);
		 
		 
		 System.out.println(b.compareTo(x, y));
		 
	 }
	
	
}
