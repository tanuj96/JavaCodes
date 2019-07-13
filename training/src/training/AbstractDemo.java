package training;

abstract class Human   // when you make a class abstract its not possible to directly create its object
{
	public abstract void eat(); // this is a declared method , it is compulsory to write abstract to declare a method (This is called as Abstract Method) & whenever theres is a abstract method its class should be abstract
	
	public void walk()
	{
		System.out.println("All Humans Walk");
	}
}

class Man extends Human  // now this Man class is Concrete Class
{
	public void eat()
	{
		
	}
}
public class AbstractDemo {

	public static void main(String[] args) 
	{
		Human obj = new Man();
		obj.walk();
		
	}
}

