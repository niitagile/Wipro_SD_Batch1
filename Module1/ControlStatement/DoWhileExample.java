package ControlStatement;
import java.util.Scanner;
public class DoWhileExample {

	public static void main(String[] args) {
		//Basic Calculator
		Scanner scan=new Scanner(System.in);
		int t;
		do{
		System.out.println("1. Deposite 2. Withdraw 3. show Balance");
		int choice =scan.nextInt();

		switch(choice){
		case 1: System.out.println("Deposite done");
			break;
		case 2: System.out.println("Withdraw done");
			break;
		case 3: System.out.println("balance shown done");
			break;
		default: System.out.println("Wrong choice");

	
		}

		System.out.println("Do you want to do any other transaction. Press 1. yes");
	 t=scan.nextInt();			

	}while(t==1);

}
}
