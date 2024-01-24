package exceptionhandling;

public class MultiCatchExample {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[10];
			a[12]=25/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		//java7
		try
		{
			int a[]=new int[10];
			a[12]=25/0;
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	
		System.out.println("rest of code...");

	}

}
