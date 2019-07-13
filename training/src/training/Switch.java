package training;

public class Switch {
	public static void main(String[] args)
	{
		int n = 4;
		
		switch(n)  // switch case works with int , char, string with java update 1.7 but switch case dont works with double
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:	
			System.out.println("Six");
			break;
		default:
			System.out.println("No Match");
		}
	}

}
