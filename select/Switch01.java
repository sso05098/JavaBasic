package select;

import java.net.MulticastSocket;
import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = num % 2;
		
		switch(a) {
		case 0:
			System.out.println("짝수입니다");
			break;
			default :
				System.out.println("홀수입니다.");
		
		}
	}

}
