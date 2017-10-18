import java.util.Arrays;

public class InsertionSort{

	public static void sort(double[] a){
		   
		for (int n = a.length-2 ; n >= 0; n--) {
			
		double aTemp = a[n];
		int i = n;
			
	    while (i < a.length-1 && aTemp > a[i+1]){
			a[i] = a[i+1];
			i++;
		}
         a[i] = aTemp;

		}	
	}
	
}

