package TypecastingClass_27;


class Teacher
{
	void add() 
	{
		System.out.println("add");
	}
	
}
class Mentor extends Teacher
{
	void sub()
	{
		System.out.println("subtract");
	}
	
	
}

public class Student_Typecast extends  Mentor
{
	void multi() 
	{
		System.out.println("multi");
	}
	

	public static void main(String[] args) 
	{
		Mentor m1	=new Student_Typecast();
		m1.add();
		m1.sub();
		

	}
	
	
}
