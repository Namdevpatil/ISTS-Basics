package javaBasics;

public class Example2 {

	public static void main(String[] args) {
		
		int x = 200, y = 50;
		
		boolean condition = x > y;
		
		System.out.println(condition);
		
		if(condition)
		{
			System.out.println("Hello");
			System.out.println(x);
		}
		
		System.out.println("===================");

		if(condition)
			System.out.println("Hello");
	}

}
