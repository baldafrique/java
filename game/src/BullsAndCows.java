import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class BullsAndCows {
	
	public static int playGame() throws IOException {
		Random r = new Random();
		int x, y, z;
		
		x = Math.abs(r.nextInt() % 9) + 1;
		
		do {
			y = Math.abs(r.nextInt() % 9) + 1;
		} while (x == y);
		
		do {
			z = Math.abs(r.nextInt() % 9) + 1;
		} while (x == z || y == z);
		
//		System.out.println(x + ", " + y + ", " + z);
		
		return playGame(x, y, z);
	}
	
	public static int playGame(int x, int y, int z) throws NumberFormatException, IOException {
		int count, strike, ball;
		int[] usr = new int[3];
		int[] com = {x, y, z};
		
		count = 0;
		System.out.println("숫자 야구 게임");
		
		do {
			count++;
			
			do {
				System.out.println("\n카운트: " + count);
				BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("1번째 숫자: ");
				usr[0] = Integer.parseInt(in.readLine());
				
				System.out.print("2번째 숫자: ");
				usr[1] = Integer.parseInt(in.readLine());
				
				System.out.print("3번째 숫자: ");
				usr[2] = Integer.parseInt(in.readLine());
				
				if ((usr[0] == 0) || (usr[1] == 0) || (usr[2] == 0)) {
					System.out.println("0은 입력하지 마세요. 다시 입력해주세요.");
				}
				else if ((usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9)) {
					System.out.println("1부터 9까지의 숫자 중 하나를 입력해주세요. 다시 입력해주세요.");
				}
				else if ((usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[2] == usr[0])) {
					System.out.println("모두 다른 숫자를 입력해주세요. 다시 입력해주세요.");
				}
			} while ((usr[0] == 0) || (usr[1] == 0) || (usr[2] == 0) || 
					 (usr[0] > 9) || (usr[1] > 9) || (usr[2] > 9) || 
					 (usr[0] == usr[1]) || (usr[1] == usr[2]) || (usr[2] == usr[0]));
			
			strike = ball = 0;
			
			if (usr[0] == com[0]) strike++;
			if (usr[1] == com[1]) strike++;
			if (usr[2] == com[2]) strike++;
			
			if (usr[0] == com[1]) ball++;
			if (usr[0] == com[2]) ball++;
			if (usr[1] == com[0]) ball++;
			if (usr[1] == com[2]) ball++;
			if (usr[2] == com[0]) ball++;
			if (usr[2] == com[1]) ball++;
			
			System.out.println("Strike: " + strike + " Ball: " + ball);
		} while ((strike < 3) && (count < 11));
		
		return count;
	}

	public static void main(String[] args) throws IOException {
		int result;
		
		if (args.length == 3) {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = Integer.parseInt(args[2]);
			result = playGame(x, y, z);
		}
		else {
			result = playGame();
		}
		
		System.out.println("");
		if (result <= 2) {
			System.out.println("참 잘했어요!");
		}
		else if (result <= 5) {
			System.out.println("잘했어요!");
		}
		else if (result <= 9) {
			System.out.println("보통이네요!");
		}
		else {
			System.out.println("분발하세요!");
		}
		
	}

}
