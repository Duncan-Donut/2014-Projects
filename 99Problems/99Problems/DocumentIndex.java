import java.util.ArrayList;
import java.util.List;

public class DocumentIndex extends ArrayList<IndexEntry> {
	
	public DocumentIndex(){
		super();
	}
	public DocumentIndex(int a){
		super(a);
	}
	
	void addWord(String word,int num){
		int pos = foundOrInserted(word);
		for(int i =0;i<super.size();i++){
		if(super.get(i).getWord() == word){
			super.get(i).add(pos);
		}
		}
		
		
	}
	void addAllWords(String str, int num){
		
		String[] temp = str.split("\\W+");
		int y =0;
		for(String x:temp){
			y++;
			if(!x.isEmpty()){
				addWord(x,num);
			};
		}
	}
	private int foundOrInserted(String word){
		
		for(int i =0;i<super.size();i++){
			if(word == super.get(i).getWord()){
				return i;
			}
			else{
				int compare = word.compareTo(super.get(i).getWord());
				if(compare > 0){
					IndexEntry name = new IndexEntry(word);
					super.add(i-1,name);
					return i-1;
				}
				
			}
		}
		
		
		return modCount;
		
	}
	
	
	
}
