package Firstpackege;
import java.util.Date;
public class DateClassProgram {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1.getTime());     //System understandable time
		Date d2= new Date();
		System.out.println(d2);           // Human understandable time
		
		
		
		String format1= d2.toString();
		String date = format1.substring(8,10);
		System.out.println(date);
		String month = format1.substring(4,7);
		System.out.println(month);
		String year = format1.substring(format1.length()-4);
		System.out.println(year);
		
		String format2 = date.concat(month).concat(year);
		System.out.println(format2);
		
		String format3 = date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format3);
		
		String format4 = date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format4);


	}

}
