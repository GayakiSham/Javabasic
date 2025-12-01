package Firstpackege;

import java.util.Arrays;

public class Arrayprogrammerge {

	public static void main(String[] args) 
	{
	   int [] array1 =new int [3];
          array1[0] = 11;
          array1[1] = 22;
          array1[2] = 33;
          
          
       int []array2= new int[3];
          array2[0]=44;
          array2[1]=55;
          array2[2]=66;
	
	
	int []array12= new int[array1.length + array2.length];
	
	for(int i=0; i<array1.length; i++)
	{
		array12 [i]=array1[i];
    }
	
	for(int j=0; j<array2.length; j++)
	{
		array12[array1.length+j]=array2[j];
	}
	System.out.println("The merged array is:- ");
	//System.out.println(Arrays.binarySearch("This is my merge Array->" +array12));
    System.out.println("The merged array is: " + Arrays.toString(array12));

	}
	}
