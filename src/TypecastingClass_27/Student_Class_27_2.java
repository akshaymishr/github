package TypecastingClass_27;
class Teacher
{
	void add()
	{
		
	}
}
class Mentor extends Teacher
{
	void subtract()
	{
		
	}
}

public class Student_Class_27_2 extends Mentor
{
	
	void multi()
	{
		
	}

	public static void main(String[] args) 
	{
		Teacher t1			=new Student_Class_27_2();//upcasting
		t1.add();
		Student_Class_27_2 s1=				(Student_Class_27_2) t1;

	}

}
