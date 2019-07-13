package training;

public class ExceptionHandling {

	public static void main(String[] args) {
		try
		{
			int b[] = null;
			b[4] = 7;
			int a[] = new int[6];
			a[6] = 8;
			int i = 9/0; //  compiler will not verify this expection it will be known on runtime
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.err.print("Error  ");
		}
		catch(Exception e)
		{
			System.err.print("Something Wrong ");
		}
		finally
		{
		System.out.println("Bye");
		}
	}

}


//this try catch is exception handling