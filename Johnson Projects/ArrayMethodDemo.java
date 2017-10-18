//Duncan Rowe
//10/17/16 This program uses multiple methods on an array

public class ArrayMethodDemo{
	
	//Constant
	final static int LIMITER = 25;
	final static int SIZE = 10;
	final static int MAX = 50;
	
	public static void main(String[] args){	
		
		//Making the array
		int[] numbers = new int[SIZE];
		
		for(int x = 0; x < 10; x++){
			numbers[x] = (int) (Math.random()*MAX)+1;
		}
		
		//Using Methods
		displayArray(numbers);
		displayReverse(numbers);
		displaySum(numbers);
		displayLimiter(numbers);
		displayNumbersGreaterThanAverage(numbers);
		
	}
	
	//Methods
	
	public static void displayArray(int[] array){
		
		System.out.println("This is the normal array");
		for(int x = 0; x < array.length; x++){
			System.out.print(array[x] + " ");	
		}
		System.out.println();
		
	}
	
	public static void displayReverse(int[] array){
		
		System.out.println("This is the reverse array");
		for(int x = array.length-1; x >= 0; x--){
			System.out.print(array[x] + " ");	
		}
		System.out.println();
		
	}
	public static void displaySum(int[] array){
		
		int sum = 0;
		
		System.out.println("This is the sum of the array");
		for(int x = 0; x < array.length; x++){
			sum+=array[x];	
		}
		System.out.println(sum);
		
	}
	
	public static void displayLimiter(int[] array){
		
		System.out.println("This are the numbers less than the limiter of the array");
		for(int x = 0; x < array.length; x++){
			if(array[x] < LIMITER){
				System.out.print(array[x] + " ");
			}
		}
		System.out.println();
		
	}
	
	public static void displayNumbersGreaterThanAverage(int[] array){
		
		//Integers
		int sum = 0;
		int average;
		
		System.out.println("This are the numbers less than the average of the array");
		for(int x = 0; x < array.length; x++){
			sum+=array[x];	
		}
		
		average = (int) (sum/array.length);
		
		System.out.println("The average is " + average);
		
		for(int y = 0; y < array.length; y++){
			if(array[y] > average){
				System.out.print(array[y] + " ");
			}
		}
		System.out.println();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}