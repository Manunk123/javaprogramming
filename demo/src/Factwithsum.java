
public class Factwithsum {

	  int fac=1; static int sum=0;
	public  void factsum(int no) {
	
	for (int i =1; i<=no; i++)
	{
		
		fac= fac*i;
		sum = sum+(fac);
	}
	System.out.println(no+"!"+fac);
	
	}
	
	public static void main(String[] args) {
		Factwithsum t= new Factwithsum();
	   t.factsum(2);
	   
	   System.out.println(+sum);
		

	}

}
