package loop;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		System.out.print("양의 숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if( num > 0) {
		    	
		    	int sum = 0;
				for ( int i = 1; i <= num; i++) {
					sum += i;	
				}
				System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");
				
		}else {
			System.out.print("양의 숫자가 아닙니다.다시 입력하세요 :");
			Scanner s = new Scanner(System.in);
			int nu = s.nextInt();
			int sum = 0;
			for ( int i = 1; i <= nu; i++) {
				sum += i;
		}
			System.out.println("1부터" + num + "까지의 합은" + sum + "입니다.");

	}
}
}
