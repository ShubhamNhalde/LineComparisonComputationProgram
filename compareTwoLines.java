package com.bridgelabz;

import java.util.Scanner;

public class compareTwoLines {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to The Line Comparison Computation Program");	

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1 of First Point: ");
		int x1 = scanner.nextInt();
		System.out.println("Enter y1 of First Point: ");
		int y1 = scanner.nextInt();
		System.out.println("Enter x2 of Second Point: ");
		int x2 = scanner.nextInt();
		System.out.println("Enter y2 of Second Point: ");
		int y2 = scanner.nextInt();

		System.out.println("Enter x1 of Third Point: ");
		int p1 = scanner.nextInt();
		System.out.println("Enter y1 of Third Point: ");
		int q1 = scanner.nextInt();
		System.out.println("Enter x2 of Forth Point: ");
		int p2 = scanner.nextInt();
		System.out.println("Enter y2 of Forth Point: ");
		int q2 = scanner.nextInt();
		scanner.close();

		Double lenghtOfLine1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		Double lenghtOfLine2 = Math.sqrt(Math.pow(p2-p1, 2) + Math.pow(q2-q1, 2));

		System.out.printf("Length of First Line is : " + lenghtOfLine1);
		System.out.printf("Length of Second Line is : " + lenghtOfLine2);

		boolean ans = lenghtOfLine1.equals(lenghtOfLine2);
		if(ans)
		{
			System.out.println("Both Lines are Equal");
		}
		else
		{
			System.out.println("Both Lines are not Equal ");
		}
	}

}
