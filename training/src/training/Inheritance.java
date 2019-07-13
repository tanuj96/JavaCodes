package training;

class Calculator //Super Class, Parent Class , Base Class
{
	public int add(int i,int j)
	{
		return i+j;
	}
}

class CalculatorAdv extends Calculator  //  Sub Class , Child Class , Derive Class
{
	public int sub(int i,int j)
	{
		return i-j;
	}
}

class CalculatorVeryAdv extends CalculatorAdv  
{
	public int mul(int i,int j)
	{
		return i*j;
	}
}
public class Inheritance {

	public static void main(String[] args) 
	{
		CalculatorVeryAdv obj = new CalculatorVeryAdv();
		int result1 = obj.add(5, 4);
		int result2 = obj.sub(9, 4);
		int result3 = obj.mul(5, 4);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
