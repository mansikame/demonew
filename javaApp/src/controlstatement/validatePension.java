package controlstatement;

import java.util.Scanner;

public class validatePension {

	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your age");
		
		int age=sc.nextInt();
		
		if(age>=60)

		{
			System.out.println("Congratulations!!!! You are eligible for Pension.");
		}
		else
		{
			System.out.println("Sorry !!! You are not eligible for Pension.");
		}
		
		
		
		
	}

}
