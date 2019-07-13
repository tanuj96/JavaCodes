package training;

public class JumpingDemo {
     public static void main(String[] args)
     {
    	 for(int i=1;i<=10;i++)
    	 {
    		 if(i==5)
    		  continue; // continue
    		 
    		 System.out.println("Value is " + i); 
    	 }
    	 System.out.println(); 
    	 System.out.println(); 
    	 System.out.println(); 
    	 System.out.println(); 
    	 for(int j=1;j<=10;j++)
    	 {
    		 if(j==5)
    		  break; // break
    		 
    		 System.out.println("Value is " + j); 
    	 }
     }
}
