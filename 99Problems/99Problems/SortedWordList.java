import java.util.ArrayList;

public class SortedWordList extends ArrayList<String> {

	
	SortedWordList(){
		super();
	}
	
	SortedWordList(int x){
		super(x);
	}
	
	public boolean contains(String word){
		
		if(super.size() > 1){
			int left = 0;
			int right = super.size()-1;
			int middle = (left+right)/2;
			int diff = word.compareTo(super.get(middle));
		
			while(left <= right){
				if(diff < 0){
					right = middle -1;
				}
			
				else if (diff >0){
					left = middle + 1;
				}
				else{
					return true;	
				}
			}
		}
		return false;
		
	}
	
	public int indexOf(String test){
		if(super.size() > 1){
			int left = 0;
			int right = super.size()-1;
			int middle = (left+right)/2;
			int diff = test.compareTo(super.get(middle));
			
			while(left <= right){
				if(diff < 0){
					right = middle -1;
				}
				else if (diff >0){
					left = middle + 1;
				}
				else{
					return middle;
				}	
			}
		}
		return -1;
	}
	
	public String set(int i, String word){
		
		if(word.compareTo(super.get(i)) == 0){
			throw new IllegalArgumentException("word=" + word + " i=" + i);
		}
		else if(i==0  && word.compareTo(super.get(1)) < 0){
			super.set(i, word);
		}
		else if(word.compareTo(super.get(i+1)) < 0 && word.compareTo(super.get(i-1)) > 0){
			super.set(i, word);
		}
		else{
			throw new IllegalArgumentException("word=" + word + " i=" + i);
		}
			
		return "";
	
	}
	
	public void add(int i, String word){
		
		if(super.size() > 2 && i < super.size()){
			
				if(word.compareTo(super.get(i)) == 0){
					throw new IllegalArgumentException("word=" + word + " i=" + i);
				}
				else if(i==0  && word.compareTo(super.get(i+1)) < 0){
					super.add(i, word);
				}
				else if(word.compareTo(super.get(i))< 0 && word.compareTo(super.get(i-1)) > 0){
					super.add(i, word);
				}
				else{
					throw new IllegalArgumentException("word=" + word + " i=" + i);
				}
		}
		
		else{
		
			super.add(i,word);
		}
		
		
	}
	
	public boolean add(String word){
		
		if(super.contains(word)){
			return false;
		}
		else{
			if(super.size() >= 2){
				int left = 0;
				int right = super.size()-1;
				int middle = (left+right)/2;
				int diff = word.compareTo(super.get(middle));
				
				while(left <= right){
					
					if(diff < 0){
						right = middle -1;
					}
					else if (diff > 0){
						left = middle + 1;
					}
					else{
						super.add(left,word);
						return true;
					}
				}	
			}
			else{
				if(super.size() == 0){
					super.add(word);
				}
				
				if(super.size() == 1 && word.compareTo(super.get(0))< 0){
					super.add(0,word);
				}
				else{
					super.add(word);
				}
				
				
			}
			
				
				
		}
			
		return false;
	
	}
	
	
	
}
	
