package training;

class Abc
{
	public int add(int ... n) //now values will reach here as array //variable length arguments
	{
		int sum=0;
		for(int i : n)
		{
			sum += i;
		}
		return sum;
	}
}
public class Varargs {

	public static void main(String[] args)
	{
		Abc obj = new Abc();
		System.out.println(obj.add(4,5,6,8,10));
	}
}
