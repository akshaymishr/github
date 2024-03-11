package assignment_Imporant;

public class Constructor_Assignment {
	
	Constructor_Assignment()
	{
		System.out.println("My First Constructor Assignment");
	}
		void add()
		{
			int num1=300;
			int num2=400;
			System.out.println(num1+num2);
		}
		
		void subtract()
		{
			int num3=600;
			int num4=400;
			System.out.println(num3-num4);
		}
		
		static void multi()
		{
			int m1=500;
			int m2=200;
			System.out.println(m1*m2);
		}
		
		static void divi()
		{
			int m3=300;
			int m4=200;
			System.out.println(m3/m4);
		}
	public static void main(String[] args) 
	{
		//new Constructor_Assignment();
		Constructor_Assignment C1=new Constructor_Assignment();
		C1.add();
		C1.subtract();
		multi();
		divi();
		
		
	}

}
