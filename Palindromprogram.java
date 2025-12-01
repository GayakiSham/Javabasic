package Firstpackege;

public class Palindromprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method 
     
		
		String input= "MOM";
     String output="";
    
     for(int i=input.length()-1; i>=0; i--)
     {
    	 char c1=input.charAt(i);
    	 output=output+c1;
    	 
     }

     System.out.println("Here is my input->" +input);
     System.out.println("Here is my output->" +output);
     
     if (input.equals(output))
     {
    	 System.out.println("It is a Palindrome");
     }
     else
     {
    	System.out.println("NOT a Palindrome");
     }
     
      
	}

}
