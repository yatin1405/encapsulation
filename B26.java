package EncapsulationDemo;

import java.util.Scanner;

public class B26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter first number: ");
			int num1 = sc.nextInt();
			System.out.print("Enter second number: ");
			int num2 = sc.nextInt();
			int devision = num1/num2;
			System.out.println("Result is: "+devision);
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		System.out.println("End of program");
	}

}
