package javaBasics;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		int age;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the person age: ");
		age = scanner.nextInt();
		scanner.close();
		
		boolean condition1, condition2;
		
		condition1 = age >= 18;
		
		condition2 = age >= 21;
		
		//outer 
		if(condition1)
		{
			//inner
			if(condition2)
			{
				System.out.println("the person is able to get marry");
			}
			else
			{
				System.out.println("the person is not able to get marry");
			}
		}
		else
		{
			System.out.println("the person is minor");
		}
		
		
	}

}
