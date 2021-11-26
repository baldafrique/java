package chap04;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    
	    for (int i=2; i<n; i++) {
	    	if (n%i == 0) {
	    		System.out.println("소수가 아닙니다.");
	    		scanner.close();
	    		return;
	    	}
	    }
	    System.out.println("소수입니다.");
		
		scanner.close();
	}

}
