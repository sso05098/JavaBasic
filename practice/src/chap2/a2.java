package chap2;

import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		int b = a * a;
		System.out.println(a + "의 제곱은 " + b);

	}

}
