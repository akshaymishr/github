package supercallingstatement;

class G_Parent
{
	G_Parent(int a,double b)
	{
		System.out.println("Grand Parent Constructor");
	}
}
class Parent1 extends G_Parent
{
	Parent1( String a)
	{	
		super(100,123.3);
		System.out.println("Parent Constructor");
	}
}	
public class Super_Calling_Statement extends Parent1
{
	 Super_Calling_Statement()
	{
		 super("MKT");
		System.out.println("Manish Constructor");
}
	public static void main(String[] args) 
	{	
		new Super_Calling_Statement();
	}

}
