package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndGenerics {

	public static void main(String[] args) 
	{
		List<Integer> values = new ArrayList<>(); // Collection with generics to specify data type
		values.add(404);  
		values.add(609);
		values.add(903);
		values.add(207);
		
	//	Comparator<Integer> c = (i, j) -> { return i%10>j%10?1:-1; };
		Collections.sort(values, (i, j) -> i%10>j%10?1:-1);

		
					for(Integer o : values)
						{
							System.out.println(o);
						}
	}

}
