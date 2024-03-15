package select;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		int a = (num / 100); 
		int b = (num % 100)/ 10;
		int c = num % 10;
		
		
		int sumnum = a + b + c;
		
		System.out.println("각 자릿수의 합 =" + sumnum);
				

	}

}
