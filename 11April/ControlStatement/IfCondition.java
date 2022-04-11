package ControlStatement;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner scan=new Scanner(System.in);
		
		for(int count=1;count<=5;count++)
		{	System.out.println("*************************");
		    System.out.println("count="+count); 
			System.out.println("**************************");
			System.out.println("Enter I value");
			num1=scan.nextInt();
			System.out.println("Enter II value");
			num2=scan.nextInt();
			System.out.println("Enter III value");
			num3=scan.nextInt();
			if(num1> num2 && num1>num3) {
				System.out.println(num1+"is greatest value");
			}
			else
			if(num2> num1 && num2>num3) {
				System.out.println(num2+"is greatest value");
			}
			else
			{
				System.out.println(num3+"is greatest value");
			}
		}
	}

}
