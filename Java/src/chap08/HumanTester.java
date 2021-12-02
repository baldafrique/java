package chap08;

public class HumanTester {

	public static void main(String[] args) {
		Human gildong = new Human();
		Human chulsu = new Human();
		
		gildong.name = "gildong";
		gildong.height = 170;
		gildong.weight = 60;
		
		chulsu.name = "chulsu";
		chulsu.height = 166;
		chulsu.weight = 72;
		
		System.out.println(gildong.name);
		System.out.println(gildong.height);
		System.out.println(gildong.weight);
		System.out.println(chulsu.name);
		System.out.println(chulsu.height);
		System.out.println(chulsu.weight);
		
	}

}
