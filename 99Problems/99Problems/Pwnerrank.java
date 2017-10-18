import java.util.Scanner;

public class Pwnerrank {

	public static void main(String[] args) {
		 
			    int i;
			    String answer = "h1w^r2v2rr1og^4r52mclx_b0ee^1r?";
			    Scanner Sf = new Scanner(System.in);
			    String serial = Sf.next();
			    
			    char[] c = answer.toCharArray();
			    char[] a = serial.toCharArray();

			    for(i = 0; i < serial.length();i++){
			    	char temp = (char) (c[i] ^ (i%2));
			    	System.out.print(temp);
			    }
			    
			    /*
			    if (answer.length() == serial.length()) {s
			      for (i = 0; i < serial.length() && ((c[i] ^ (i % 2)) == a[i]); i++);
			     
			      if (i - 1 == serial.length())
			       System.out.println("correct");
			    }
			    */
	}

	
	//h0v^r2v2rr0nf^4r42lblx^b0dd^0r>
}
