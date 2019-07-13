package training;

public class EvenOddByTernaryOperator {
	public static void main(String[] args)
	{
		int n;
		String j;
		for(int a = 0;a<=10;a++)
		{
			n=a;
			int i = n%2;
			j = i==0?"No. is Even":"No. is Odd";
			System.out.println( n + " :  " + j );
		}
	}
}
