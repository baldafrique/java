package chap03;

import java.util.Scanner;

public class Med3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int med = 0;
		
		// abc acb  
		// bac cab
		// bca cba
		
		if (a < b) { // a<b<c a<c<b c<a<b a<b=c a=c<b 
			if (b < c) med = b;
			else if (a < c && c < b) med = c;
			else if (c < a) med = a;
			else if (b == c) med = b;
			else if (a == c) med = c;
		}
		else if (a > b) { // b<a<c c<b<a b<c<a b<a=c c=b<a
			if (a < c) med = a;
			else if (c < b) med = b;
			else if (b < c && c < a) med = c;
			else if (a == c) med = a;
			else if (b == c) med = b;
		}
		// a==b
		else { // a=b<c c<a=b a=b=c
			med = a;
		}
		
		System.out.println(med);
		
		scanner.close();
	}

}
