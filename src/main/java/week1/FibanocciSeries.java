package week1;

public class FibanocciSeries {

	public void fibono()
	{
		 int n1=0,n2=1,n3 =0;    
		 System.out.print(n2);    
		 while(n3 < 100)
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3; 
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibanocciSeries f = new FibanocciSeries();
		f.fibono();

	}

}
