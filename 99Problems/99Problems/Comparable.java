
public class Comparable {
	
	double comparer;
	
	public Comparable(){
		comparer = 0; 
	}
	
	public Comparable(double x){
		comparer = x;
	}
	
	public boolean compareTo(QuadraticFunction a, QuadraticFunction b){
		
		double afirst = a.getFirst() * a.getFirst() * comparer;
		double bfirst = b.getFirst() * b.getFirst() * comparer;
		
		if(afirst == bfirst){
			
			double asec = a.getSecond() * comparer;
			double bsec = b.getSecond() * comparer;
			
			if(asec == bsec){
				
				double athird = a.getThird();
				double bthird = b.getThird();
				if(athird == bthird){
					return true;
				}
			}
			
		}
		
		
		return false;
		
	}
	
}
