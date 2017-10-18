import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HSCTF_coinflip {

	public static void main(String[] args) throws IOException {
	       
	    BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Duncan\\Desktop\\a.txt"));
	    int line = 4;
	    
	    //001111101011
	    
	    int count = 1;
	    boolean done = false;
	    ArrayList<Integer> total = new ArrayList<Integer>();
	    
	    for(int p=0; p<25;p++){
	    	total.add(0);
	    }
	    
	    br.read();
	    
	    int word = br.read();
	    
	    while((line=br.read()) != -1) {	
	    	
	    	if(line != word){
	    		int temp = total.get(1);
	    		total.set(1,temp+1);
	    		count = 1;
	    		word = line;
	    	}
	    	else{
	    		count++;
	    		word = line;
	    		line = br.read();
	    		while(line == word){
	    			word = line;
	    		    line = br.read();
                    count++;
	    		} 
	    		word = line;
	    		
	    		int temp = total.get(count);
	    		total.set(count,temp+1);
	    		count = 1;
	    				
	    	}
	    }
	    
	   for(int x:total){
		   System.out.print(x+", ");
	   }

		



		
		
	}

}
