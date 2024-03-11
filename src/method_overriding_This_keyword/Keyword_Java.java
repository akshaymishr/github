package method_overriding_This_keyword;

public class Keyword_Java 
{
	int age;	//0
	String name;	//null
	double salary;	//0.0
	void add(int age,String name,double salary)
	{
		
		//System.out.println(age);
		//System.out.println(name);
		//System.out.println(salary);
		
		this.age=age;
		this.name=name;
		this.salary=salary;
		
	}

	public static void main(String[] args) 
	
	{
		Keyword_Java k1=new Keyword_Java();
		k1.add(17, "Ram", 9678);
		System.out.println(k1.age);
		System.out.println(k1.name);
		System.out.println(k1.salary);
	}

}
