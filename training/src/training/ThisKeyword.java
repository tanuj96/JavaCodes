
package training;

class Calcu 
{
	int num1;
	int num2;
	int result;  

	
	
    public Calcu(int num1,int num2)
    {
    	this.num1 = num1; // current object or current instance
    	this.num2 = num2;
    }
}

public class ThisKeyword {
	public static void main(String[] args)
	{
		Calcu obj = new Calcu(4,5); 		
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}

}
