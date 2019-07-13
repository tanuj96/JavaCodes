package training;

class One
{
	 final int DAY; // final makes the variable constant
	 public One()
	 {
		 DAY = 5;
	 }
}

public class FinalKeywordDemo 
{
	public static void main(String[] args)
	{
		One obj = new One();
		System.out.println(obj.DAY);
	}
}
