package training;

public class UserDefinedException {

	public static void main(String[] args) 
	{
			int i = 8;
			int j = 9;
			
			try
			{
				int k = i/j;	
				if(k==0)
					throw new TanujException("This is not possible");
				System.out.println(k);
			}
			catch(Exception e)
			{
				System.err.println("Error " +  e.getMessage());
			}
	}

}
