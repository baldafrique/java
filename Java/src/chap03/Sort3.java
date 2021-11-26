package chap03;

import java.util.Scanner;

public class Sort3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int t;
		
		if (a > b) {
			t = a;
			a = b;
			b = t;
		}
		
		if (b > c) { // 최댓값이 c에 저장됐으므로 다음으로 해야 할 것은 남은 a와 b에서 큰 값을 b에 저장하는 것
			t = b;
			b = c;
			c = t;
		}
		
		if (a > b) { // 2위를 결정짓는 패자 부활전같은 것 
			t = a;
			a = b;
			b = t;
		}
		
		System.out.println(a + " " + b + " " + c);
		scanner.close();
	}

}
