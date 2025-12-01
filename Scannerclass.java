package Firstpackege;

import java.util.Scanner;
public class Scannerclass {
	static void area_of_circle()
	{
		System.out.println("Enter the value of the R");
		Scanner S1= new Scanner(System.in);
		
		
		double r= S1.nextDouble();
		System.out.println("Lets find out Area ");
		double area= Math.PI*r*r;
		System.out.println("The Area of the Circle is:-"  +area);
		
		
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area_of_circle();
	}

}
