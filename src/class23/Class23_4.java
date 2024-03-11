package class23;

public class Class23_4
{

	public static void main(String[] args)
	{
		String name="ankita123";
		char c1[]=			name.toCharArray();
		
		for(int i=0;i<name.length()-1;i++)
		{	
		boolean answer= Character.isDigit(c1[i]);
		if(answer==false)
		{
			System.out.println("index position "+i +" is "+"Alphabet");
		}
		else  
		{
			System.out.println("index position "+i +" is "+"Numeric");
		}
	}

}
}
