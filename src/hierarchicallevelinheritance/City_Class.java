package hierarchicallevelinheritance;
class Parent
{
	 Parent ()
	 {
		 System.out.println("Parent Constructor");
	 }
}
public class City_Class extends Parent 
{
	City_Class()
	{
		
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) 
	{
		new City_Class();

	}

}
