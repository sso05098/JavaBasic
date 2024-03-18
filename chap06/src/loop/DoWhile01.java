package loop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int sum = 0;
		
		do {
			System.out.println("숫자를 입력하세요 : ");
			a = sc.nextInt();
			sum += a;
		}while ( a != 0);
		System.out.println("지금까지 입력한 숫자의 합은 " + sum + "입니다.");

	}

}
