package class24;

public class ArraysClass_2 
{

	public static void main(String[] args) 
	{
		String name="manishkumartiwari";
		char c1[]=	name.toCharArray();
		
		int count_of_alpha=0;
		int count_of_numberic=0;
		for(int i=0;i<name.length()-1;i++)
		{	
		boolean answer= Character.isAlphabetic(c1[i]);
		if(answer==true)
		{
			 count_of_alpha++;
			//System.out.println("index position "+i +" is "+"Alphabet");
		}
		else
		{
			count_of_numberic++;
			//System.out.println("index position "+i +" is "+"Numeric");
		}
		}
		System.out.println("Count of alphabets the given string-> "+count_of_alpha);
		System.out.println("Count of alphabets the given string->"+count_of_numberic);
		
	}
}
