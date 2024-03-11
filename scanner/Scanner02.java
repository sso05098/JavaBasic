package scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	   
		System.out.println("원의 반지름을 입력하세요.(cm): ");
		int name = sc.nextInt();
		System.out.println("원의 넓이는" + (name*name*3.14) + "cm입니다.");
	}

}
