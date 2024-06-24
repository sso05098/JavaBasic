package chap2;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		int a = sc.nextInt();
		System.out.print("원기둥의 높이는? ");
		int b = sc.nextInt();

		double c = a * a * 3.14 * b;

		System.out.println("원기둥의 부피는 " + c);

	}

}
