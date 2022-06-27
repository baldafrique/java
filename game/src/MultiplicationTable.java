import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MultiplicationTable {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		Random r = new Random();
		int x = Math.abs(r.nextInt() % 9) + 1;
		int y = Math.abs(r.nextInt() % 9) + 1;
		int z = x * y;
		
		System.out.printf("구구단 %d단에 대한 문제입니다.\n", x);
		System.out.printf("%d * %d = ", x, y);
		int input = Integer.parseInt(in.readLine());
		System.out.println(z == input ? "맞았습니다!" : "틀렸습니다. 정답은 " + z + "입니다.");
	}

}
