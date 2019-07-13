package training;

public class ShortHandOperator {
	public static void main(String[] args)
	{
		int m=4;
	    int n=5;
	    
		n += m;
		System.out.println(n);
		
		n++;//post increment
		System.out.println(n);
		
		++n;//pre increment
		System.out.println(n);
		
		n--;//post decrement
		System.out.println(n);
		
		--n;//pre decrement
		System.out.println(n);
	}
}
