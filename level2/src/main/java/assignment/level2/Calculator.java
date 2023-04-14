package assignment.level2;
import java.util.Scanner;

public class Calculator {
	
	 	
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter First number");
		 int num1=sc.nextInt();
		 System.out.println("Enter second number");
		 int num2=sc.nextInt();
		Main obj=new Main();
		
		int addResult=obj.add(num1, num2);
		System.out.println("Addition Result ="+addResult);
		
		int subResult = obj.substract(num1,num2);
		System.out.println("Subtraction Result ="+subResult);
		
		int mulResult =obj.multiply(num1, num2);
		System.out.println("Multiplication Result ="+mulResult);
		
		double divResult =obj.divide(num1, num2);
		System.out.println("Division Result ="+divResult);
		
	}

}
