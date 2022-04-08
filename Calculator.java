import java.util.Scanner;
class Calculator{

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int num1,num2, ans;
		System.out.println("Enter I value");
		num1=scan.nextInt(); //scan.nextFloat();
		System.out.println("Enter II value");
		num2=scan.nextInt();
		System.out.println("Enter 1 Add 2. Sub 3 Mult 4 Div 5 Rem");
		int choice=scan.nextInt();//byte,short,int, char, enum, String	
		switch(choice){
		case 1 : ans =num1+num2;//expression operator- +,= and operand - num1, num2
			System.out.println("sum="+ans);
			break;
		case 2 :ans =num1-num2;
			System.out.println("Difference="+ans);
			break;
		case 3 :ans =num1*num2;
			System.out.println("Multiplication="+ans);
			break;
		case 4 :ans =num1/num2;
			System.out.println("Q="+ans);
			

		case 5 :
			ans =num1%num2;
			System.out.println("R="+ans);
			break;
		default : System.out.println("Wrong choice");	
		
		}
		
	}

}