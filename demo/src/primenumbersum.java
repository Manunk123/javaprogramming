
public class primenumbersum {

	
	
	public static void main(String[]args)


       {
		
		  int temp=0;
		  int sum=0;
		  
		  
		  for (int i=1;i<=100;i++)
		  {
			  int count=0;
			  for(int j=2; j<=i-1;j++)
			  {
				  if (i%j==0)
					  
				  {
					  count++;
					  
				  }
				  
				  if(count==2)
				  {
					  sum+=i;
				  }
					  
			  }
				  
				  
				 
				  {
					  System.out.println(+sum);
				  }
			  }
		  }
		
		
		
		}
	


