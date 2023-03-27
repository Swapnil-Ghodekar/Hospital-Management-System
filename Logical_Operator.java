package day_2;

public class Logical_Operator
{
	//example for logical operators
	// 1) And operator && [shift + 7] 
	//)2)  or operator || [ above enter key]
	//3 not operator  !  [shift +1]


		public static void main(String[] args) {
			
			int a=10;

			                                             // java works on boolean values , true or false
			                                              // not in 0 & 1 (not deal in 0 & 1)
			System.out.println(a>10 && a<20 ); // false    
			
			// this is logical and, if both are true then only condition will true 
			
			System.out.println(a>10 || a>20); //true
			
			System.out.println(a!=10);                    // logical not, convert true into a false
			
			System.out.println(!(5==5));      // ! symbol, convert true to false and false to true
			 
		
		}

	}


