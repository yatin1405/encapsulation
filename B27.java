package EncapsulationDemo;

public class B27 {
	public static void main(String[] args) {
		
		
		try {
			int a[] = new int[5];
			a[5] = 30/0;
			System.out.println(a[6]);
			
		} 
		catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occurs");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch (Exception e) {
			System.out.println("Parent exception occurs");
		}
		System.out.println("Program is closed");
	}

}
