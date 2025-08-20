import java.util.Scanner;

public class Armstrongnumber {

	public static void main (String[]args)

	{
		Scanner sc = new Scanner (System.in);
	    System.out.println("enter the armstrong number");
	    int num = sc.nextInt();
	   int sum=0,temp=num,d;
	   
	   
	    
	   
	   while (num!=0)
	   {
		   d=num%10;
		   sum= sum+(d*d*d);
		   num = num/10;
		   
		   
		   
	   }
		if (temp==sum)
		{
			System.out.println("number is the armstrong");
			
		}
		else {
			System.out.println("number is the not armstrong");
		}
	}
}
