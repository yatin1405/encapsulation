package EncapsulationDemo;

public class B29 {
	public static void main(String[] args) {
		try {
			int n1 = 26;
			int n2 = 0;
			int devision = n1/n2;
			System.out.println(devision);
		} catch (Exception e) {
			System.out.println("ArithmeticException: "+e.getMessage());
		}
	}

}
