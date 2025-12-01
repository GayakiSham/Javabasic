package Firstpackege;
import java.util.ArrayList;
public class ArrayListProagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		 ArrayList<Integer> a1= new ArrayList<Integer>();
		 a1.add(7);
		 a1.add(71);
		 a1.add(47);
		 a1.add(35);
		// a1.add(1.89);
		 System.out.println(a1);
		 
		 ArrayList <Integer> a2= new ArrayList<Integer>();
		 a2.add(42);
		 a2.add(52);
		 a2.add(12);
		 a2.add(92);
		 a2.addAll(a1);
System.out.println(a2);
		 }

}
