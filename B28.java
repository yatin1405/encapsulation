package EncapsulationDemo;

public class B28 {
	public static void main(String[] args) {
		try 
		{
			int a[] = {1,2,3,4,5};
			System.out.println(a[5]);
			try 
			{
				int x= a[2]/0;
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("Division by zero is not possible");
			}
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArraIndexOutOfBoundsException");
			System.out.println("Element at such index does not exists");
		}
	}
}
