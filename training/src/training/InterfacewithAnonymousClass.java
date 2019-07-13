package training;

interface $c
{
	void show();
}
public class InterfacewithAnonymousClass {

	public static void main(String[] args) {
		$c obj = new $c()
				{
			public void show()
			{
				System.out.println("I am the best");
			}
				};
		obj.show();
	}
}