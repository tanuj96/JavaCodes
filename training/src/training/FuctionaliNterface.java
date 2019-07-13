package training;

/*  Types of Interface:
 	--> Normal Interface (Interface with more than one method)
 	--> Single Abstract Method Interface ~ SAM (Interface with only one method) , now in Java 8 SAM interface is called Funtional Interface
 	--> Marker Interface (Interface with no method)
 */
@FunctionalInterface
interface de
{
	void show();
}
public class FuctionaliNterface {

	public static void main(String[] args)
	{
		de obj = () -> System.out.println("I am the best"); // lambda expression
		
		obj.show();
	}
}


// Lambda Expression can be used by the knowledge of Functional Interface (Lambda Expression a concept from Scala)