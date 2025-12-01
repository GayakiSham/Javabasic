package Firstpackege;

public class Arraycommennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1 []= new int[4];
	        array1 [0]=74;
		    array1 [1]=84;
		    array1 [2]=64;
		    array1 [3]=94;
		    
		    
		int array2 []= new int [4];
		    array2 [0]=14;
		    array2 [1]=24;
		    array2 [2]=74;
		    array2 [3]=94;

		    
		for(int i=0; i<array1.length; i++)  // this is for array1
		{
			
		for(int j=0; j<array2.length;j++)  // this is for array2
		{
			if(array1[i]==array2[j])
			{
				System.out.println(array1[i]);
			}
		}
		}
		    
		    
	}

}
