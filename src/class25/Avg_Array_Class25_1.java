package class25;

public class Avg_Array_Class25_1
{

	public static void main(String[] args) 
	{
		int array[]=new int [5];
		array[0]=12;
		array[1]=10;
		array[2]=20;
		array[3]=26;
		array[4]=30;
		double sumofno=0;

	/*double average=(array[0]+array[1]+array[2]+array[3]+array[4])/array.length;
	System.out.println(average);
	*/
		
		for(int i=0;i<=4;i++)
		{
			
			sumofno=sumofno+array[i];
		}
			System.out.println(sumofno);
			
			double average=sumofno/array.length;
				System.out.println("Average is->"+average);
				
	
	}

}
