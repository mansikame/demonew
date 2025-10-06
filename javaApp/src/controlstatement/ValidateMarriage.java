package controlstatement;

import java.util.Scanner;

public class ValidateMarriage {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
		
		int age=sc.nextInt();
		
		if(age>=21)

		{
			System.out.println("You are eligible for marriage");
		}
		else
		{
			System.out.println("You are not eligible for marriage");
		}
		
		
			}

}
