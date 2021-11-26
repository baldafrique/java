package chap05;

public class SquareFloat {

	public static void main(String[] args) {
		for (float x = 0.0F; x <= 1.0F; x += 0.001F) {
			System.out.printf("%5.3f %10.7f\n", x, x * x);
		}
	}	

}
