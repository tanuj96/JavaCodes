package training;

class C
{
	int i;
	public void show()
	{
		System.out.println("in C");
	}
}

class D extends C
{
	int i;
	@Override
	public void show()  // this method overrides the method of class C which is super class this is called overriding
	{  
		super.i = 8;
		super.show();
		System.out.println("in D");
	}
}

public class OveridingDemo 
{

	public static void main(String[] args) 
	{
	D obj = new D();
	obj.show();
	}
}
