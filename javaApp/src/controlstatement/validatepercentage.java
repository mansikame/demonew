package controlstatement;

import java.util.Scanner;

public class validatepercentage {

	public static void main(String[] args) 
	{
		int marks;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your marks");
		marks=sc.nextInt();
		if (marks<=34)
		{
			System.out.println("Sorry...You are fail. Better Luck next time");
		}
		
		else if (marks>=35 && marks<=60)
		{
			System.out.println("Congratulations....You are Pass with Second Class");
		}
		else if (marks>=61 && marks<=75)
		{
			System.out.println("Congratulations....You are Pass with First Class");
		}
		else if (marks>=75 && marks<=100)
		{
			System.out.println("Congratulations....You are Pass with Distinction");
		}
		else
		{
			System.out.println("Please enter your correct marks.");
		}
		
	}

}
