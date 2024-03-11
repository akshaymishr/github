package classseventeenth_Lecture;
abstract class Parent_Class //exposing this // grotechminds-expose with google or facebook
{
	abstract void add();//this called  has abstract method	// abstract method will always be non statics
	abstract void substract();
	
	void multi()// concrete method 
	{
		System.out.println("It is alogic which I am Exposing");
	}
	static void moldulus()// concrete method
	{
		System.out.println("It is alogic which I am exposing");
	}
}
public class Child_Class_1st_17th extends Parent_Class // grotechminds
{
	void add() //concreate method
	{
		System.out.println("Real Logic");
	}
	public static void main(String[] args) //concreate
	{
		Child_Class_1st_17th c1=new Child_Class_1st_17th();
		c1.add();
		c1.substract();
		c1.multi();
		moldulus();
	}

	void substract() 
	{
		System.out.println("Internal Logic for Subtraction");
		
	}

}
