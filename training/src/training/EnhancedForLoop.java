 package training;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int a[][] = {   {1},
						{1,2},
						{1,2,3}
					};
		
		
		for(int k[] : a)
		{
			for(int l : k)
			{
				System.out.print(l + " ");
			}
			System.out.println();
		}
		}
	}
