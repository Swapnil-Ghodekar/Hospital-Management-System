package day_2;

public class Ternary_Operator {
	
	
		public static void main(String[] args) 
		{
			// ternary operator
			// condition ? statement 1 : statement 2
			int a = 10;
			int b = 20;
			int c = a>b ? a : b ;
			
			System.out.println(c);           // condition is true goes with first statement and wrong goes with second 
 
			int x = 20;
			int y = 10;
			
			int result = (x>y) ? (x+y) : (x-y);          // pre increment
			System.out.println(result);
			
			// find max of two number using ternary operator
			int p = 22;
			int q = 33;
			result = (p>q) ? p : q;         // print max number between two numbers
            
			System.out.println(result);     // 33 o/p print max number 
			
		}

	}



