package class23;

public class Class_23_3 
{

	public static void main(String[] args) 
	{
		String name="ankita123";
			char c1[]=	name.toCharArray();
			
			
			for(int i=0;i<name.length();i++)
			{	
			boolean answer= Character.isAlphabetic(c1[i]);
			if(answer==true)
			{
				System.out.println("index position "+i +" is "+"Alphabet");
			}
			else
			{
				System.out.println("index position "+i +" is "+"Numeric");
			}
			//System.out.println("Index position "+ i +" is "+ answer);
			}
	}

}
