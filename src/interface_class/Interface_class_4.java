package interface_class;
interface Name
{
	void add1();
	void add2();	
}
abstract class Abc implements Name
{
	abstract void sub3 ();
	abstract void sub4 ();
}
abstract class XYZ extends Abc
{
	abstract void Md5 ();
	abstract void Cd6 ();
	void eat()
	{
		System.out.println("eatting");
	}
	void laugh () {
		System.out.println("Laughing");
	}
}

public class Interface_class_4 extends XYZ
{	void mul() {
	System.out.println("Hi");
}
void mul1() {
	System.out.println("hello");
}
	public static void main(String[] args) 
	{
		System.out.println("hello");
		

	}
	
	public void add1() 
	{
		
		System.out.println("hello1");
	}
	
	public void add2() 
	{
		
		System.out.println("hello2");
	}
	void sub3()
	{
		System.out.println("hello3");
		
	}

	void sub4() {
		
		System.out.println("hello4");
	}
	
	
	void Md5() 
	{
		
		System.out.println("hello5");
	}
	
	void Cd6() 
	{
		
		System.out.println("hello6");
	}
	
	
	
	

}
