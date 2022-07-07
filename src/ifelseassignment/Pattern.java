package ifelseassignment;

public class Pattern {
	

	public static void main(String[] args) {

		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for(int a=1; a<=5; a++) {
			
			for(int b=5; b>=a; b--) {
				
				System.out.print("#");
			}
			System.out.println("");
		}
		
		
for(int y=1; y<=5; y++) {
	for(int k=5; k>y; k--) {
		
		System.out.print(" ");
	}
	for(int o=1; o<=y; o++) {
		System.out.print("&");
	}
	System.out.println("");
}

           for(int y=1; y<=5; y++) {
        	   for(int o=1; o<y; o++) {
		            System.out.print(" ");
	            }
	              
	           for(int k=5; k>=y; k--) {
		
		           System.out.print("$");
	           }
	                System.out.println("");
                   }		
		
           
           
           for(int F=1; F<=5; F++) {
        	   for(int J=4; J>=F; J--) {
        		   System.out.print(" ");
        	   }                                         //Pyramid Pattern
        	   for(int H=1; H<=F; H++) {
        		   System.out.print(" *");
        	   }
        	   System.out.println("");
           }
           
          
           
	      }
	
	

}
