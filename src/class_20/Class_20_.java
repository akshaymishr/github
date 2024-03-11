package class_20;

public class Class_20_ 
{

	public static void main(String[] args)
	{
			//String name="orange";
			String name="radar";
			String reverse="";
			
			for(int i=name.length()-1;i>=0;i--)
			{
				char answer= name.charAt(i);
				//System.out.print(answer);
				//System.out.println(answer);
				
				
				reverse=reverse+answer;
			}
				//System.out.println(reverse);//radar
				
				boolean a1=name.equals(reverse);
				System.out.println(a1);
				
				if(a1==true) 
				{
					System.out.println("the input is palindrom");
				}
				else
				{
					System.out.println("they are not palindrome");
				}
			

	}
}


//mom
//dad
//radar
//madam this are called are palindrome 
