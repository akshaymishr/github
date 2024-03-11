package assignment_Imporant;
import java.util.Arrays;
public class Assignment_22Class 
{

	public static void main(String[] args)
	{
		Boolean fail []=new Boolean[3];
		
		fail[0]= false;
		fail[1]=true ;
		fail[2]=true ;
		
		Arrays.sort(fail);
		System.out.println(Arrays.toString(fail)); 
		
		double bonus []=new double[5];
		
		bonus [0]=10000;
		bonus [1]=20000;
		bonus [2]=30000;
		bonus [3]=40000;
		bonus [4]=50000;
		Arrays.sort(bonus);
		
		String bounslist=Arrays.toString(bonus);
		System.out.println(bounslist);
	}

}
