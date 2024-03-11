package class_20;
import java.util.Date;

public class Finding_time_date 
{

	public static void main(String[] args) 
	{
		Date d1=new Date();
	System.out.println(d1.getTime());
	Date d2=new Date(d1.getTime() +(1000*60*60*24*1)); //BODMAS
	System.out.println(d2);
	//month
	//date
	//year
	String a1= d2.toString();
	String month=	a1.substring(4, 7);
	System.out.println(month);
	
	String date =a1.substring(8, 10);
	System.out.println(date);
	//System.out.println(a1.length());
	a1.substring(24, 27);
	String year= a1.substring(24, 28);
	System.out.println(year);
	
	// date formate-> DD MM YYYY
	
	System.out.println(date.concat(month).concat(year));
	System.out.println(date.concat("-").concat(month).concat("-").concat(year));
	System.out.println(date.concat("/").concat(month).concat("/").concat(year));

	}

}
