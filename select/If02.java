package select;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		// 홀짝 판단하여 출력
		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}

	}

}
