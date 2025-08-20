import java.util.Scanner;

public class evenorodd {
	
	public static void main (String[]args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int no= sc.nextInt();
		
		if (no%2==0)
		{
			System.out.println("even number");
			
		}
		else
		{
			System.out.println("odd number");
			
		}
		
		
	}

}
