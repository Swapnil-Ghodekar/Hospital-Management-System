package day_2;
import java.util.Scanner;            // import package for scanner class

public class Usser_Add {

	public static void main(String[] args)
	{
		
		Scanner s= new Scanner(System.in);          // crete object of scanner class
		System.out.println("enter number 1: ");        // for msg only
		
		int a=s.nextInt();                          // take numeric value as a input
		System.out.println("enter number 2: "); 
		int b=s.nextInt();                              // take another input value
		int c= a+b;                                 // do addition 
		System.out.println("Sum is "+ c);           // show result in this line

	}

}
