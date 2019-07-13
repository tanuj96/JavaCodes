package training;

class $b
{
	public void show()
	{
		System.out.println("in A show");
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		$b obj = new $b()
				{
					public void show()  // this is anonymous class to change the output value without changing the original class
					{
						System.out.println("I am the best");
					}
				};
		obj.show();
	}

}
