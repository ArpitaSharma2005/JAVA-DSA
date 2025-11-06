package example;

public class NestedTryBlock {
	public static void main(String[] args) {
		try {	//outer try
			try {	//inner try 1
				int b = 39/0;
			}
			catch(ArithmeticException e) {	//inner catch 1
				System.out.println(e);
			}
			try {	//inner try 2
				int a[] = new int[5];
				a[5]=4;
			}
			catch(ArrayIndexOutOfBoundsException e){	//inner catch 2
				System.out.println(e);
			}
			
			System.out.println("Other Statement");
		}
		catch(Exception e)	//outer catch
		{
			System.out.println("Hnadled the exception (outer catch)");
		}
		System.out.println("Normal flow");
	}
}
