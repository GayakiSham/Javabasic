package Firstpackege;



public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a=1/1;
		 int b=0/1;
		 
		 try {
			 int c=1/0;
		     }
		catch( ArithmeticException a1)
		 {
			System.out.println("Handled the exception");
		 }
		 
		 System.out.println("Hello");

	}

}
