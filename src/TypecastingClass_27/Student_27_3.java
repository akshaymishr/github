package TypecastingClass_27;
class Teacher1
{
	void java()
	{
		
	}
	
}
class Mentor1 extends Teacher1
{
	void selenium()
	{
		
	}
	
	
}
class Student_Exp extends Mentor1
{
	
	void apitesting()
	{
		
	}
}

public class Student_27_3 extends Student_Exp
{
	void sql() 
	{
		
	}

	public static void main(String[] args)
	{
		
		Mentor1 m1		=new Student_Exp(); 
		m1.java();
		m1.selenium();
		
		
		
	}

}
