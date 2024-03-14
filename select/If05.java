package select;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		// 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		// 양수인 경우
		if (num > 0) {
			if (num %2==0) {
				System.out.println("짝수입니다.");
			}
			else {
				System.out.println("홀수입니다.");
			}
		}
		else {
			System.out.println("양수가 아닙니다.");
		}
		   // 홀수, 짝수 딴다

		// 양수가 아닌 경우, 양수가 아니다
	}

}
