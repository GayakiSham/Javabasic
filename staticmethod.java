package Firstpackege;

public class staticmethod {
	
	static void method()
	{
		System.out.println("Calling in main method");
	}
	
	static int sum(int a, int b)
	{
		return a+b;
			
	}
	
	public static void main(String args[])
	{
		method();
		
		int Addition = sum(5,6);
     System.out.println("Addition is :" + Addition);
		
	}
}
