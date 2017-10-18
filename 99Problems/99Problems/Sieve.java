// Sieve of Eratosthenes

public class Sieve
{
  // Returns an array isPrime of n elements;
  // isprime[p] is set to true if and only if p is a prime
  public static boolean[] markPrimes(int n)
  {  
   
	  boolean[] isPrime = new boolean[n]; // all set to false by default
    
  
    isPrime[0] = isPrime[1] = false; // optional
    
    
	for (int i = 2; i < n; i++){ // {false, false, true, true,..., true}
      if(i == 2 || (i%2 == 1 && i > 1)){ 
    	  isPrime[i] = true;
      }
    }
    
     /*
     * Yes, the for loop time can be decrease by starting the for loop at the square of
     * the number. It also makes sure that p is less than Math.sqrt(n) because beyond that number,
     * we would have already checked because we started at p squared.
     */
	
    for (int p = 3; p < 8; p+=2)
    {
      if (isPrime[p] && p <= Math.sqrt(n))  // if isPrime[p] is true
      {
        for (int i = p*p; i < n; i += p)
          isPrime[i] = false;
      }
    }
    
    
    /*
     * this is for number 5 - which doesn't really make sense because isPrime[2*6+1] or 13 is prime
     * but isPrime[6] should not be set to true then because 6 is not prime.
    for(int i =0;i<(n/2);i++){
    	
    	if(isPrime[(i*2)+1] == true ){
    		isPrime[i] = true;
    	}
    	else{
    		isPrime[i] = false;
    	}
    	*/
    	
    	
    }
    
    
    
  
    
    return isPrime;
  }
    
  public static void main(String[] args)
  {
    int n = 120;
    boolean[] isPrime = markPrimes(n);
    int count = 0;
    
    for (int p = 0; p < n; p++)
      if (isPrime[p])
      {
        System.out.print(p + " ");
        count++;
      }
    System.out.println();
    System.out.println(count + " primes under " + n);
  }  
}
