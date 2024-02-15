package javaBasics;

public class Example3 {

	public static void main(String[] args) {
		
		int x = 200, y = 50;
		
		boolean condition = x < y;
		
		System.out.println(condition);
		
		if(condition)
		{
			System.out.println("Hello");
			System.out.println(x);
		}
		else
		{
			System.out.println("Hello else");
			System.out.println("Bye");
		}
		
		System.out.println("===================");

		if(condition)
			System.out.println("Hello");
		else
			System.out.println("Bye");
	}

}
