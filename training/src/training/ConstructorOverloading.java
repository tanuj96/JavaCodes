package training;

class Caso
{
	int num1;
	int num2;
	String operation;
	public Caso()
	{
		num1 = 0;
		num2 = 0;
		operation = "Nothing";
	}
	public Caso(int i)
	{
		num1 = i;
		num2 = 0;
		operation = "Nothing";
	}
	public Caso(int i,int j, String op)
	{
		num1 = i;
		num2 = j;
		operation = "op";
		System.out.println(op + (i + j)  + " " +  "in 3rd Constructor ");
	}
}

public class ConstructorOverloading {
	public static void main(String[] args)
	{
//		Caso obj = new Caso(4,5,"Addition of num1 & num2 is  ");
	}

}


