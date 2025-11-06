package example;

public class Exception1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 5;
		int res1 = 0; 
		
		try {
			res1 = a / (b - c); 
		} catch (ArithmeticException e1) {
			System.out.println("Can't divide with value zero!...."+e1);
		}
		
		System.out.println("Result1: " + res1); 
		int res2 = a / (b + c); 
		System.out.println("Result2: " + res2);
	}
}
