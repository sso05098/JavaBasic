package scanner;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println("당신의 이름 : " + name);

	}
}
