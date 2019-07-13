package training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass
{
		public static void main(String[] args)
			{
				List<Integer> values = new ArrayList<>(); // Collection with generics to specify data type
				values.add(4);  
				values.add(6);
				values.add(9);
				values.add(2);
				
				Collections.sort(values); // for sorting values in ascending order
				
		//		Collections.reverse(values);  // for reversing the order
				
							for(Integer o : values)
								{
									System.out.println(o);
								}
			}
}
