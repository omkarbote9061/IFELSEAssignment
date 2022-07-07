package ifelseassignment;

public class assignment {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int variable1=20;
		
		int variable2=17;
		
		//check whether the number is even or odd?
		if(variable1%2==0) {
			
			System.out.println("i am even number");
			
		}else {
			
			System.out.println("i am odd number");
			
		}
		
		
		if(variable2%2==0) {
			
			System.out.println("i am even number");
			
		}else {
			
			System.out.println("i am odd number");
			
		}
		
		
		//check whether the number is positive or negative?
		int Number1=15;
		
		long number2=-12;
		
		if(Number1>=10) {
			
			System.out.println("number1 positive number");
			
		}else {
			
			System.out.println("number1 negative number");
			
		}
		
		if(number2<=-15) {
			
			System.out.println("number2 positive number");
			
		}else {
			
			System.out.println("number2 negative number");
			
		}
		
		//check whether the leap year or not?
		int year=2004;
		if(year%4==0) {
			
			System.out.println("this is leap year");
			
		}else {
			
			System.out.println("this is not leap year");
			
		}
		
		int year1=2007;
		if(year1%4==0){
			
			System.out.println("this is  leap year");
			
		}else {
			
			System.out.println("this is not leap year");
			
		}
		
		//check the largest among the three number
		int num1=10;
		double num2=29.16;
		int num3=16;
		
		if(num1>=num2 && num1>=num3) {
			
			System.out.println("num1 is largest number");
			
		}else if(num2>=num1 && num2>=num3) {
			
			System.out.println("num2 is the largest number");
			
		}else {
			
			System.out.println("num3 is the largest value");
			
		}
		
		//check whether the character is vowel or consonant?
		
		 char string = 'u';

	        if(string == 'a' || string == 'e' || string == 'i' || string == 'o' || string == 'u' ) {
	        	
	        	 System.out.println(string + " is vowel");
	        	
	        }else {
	            System.out.println(string + " is consonant");}

		
	}

}
