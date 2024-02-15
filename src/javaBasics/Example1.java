package javaBasics;//package name

public class Example1//class name
{

	//class-level variable
	int count = 0;
	
	String[] args = {};
	
	public int getCount()
	{
		int count = 0;
		return ++count;
	}
	
	public static void main(String[] args) 
	{	
		Example1 example1 = new Example1();
		System.out.println(example1.getCount());
		
		System.out.println("------------------------");
		
		for(int i = 1; i <= 4; i++)
		{
			System.out.println(++example1.count);
		}
	}

}
