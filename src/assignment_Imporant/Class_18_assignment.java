package assignment_Imporant;//multiple level inheritance
interface Parent1
{
	void auth();
	void authentication();
}
interface Parent2
{
	void username();
	void password();
	
}

interface Parent3
{
	void name();
	void surename();
	
}
interface Parent4
{
	void add();
	void sub();
	
}

public class Class_18_assignment implements  Parent1, Parent2,Parent3,Parent4
{

	public static void main(String[] args)
	{
		Class_18_assignment C1=new Class_18_assignment();
		C1.add();
		C1.auth();
		C1.authentication();
		C1.name();
		C1.password();
		C1.sub();
		C1.surename();
		C1.username();

	}

	
	public void add() 
	{
		
		
	}

	
	public void sub()
	{
		
		
	}

	
	public void name() 
	{
		
		
	}

	
	public void surename() {
		
		
	}

	
	public void username() 
	{
		
		
	}

	
	public void password()
	{
		
		
	}

	
	public void auth() 
	{
		
		
	}

	
	public void authentication() 
	{
	
		
	}

}
