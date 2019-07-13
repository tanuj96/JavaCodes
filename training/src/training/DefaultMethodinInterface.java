package training;
//(till java 1.7) In Abstract class we can define as well as declare method whether iN Interface we cant define method only declaration of method is possible
// in 1.8 and higher java interfaces can be defined
@FunctionalInterface
interface Demo  // this is functional interface because it has only one abstract method and it can have any number of default methods
{
	void abc();
	default void show()  // in java 1.8 update with default keyword we can define methods in Interface
	{
		System.out.println("In Show");
	}
}

class DemoImpl implements Demo
{
	public void abc()
	{
		System.out.println("In Abc");
	}
	public void show()  // default method in interface can be overrided
	{
		System.out.println("In New show");
	}
}
public class DefaultMethodinInterface {

	public static void main(String[] args)
	{
	   Demo obj = new DemoImpl();
	   obj.abc();
	   obj.show();
	}

}
