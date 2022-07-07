package ifelseassignment;

public class Patter2 {

	public static void main(String[] args) {

		 
			
		for(int M=1,a=0; M<=6; M++) {
			
			 a=10*a+M;                                             //1
			 System.out.println(a);                                //12
		}                                                          //1234
		                                                           //12345                 
	                                                               //123456
		
		
		for(int N=6,G=0; N>=1; N--) {                 //6
			                                          //65
			G=10*G+N;                                 //654
			System.out.println(G);                    //6543
			                                          //65432
		}                                             //654321
		
	}                                                             

}
