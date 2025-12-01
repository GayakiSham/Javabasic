package Firstpackege;

public class ThrowKeyword1 {

	public static void main(String[] args) throws NullPointerException,StringIndexOutOfBoundsException
	
	{	
		if(1==1)
		{
			throw new NullPointerException("String is empty");
			
		}
		else
		{
			throw new StringIndexOutOfBoundsException("String index of range:4");
		}
	}

}
