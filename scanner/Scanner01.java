package scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("정수 타입 숫자를 입력하세요:");
	int a = sc.nextInt();
	System.out.println("실수 타입 숫자를 입력하세요:");
	double b = sc.nextDouble();
	
	System.out.println(a+"+"+b+"="+(a+b));
	System.out.println();
	
	}
 
}
