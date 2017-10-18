/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card one = new Card("Ace","Diamond",1);
		Card two = new Card("Ace","Diamond",1);
		Card three = new Card("Two","Spades",2);
		
		//card one
		System.out.println(one.suit());
		System.out.println(one.rank());
		System.out.println(one.pointValue());
		System.out.println(one.toString());
		System.out.println(one.matches(two));
		
		//card two
		System.out.println(two.suit());
		System.out.println(two.rank());
		System.out.println(two.pointValue());
		System.out.println(two.toString());
		System.out.println(two.matches(three));
		
		//card three
		System.out.println(three.suit());
		System.out.println(three.rank());
		System.out.println(three.pointValue());
		System.out.println(three.toString());
		System.out.println(three.matches(one));
		
				
	}
}
