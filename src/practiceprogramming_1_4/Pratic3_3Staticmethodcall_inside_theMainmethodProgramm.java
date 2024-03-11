package practiceprogramming_1_4;

public class Pratic3_3Staticmethodcall_inside_theMainmethodProgramm 
{
	
		static void add() 
		{
			System.out.println("Addition");
		}
		
		public static void main(String[] args) 
		{
			add();
			sub();
			mul();
		}
		
		static void sub()
		{
			System.out.println("subtract");
		}
		
		static void mul()
		{
			System.out.println("Multiply");
		}		
}

