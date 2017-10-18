import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Password {
	String St,Sf,setPassword,secPass;
	public static void main(String[] args) throws IOException {
		System.out.println("Now try and enter your password");
		Scanner Sk = new Scanner(new File("test.dat"));
		Scanner UserInput = new Scanner(System.in);
		String t = UserInput.nextLine();
				if(t.equals(Sk.nextLine())){
					System.out.println("Error password mismatch try again");
					String p = UserInput.nextLine();
					if(p.equals(Sk.nextLine())){
						System.out.println("Congradulations you have seen a double password.");
					}
				}
				else{
					System.out.println("Error password mismatch");
	}
	}
}
