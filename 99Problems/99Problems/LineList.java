import java.util.ArrayList;

public class LineList {

	ArrayList<String> list;
	
	LineList(){
		list = new ArrayList<String>();
	}
	
	int size(){
		return list.size();
	}
	String get(int k){
		return list.get(k);
		
	}
	void add(String line){
		list.add(line);
	}
	String remove(int k){
		return list.remove(k);
		
	}
	
	void move(int index, int newIndex){
		if(newIndex >= index){
			list.add(newIndex,list.get(index));
			list.remove(index);
		}
		else{
			list.add(newIndex,list.get(index));
			list.remove(index+1);
		}
				
	}
	
	void shuffle(){
		int n = size()-1;
		while(n >= 2){
			int random = (int)Math.random()*n;
			move(n,random);
			n--;
			
		}
	}
	
	
	
}
