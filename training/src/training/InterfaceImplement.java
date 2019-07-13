package training;

interface $a
{
	void show();
}

class ab implements $a
{
	public void show()
	{
		System.out.println("Anything implemented");
	}
}
public class InterfaceImplement {

	public static void main(String[] args) 
	{
		ab obj = new ab();
		obj.show();
	}

}
