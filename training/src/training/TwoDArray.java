package training;

public class TwoDArray {

	public static void main(String[] args)
	{
	int a[][] = {   {1,2,3,4},
					{2,4,6,8},
					{5,6,7,8} 
				};
	
	for(int i=0;i<3;i++)
			{
				for(int j=0;j<4;j++)
				{
					System.out.print(a[i][j] + " " );
				}
				System.out.println();
			}
	}
	}

