package tasks;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		/**
		 * only two divisors = 1 and itself
		 * composite number
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		boolean gl = checkPrime(num);
		
		if(gl) {
			 System.out.println("It is a prime number");
		}else {
			System.out.println("It is a composite number"); 
		}
		
   }
	
	public static boolean checkPrime(int n) {
		int cnt=0;
		for(int i=2; i<n; i++) {
			if(n % i ==0) {
				cnt++;
			}
		}
		
		if(cnt > 0) {
			return false;
		}else {
			return true;
		}
	}
	
}
