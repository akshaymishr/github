package class24;

public class ArraysClass_3
{

	public static void main(String[] args) 
	{
		String name="Sky is 441";
		char c1[]=	name.toCharArray();
		
		int count_of_alpha=0;
		int count_of_numberic=0;
		int count_of_space=0;
		for(int i=0;i<name.length();i++)
		{	
		boolean answer= Character.isAlphabetic(c1[i]);
		boolean answer1= Character.isDigit(c1[i]);
		boolean answer2= Character.isSpaceChar(c1[i]);
		
		if(answer==true)
		{
			 count_of_alpha++;	
		}
		if(answer1==true)
		{
			count_of_numberic++;
		}
		if(answer2==true)
		{
			count_of_space++;
		}
		
		}
		System.out.println("Count of alphabets the given string-> "+count_of_alpha);
		System.out.println("Count of numberic the given string->"+count_of_numberic);
		System.out.println("Count of space the given string->"+count_of_space);
		
	}

}
