package controlstatement;

import java.util.Scanner;

public class validateLadkiBahinYojna {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your gender");
		
		String gender=sc.next();
		
		if(gender.equalsIgnoreCase("Female"))
		{
			System.out.println("You are eligible for Ladki Bahin Yojna");
		}
		else
		{
			System.out.println("You are not eligible.");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
