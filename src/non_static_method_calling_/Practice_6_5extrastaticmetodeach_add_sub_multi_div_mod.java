package non_static_method_calling_;

public class Practice_6_5extrastaticmetodeach_add_sub_multi_div_mod
{
		static void add() 
		{
			int a=1000;
			int b=2000;
			int sum=a+b;
			System.out.println(sum);
		}															
		static void sub()											
		{															
			int num1=500;											
			int num2=1000;											
			int subtract=num1-num2;
			System.out.println(subtract);
		}
		
		static void mult()
		{
			int num3=200;
			int num4=400;
			int multi=num3*num4;
			System.out.println(multi);
		}
		static void divide()
		{
			int n1=400;
			int n2=500;
			int div=n1*n2;
			System.out.println(div);
		}
		
		static void modules()
		{
			int n3=600;
			int n4=700;
			int mod=n3%n4;
			System.out.println(mod);
			
		}
	
	
		
		public static void main(String[] args) 
		{
			
		    	add();
		    	sub();
		    	mult();
		     divide();
	    	modules();		
		}
		
}
