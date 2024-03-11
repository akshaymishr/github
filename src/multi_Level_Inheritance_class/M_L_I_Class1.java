package multi_Level_Inheritance_class;
class akshay
{
	void add()
	{
		System.out.println("add 2 no.s");
	}
	void sub()
	{
		System.out.println("sub 2 no.s");
	}
	
	
}

 class Parent extends akshay
 {
	 void mul()
	 {
		 System.out.println("mul 2 no.s");
	 }
	 
	 void div()
	 {
		 System.out.println("div 2 no.s");
	 }
 }

public class M_L_I_Class1 extends Parent
{
	void mod ()
	{
		System.out.println("mod of 2 no.s");
	}

	public static void main(String[] args)
	{
		M_L_I_Class1 M1=new M_L_I_Class1();
		M1.add();
		M1.sub();
		M1.mul();
		M1.div();
		M1.mod();

	}

}
