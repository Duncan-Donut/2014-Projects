import java.io.PrintStream;

public class LSE_java_crackme
{
  public LSE_java_crackme() {}
  
  public static void main(String[] paramArrayOfString) {
	  
    int[] arrayOfInt1 = { 229, 102, 166, 229, 227, 205, 80, 224, 122, 168, 56, 185, 1, 154, 43, 127, 139, 83, 211, 202, 240 };
    int[] arrayOfInt2 = { 212, 7, 249, 175, 162, 155, 49, 191, 62, 247, 90, 214, 108, 248, 116, 62, 255, 60, 190, 163, 155 };
    int i = 1;
    
    char[] originalParam = new char[21];
    
    int k = 0;
    while (k < arrayOfInt1.length) {
      originalParam[k] = (char) (arrayOfInt1[k] ^ arrayOfInt2[k]);
      k++;
    }
    
    for(int p = 0; p<21;p++){
    	System.out.print(originalParam[p]);
    }
    System.out.println();
    
    
    if (paramArrayOfString.length == 0) {
      System.out.println("Usage: ./crackme password");

    }
    else if (paramArrayOfString[0].length() != arrayOfInt1.length) {
      System.out.println("Wrong!");
    }
    else {
      int j = 0;
      while (j < arrayOfInt1.length) {
        if ((paramArrayOfString[0].charAt(j) ^ arrayOfInt1[j]) != arrayOfInt2[j]) {
          i = 0;
        }
        j++;
      }
      if (i != 0) {
        System.out.println("Success!");
      }
      else {
        System.out.println("Wrong!");
      }
    }
  }
}

/*Input 21 characters

Initial XOR Array1 has to == Array 2




*/