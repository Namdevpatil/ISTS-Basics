package javaBasics;

import java.util.Scanner;

public class Example5 
{

	public static void main(String[] args) 
	{
		
		float marks;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the student marks(*out of 100): ");
		marks = scanner.nextFloat();
		
		scanner.close();
		
		if(marks <= 100 && marks > 75)//75-100
		{
			System.out.println("distinction");
		}
		else if(marks <= 75 && marks > 60)//60-75
		{
			System.out.println("first class");
		}
		else if(marks <= 60 && marks > 50)//50-60
		{
			System.out.println("second class");
		}
		else if(marks <= 50 && marks >= 41)//41-50
		{
			System.out.println("third class");
		}
		else if(marks == 40)//40
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
