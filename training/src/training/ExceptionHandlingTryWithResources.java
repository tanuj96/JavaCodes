package training;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandlingTryWithResources {

	public static void main(String[] args)  throws Exception
	{
		int n=0;
		System.out.println("Enter a Number");
	
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))  // try with resource
		{
			n= Integer.parseInt(br.readLine());
		}
		System.out.println(n);
	}
}
