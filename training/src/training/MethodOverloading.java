package training;

class Casio
{
	public void add(int i, int j)
	{
		 System.out.println(i+j);
	}
	public void add(int i, int j, int k)
	{
		 System.out.println(i+j+k);
	}
	public void add(double i, double j)
	{
		 System.out.println(i+j);
	}
}

public class MethodOverloading {
	public static void main(String[] args)
	{
		Casio obj = new Casio();
		obj.add(5,2);
		obj.add(5,2,4);
		obj.add(5.5,4.5);
	}

}
