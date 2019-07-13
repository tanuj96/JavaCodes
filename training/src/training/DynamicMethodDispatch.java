package training;

class E
{
	public void show()
	{
		System.out.println("in E");
	}
}

class F extends E
{
	public void show()
	{
		System.out.println("in F");
	}
/*	public void config()
	{
		System.out.println("in F config");
	}*/
}

class G extends E
{
	public void show()
	{
		System.out.println("in G");
	}
}
public class DynamicMethodDispatch {
//compile time & run time polymorphism
	public static void main(String[] args) {
		E obj = new F();//runtime polymorphism ,,  // reference of E whether object of F it is taking into account show of F bcoz object is of F
		obj.show();
	//	obj.config(); // this method config will not work bcoz ref is not of F
		obj = new G();
		obj.show(); // Dynamic Method Dispatch
	}
}
