package method;

public class NineNine01 {

	public static void printNineNine(int i) {
		System.out.println("[ 구구단 " + i + "단 ]");
		for (int j = 1; j <= 9; j++) {
			System.out.println(i + " X " + j + " = " + (i*j));
		}
	}
	
	public static void main(String[] args) {
		
		for (int i = 2; i <= 9; i++) {
			printNineNine(i);
		}

	}

}
