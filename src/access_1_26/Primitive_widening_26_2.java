package access_1_26;

public class Primitive_widening_26_2 
{

	public static void main(String[] args) 
	{
		double wt=52;//widening - implicity way
		System.out.println(wt);
		wt=4.53455;
		
		// widening- a) implicit way b) Explicit way
		
		//------------------------------------------
		
			double weight=(double) 90;//widening Explicit way
			System.out.println(weight);
			
			
			
			
			//=======================
			byte a1=90;
			//byte into int ->widening 
			int a2= a1;
			System.out.println(a2);
	}

}
