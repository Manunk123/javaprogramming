
public class palindromereverse {

	
	public static void main(String[]args)
	{  
		
		String s2= "madam";
       String rev= "";
       
      for(int i = s2.length()-1; i>=0; i--)
      {
    	  
    	  rev= rev+s2.charAt(i);
    	  
    	  
      }

      
       if (s2.equals(rev))
       {
    	   
    	   System.out.println("is palidrome number");
    	   
       }
       else
       {
    	   
    	   System.out.println("is not a palindrome number");
    	   
       }		
	  
		
		
	}
}
