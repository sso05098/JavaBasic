package method;

import java.util.Scanner;

public class Sum01 {
    
	public static int getNumberKeyboard(String message) {
		System.out.print(message);
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	public static void printSum(int num) {
		int Sum = 0;
		for (int i = 1; i <= num; i++) {
			Sum = Sum + i;
		}
		System.out.println(Sum);
	}
	
	public static void main(String[] args) {
		int num;
		while ((num = getNumberKeyboard("양의 숫자를 입력하세요 : ")) > 0) {
			printSum(num);
		}
System.out.println("다음에 또 봐요~~~~~~");
	}

}
