package training;

class Printer
{
	public void show(Number i) //we used Number class bcoz it will pass all int , float etc & this Number is a Abstract class
	{
		System.out.println(i);
	}
}

public class NeedofAbstract {

	public static void main(String[] args) {
		Printer obj = new Printer();
		
		for(int j=0;j<=10;j++)
		{
		obj.show(j);
		}
	}

}
