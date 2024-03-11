package interface_class;
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
//multiple level inheritance
public class Interface_Class_3  implements  Parent1, Parent2
{

	public static void main(String[] args) 
	{
		Interface_Class_3 I1=new Interface_Class_3();
		I1.auth();
		I1.authentication();
		I1.password();
		I1.username();

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
