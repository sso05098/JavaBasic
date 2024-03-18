package loop;

public class For06 {

	public static void main(String[] args) {

		for (int i = 2; i <= 9; i++) {
			System.out.println("[ 구구단" + (i) + "단 ]");
			for (int a = 1; a <= 9; a++) {
				System.out.println((i) + " X " + a + "=" + (i*a));
			}
		}
	}

}
