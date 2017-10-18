import java.util.ArrayList;

public class IndexEntry {

	private String word;
	private ArrayList<Integer> numsList;
		
	public IndexEntry(String temp){
		word = temp.toUpperCase();
		numsList = new ArrayList<Integer>();
	}
	
	 void add(int num){
		if(!numsList.contains(num)){
			numsList.add(num);
		}
	}
	String getWord(){
		return word;
	}
	public String toString(){
		return getWord() + numsList;
	}
	
	
}
