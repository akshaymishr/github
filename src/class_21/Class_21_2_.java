package class_21;

public class Class_21_2_ 
{

	public static void main(String[] args)
	{
		String s1="sangeeta gogna";
	boolean a1=	s1.contains("gogna");
		System.out.println(a1);
		
		String s2="orange";
			boolean a2= s2.matches("o.....");
			System.out.println(a2);
			boolean a3=		s1.matches("(.*)a");
					System.out.println(a3);
					
			boolean a4=		s1.matches("s(.*)");
					System.out.println(a4);
					
					String name="ram tiwari";
			boolean a5=		name.matches("...");
			System.out.println(a5);
	}

}
