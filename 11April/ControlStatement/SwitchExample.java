package ControlStatement;
import java.util.Scanner;
public class SwitchExample {

	public static void main(String[] args) {
		//Basic Calculator
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("Press 1. Add 2 Sub 3 Multi 4 Q 5 R 0 Exit");
			int choice=scan.nextInt();
			if(choice==0)
				break;
		System.out.println("Enter I value");
		int num1=scan.nextInt();
		System.out.println("Enter II Value");
		int num2=scan.nextInt();
		
		
		switch(choice) {
		case 1 : System.out.println("sum="+(num1+num2));
					break;
		case 2 : System.out.println("diff="+(num1-num2));
		break;
		case 3 : System.out.println("product="+(num1*num2));
		break;
		case 4 : System.out.println("Q="+(num1/num2));
		break;
		case 5 : System.out.println("R="+(num1%num2));
		break;
		
		default : System.out.println("Wrong choice"); 
			
		
		}//switch close
		}//Loop close
	}

}
