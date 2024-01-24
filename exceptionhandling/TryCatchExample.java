package exceptionhandling;

public class TryCatchExample {

	public static void main(String[] args) {
		try {
			int a=25/0;
			System.out.println(a);
		}
		catch(ArithmeticException e) {
			//System.out.println(e);
			//System.err.println(e);
			e.printStackTrace();
			
		}
		System.out.println("rest of code...");


	}

}
