package aaaa;

import java.util.Scanner;

public class JAVA122P03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			num = sc.nextInt();
			if (num % 2 == 0) {
			    sum += num;
			}
		} while (num > 0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
	}

}
