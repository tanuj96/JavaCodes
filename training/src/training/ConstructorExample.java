package training;

class Calci  //this is class this can have two things the variables & the methods
{
	int num1;
	int num2;
	int result;  // instance variable

	//constructor is pre defined here which is only allocating the memory
	
    public Calci() //this is default constructor to assign values to variable & also constructor never return anything thatswhy theres no need to specify the return type
    {
    	num1 = 5;
    	num2 = 5;
    	System.out.println("in constructor");
    }
    
    public Calci(int n) // 2nd constructor which has different parameters
    {
    	num1 = n;
    	num2 = n;
    }
    
    public Calci(double d, int n) // 3rd constructor which has different parameters
    {
    	num1 = (int) d;
    	num2 = n;
    }
	
}

public class ConstructorExample {
	public static void main(String[] args)
	{
		Calci obj = new Calci(7.5,8); //calci(); is a constructor it has same name as the class and defines the memory allocated to the object
		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
