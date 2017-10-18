import java.util.ArrayList;

public class LipogramAnalyzer {
	
	private String lipoString;
	
	public LipogramAnalyzer(String text){
		lipoString = text;
	}
	
	public String mark(char Letter){
		String letter = Letter + "";
		return lipoString.replaceAll(letter, "#");
	}
	
	public String allWordsWith(char Letter){
		
		 String[] words = lipoString.split(" ");    
		
		 String answer = "";
		 
		 for ( String ss : words) {

			   if(answer.contains(ss)){
							
			   }
				else
					
					if(ss.indexOf(Letter) != -1){
						answer = answer.concat(ss);
						answer = answer.concat("\n");
					}
		}
		 
			return answer;
		      
	 }
	
		
		
		
	

		
		
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
