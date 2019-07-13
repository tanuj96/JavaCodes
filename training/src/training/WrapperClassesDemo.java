package training;

// int, float, double
// in Java instead of using int we should be using "Integer" class
class Interger
{
	
}

public class WrapperClassesDemo {

	public static void main(String[] args) {
		
	//	int i = 5; // Primitive datatype thats not right in java, in java everything should be with OOPS
//		Integer ii = new Integer(i); // here ii is not a primitive variable it is a ref variable //this integer is called a wrapper class // putting primitive value 'i' in object is called boxing or wrapping
		
	//	int j = ii.intValue();  // unboxing or unwrapping
		
		/*   Integer value = i; // AutoBoxing or AutoWrapping
		
		     int k = value; // AutoUnBoxing or AutoUnWrapping   */
		
		
		String str = "123";
		
		int n = Integer.parseInt(str);
		
		System.out.println(n);
	}

}
