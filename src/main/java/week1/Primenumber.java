package week1;

import java.util.Scanner;

public class Primenumber {
	

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 for (int i=2; i<n; i++)
		 {
			 if (n % i == 0)
			 {
				break; 
			 }
			 else
			 {
				 System.out.println("Given number is a prime number");
			 }
		 }
	
	}
}
