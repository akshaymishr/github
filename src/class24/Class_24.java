package class24;

public class Class_24 
{

	public static void main(String[] args)
	{
		String name="ram tiwari";
			char[] c1=name.toCharArray();
			
			for(int i=0;i<name.length();i++)
			{
			
			boolean answer=	Character.isSpaceChar(c1[i]);
			
			//System.out.println(answer);
			
			if(answer==true) 
			{
				System.out.println("Ther is a Sapace in the given string"+"The index of space is 3");
			}
			
		}
			
			

}
}