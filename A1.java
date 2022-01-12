package EncapsulationDemo;

import java.util.Scanner;

class BankException extends Exception{
	double amount;
	public BankException(double amount) {
		this.amount=amount;
	}
}
class ATM{
	double balance = 2000;
	public void withdrawal(double amount) throws BankException {
		if(amount<=balance) {
			balance = balance-amount;
			System.out.println(amount+" rs successfully withdrawal");
		}
		else {
			double needs = amount-balance;
			throw new BankException(needs);
		}
	}
}

public class A1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM a1 = new ATM();
		System.out.println("Enter amount for withdrawal: ");
		double amount = sc.nextDouble();
		try {
			a1.withdrawal(amount);
		} catch (BankException e) {
			System.out.println("Sorry, insufficient balance, you need more "+e.amount);
		}
	}

}
