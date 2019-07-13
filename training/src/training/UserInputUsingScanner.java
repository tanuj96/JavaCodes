package training;

import java.util.Scanner;

public class UserInputUsingScanner {

	public static void main(String[] args) 
	{
		int n=0;
		System.out.println("Enter a Number");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println(n);
	}

}
