package training;

interface Writer
 {
	void write();  // in interface all methods are by default public & abstract therefore no need to define 
 }

class Pen extends Abcm implements Writer
{
	public void write()
	{
		System.out.println("I am a Pen");
	}
}

class Pencil implements Writer
{
	public void write()
	{
		System.out.println("I am a Pencil");
	}
}

class Kit
{
	 public void doSomething(Writer p)
	 {
		 p.write();
	 }
}
class Abcm
{

}
public class InterfaceDemo 
{
   public static void main(String[] args)
   {
	   Kit k = new Kit();
	   Writer p = new Pen();
	//   Writer pc = new Pencil();
	   
	   k.doSomething(p);
	   
   }
}
