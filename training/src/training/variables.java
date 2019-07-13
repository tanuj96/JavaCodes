package training;

public class variables {
	public static void main(String args[])
	{
		int a=5;  //variable is defined(variable name can include $,_ but no other characters are allowed other then these two , no.s like 4,5 etc can also be in variable name but not placed on first place)
	    System.out.println(a);
	    
	    int num=8; // 4 bytes -> 32 bits ->  -2,147,483,648 to 2,147,483,648
	    System.out.println(num);
	    
	    double percent=5.5; // 8 bytes -> 64 bits 
	    System.out.println(percent);
	    
	    float percent1=5.5f; // 4 bytes -> compulsory to specify f
	    System.out.println(percent1);
	    
	    short s=5;  // 2 bytes -> 16 bits -> -32768 to 32767 -> Advantage of using short is it takes less storage
	    System.out.println(s);
	    
	    byte b=1; // 1 byte -> 8 bits -> -128 to 127
	    System.out.println(b);
	    
	    long abc = 5l;  // 8 bytes -> 64 bits -> compulsory to specify l
	    System.out.println(abc);
	    
	    char c = 'A';
	    c= 66; // it will print B bcoz 66 is the ascii code for B
	    System.out.println(c);
	    
	    double d1=5;  // implicit conversion
	    System.out.println(d1); // output will be 5.0 bcoz double supports float value only
	    
	    int k= (int)5.6; // type casting , explicit conversion
	    System.out.println(k);
	}
}
