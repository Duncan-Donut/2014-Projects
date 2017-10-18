import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class Ifstatements
  {
  	public static void P01()
  	  {
		int N;
		
  		Scanner Sc = new Scanner(System.in);

  	  	System.out.println("The Presidents Problem");
  	  	System.out.println("Enter an integer from 1-44.  I will tell you the president's name.");
  	  	N = Sc.nextInt();
  	  	if(N==1)
  	  		System.out.println("George Washington");
  	  	else if(N==2)
  	  		System.out.println("John Adam")
  	  	else if(N==3)
  	  		System.out.println("Jefferson")
  	  	else if(N==4)
  	  		System.out.println("Madison")
  	  	else if(N==5)
  	  		System.out.println("Monroe")
  	  	else if(N==6)
  	  		System.out.println("Adam's")
  	  	else if(N==7)
  	  		System.out.println("Jackson")
  	  	else if(N==8)
  	  		System.out.println("Van Buren")
  	  	else if(N==9)
  	  		System.out.println("Harrison")
  	  	else if(N==10)
  	  		System.out.println("Tyler")
  	  	else if(N==11)
  	  		System.out.println("Polk")
  	  	else if(N==12)
  	  		System.out.println("Taylor")
  	  	else if(N==13)
  	  		System.out.println("Fillmore")
  	  	else if(N==14)
  	  		System.out.println("Pierce")
  	  	else if(N==15)
  	  		System.out.println("Buckanan")
  	  	else if(N==16)
  	  		System.out.println("Lincoln")
  	  	else if(N==17)
  	  		System.out.println("Johnson")
  	  	else if(N==18)
  	  		System.out.println("Grant")
  	  	else if(N==19)
  	  		System.out.println("Hayes")
  	  	else if(N==20)
  	  		System.out.println("Garfield")
  	  	else if(N==21)
  	  		System.out.println("Arthur")
  	  	else if(N==22)
  	  		System.out.println("Cleveland")
  	  	else if(N==23)
  	  		System.out.println("Harrison")
  	  	else if(N==24)
  	  		System.out.println("Cleveland")
  	  	else if(N==25)
  	  		System.out.println("McKinely")
  	  	else if(N==26)
  	  		System.out.println("Roosevelt")
  	  	else if(N==27)
  	  		System.out.println("Taft")
  	  	else if(N==28)
  	  		System.out.println("Wilson")
  	  	else if(N==29)
  	  		System.out.println("Harding")
  	  	else if(N==30)
  	  		System.out.println("Coolridge")
  	  	else if(N==31)
  	  		System.out.println("Hoover")
  	  	else if(N==32)
  	  		System.out.println("Roosevelt")
  	  	else if(N==33)
  	  		System.out.println("Trueman")
  	  	else if(N==34)
  	  		System.out.println("Einsenhowever")
  	  	else if(N==35)
  	  		System.out.println("Kennedy")
  	  	else if(N==36)
  	  		System.out.println("Johnson")
  	  	else if(N==37)
  	  		System.out.println("Nixon")
  	  	else if(N==38)
  	  		System.out.println("Ford")
  	  	else if(N==39)
  	  		System.out.println("Carter")
  	  	else if(N==40)
			System.out.println("Reagan")
		else if(N==41)
  	  		System.out.println("Bush")
  	  	else if(N==42)
  	  		System.out.println("Clinton")
  	  	else if(N==43)
  	  		System.out.println("Bush")
  	  	else if(N==44)
  	  		System.out.println("Obama")
  	  	else
  	  		System.out.println("You didn't enter a valid number")

  	  }


  	public static void P02()
	  {
		int N;
		
		Scanner Sc = new Scanner(System.in);

	  	System.out.println("The Presidents Problem");
	  	System.out.println("");
	  	System.out.println("Enter an year from 1789-2014.  I will tell you the president's name.");
	  	N = Sc.nextInt();
	  	if(N==1)
	  		System.out.println("Bruce Springsteen");


	  	System.out.println("\n\n\n\n\n");
	  }



  	public static void main(String[]args) throws IOException
	  {

	  	P01();
	  	//P02();
	  	//P03();
	  	//P04();
	  	//P05();


	  }
}
