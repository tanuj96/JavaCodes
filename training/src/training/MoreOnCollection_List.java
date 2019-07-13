package training;

import java.util.ArrayList;
import java.util.List;

public class MoreOnCollection_List {

	public static void main(String[] args) 
	{
		List values = new ArrayList(); // List has method to insert element between the elements
		values.add(4);  // Integer v = new Integer(4);
		values.add(6);
		values.add(9);
		values.add(2, 2);
		
	for(Object o : values)
	{
		System.out.println(o);
	}
	}

}
