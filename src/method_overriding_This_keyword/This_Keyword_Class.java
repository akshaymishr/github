package method_overriding_This_keyword;

public class This_Keyword_Class 
{
	int age;	//0
	String name;	//null
	double salary;	//0.0
	void add(int age,String name,double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		
	}	
	public static void main(String[] args) 
	{
	
		This_Keyword_Class k1=new This_Keyword_Class();
		k1.add(17, "Ram", 9678);
		System.out.println(k1.age);
		System.out.println(k1.name);
		System.out.println(k1.salary);
	}

}
