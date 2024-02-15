package javaBasics;

public class Example7 {

	public static void main(String[] args) {
		
		/**
		 * write a java program to table(2x1 = 2) for given number
		 */
		
		int number = 2;
		
		int start, end = 10;
		
		for(start = 1; start <= end; start++)
		{
			if(start == 4)
			{
				//break;
				continue;
			}
			System.out.println(number+" x "+start+" = "+start*number);//2x1 = 2
		}

	}

}
