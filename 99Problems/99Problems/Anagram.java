import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	private static String[] words;
	private static ArrayList<String> matches;
	
	
	public static String[] reader() throws FileNotFoundException{

		File file = new File("words.txt");
		
		Scanner Sf = new Scanner(file);
		
		words = new String[19912];

		int i = 0;
		while(Sf.hasNext()) {
		    words[i] = Sf.nextLine();
		    i++;
		}
		
		return words;
		
	}
	
	public static Integer[] maker(String word){
		
		Integer[] numbers = new Integer[27];
		for(int i = 0 ;i <27;i++){
			numbers[i] = 0;
		}
			
			for(int z = 0; z < word.length(); z++){	
				
				Character p = word.charAt(z);
				
				int placement = 0 ;
				
				switch(p){
				case 'a' : placement = 1;break;
				case 'b' : placement = 2;break;
				case 'c' : placement = 3;break;
				case 'd' : placement = 4;break;
				case 'e' : placement = 5;break;
				case 'f' : placement = 6;break;
				case 'g' : placement = 7;break;
				case 'h' : placement = 8;break;
				case 'i' : placement = 9;break;
				case 'j' : placement = 10;break;
				case 'k' : placement = 11;break;
				case 'l' : placement = 12;break;
				case 'm' : placement = 13;break;
				case 'n' : placement = 14;break;
				case 'o' : placement = 15;break;
				case 'p' : placement = 16;break;
				case 'q' : placement = 17;break;
				case 'r' : placement = 18;break;
				case 's' : placement = 19;break;
				case 't' : placement = 20;break;
				case 'u' : placement = 21;break;
				case 'v' : placement = 22;break;
				case 'w' : placement = 23;break;
				case 'x' : placement = 24;break;
				case 'y' : placement = 25;break;
				case 'z' : placement = 26;break;
				}
				
				numbers[placement]++;
				
			}
		
		return numbers;
	
	}
	
	
	public static ArrayList<String> comparer (Integer[] numbers, String[] words){
		
		
		matches = new ArrayList<String>();
		
		String done;
		
		for( String x : words){
			
			Integer[] temp = maker(x);
			done = x;
			boolean b = true;
			
			for (int i = 0; i < 27; i++) {
              
				if (!(numbers[i].equals(temp[i])) && (numbers[i] != 0 || temp[i] != 0)) {
                    b = false;    
                }                
			
			}
			
			
			if(b == true){
		       matches.add(done);
		    }
			
			
			
		}
		
		return matches;
		
	}
	
	public static ArrayList<String> altsorter(String original, String[] words){
		
		matches = new ArrayList<String>();
			
		for(String x: words){
			
			char[] ori = original.toCharArray();
			char[] xi = x.toCharArray();
			Arrays.sort(ori);
			Arrays.sort(xi);
			
			String a = new String(ori);
			String b = new String(xi);
			
			int count = 0;
			
			if(a.length() == b.length()){
				for(int i =0; i< a.length();i++){
					if(a.charAt(i) == b.charAt(i)){
						count++;
					}
				}
			}
			
			
			if (count == a.length()){
				matches.add(x);
			}
			
				
		}
		
		return matches;
		
	}
	
	
	
	

	public static void main(String[] args) throws FileNotFoundException {
		reader();
		
		altsorter("ramblecs",words);
		
		for(String x : matches){
			System.out.println(x);
		}
		
		
		
		
	}
	

}
