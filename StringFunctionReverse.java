package Firstpackege;

public class StringFunctionReverse {

	public static void main(String[] args) {
          
		  String input="Sham";
		 String	output=" ";
				  
				 
		 for(int i=input.length()-1; i>=0; i--)
		 {
			 char c1= input.charAt(i);
			 output=output+c1;
		 }
				  System.out.println("This is my input->" +input);
				  System.out.println("This is my output->" +output);
						  
		
		    
	}

}
