package classseventeenth_Lecture;
abstract class thirdmethod//abstract class
{
	abstract void thirdmmethod();
	abstract void forthmethod();
	void add1()//Concrate method// By creating an object and with object and the help of reverence
	{
		System.out.println("1");
	}
	static void add2() //directly by us name 
	{
		System.out.println("2");
	}
}
abstract class Second_Class extends thirdmethod
{
	abstract void Second_Method();// By creating an object and with object and the help of reverence
	abstract void Second_method();// By creating an object and with object and the help of reverence
	void add3()
	{
		System.out.println("addition");
	}
	void add4() // By creating an object and with object and the help of reverence
	{
		System.out.println("adding 2 no.s");
	}
}
public class Class_Seventeenth_2nd_Class extends Second_Class
{
	void subtraction() // By creating an object and with object and the help of reverence
	{
		System.out.println("sub of 2 no.s");
	}
	
	void multiplication() // By creating an object and with object and the help of reverence
	{
		System.out.println("multiply of 2 no.s");
	}
	public static void main(String[] args)
	{
		Class_Seventeenth_2nd_Class c1=new Class_Seventeenth_2nd_Class();
		c1.add1();
		add2();
		c1.add3();
		c1.add4();
		c1.subtraction();
		c1.multiplication();
		
		c1.Second_method();
		c1.Second_Method();
		c1.thirdmmethod();
		c1.forthmethod();
		
		
		
	}

	
	void Second_Method() {
		
		System.out.println("Developwe will write here inter logic");
	}

	
	void Second_method() {
		
		System.out.println("Developwe will write here inter logic");
	}

	
	void thirdmmethod() {
		System.out.println("Developwe will write here inter logic");
	}

	
	void forthmethod() {
		System.out.println("Developwe will write here inter logic");
	}

}
