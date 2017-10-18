
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x = 1; x < 100;x++){
			int y = Integer.parseInt(Integer.toHexString(x));
			System.out.println(y);
			int z = Integer.parseInt(Integer.toHexString(x));
			while( y % 10 == 0 ){
				y = y /10;
			}
			if( y < 9){
				Integer.parseInt(Integer.toHexString(x));
			}
			
			
			
		}
		

		
		
		

	}

}
