package EncapsulationDemo;

import java.util.Scanner;

public class I2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			if(age<18) 
			{
				throw new Exception("Invalid age Exception");
			}
			else 
			{
				System.out.println("Wlcome to the group of the vote");
			
			} 
		}
			catch (Exception e) {
			System.out.println(e);
		}
	}

}
