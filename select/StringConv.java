package select;

import java.util.Scanner;

public class StringConv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 개의 숫자를 입력하세요 : ");
		int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        
        int max = a;
        if ( a > max);
        if ( b > max) {
        	max = b;
        }
        if ( c > max) {
        	max =c;
        	}
        System.out.println("가장 큰 수는"+c+"입니다.");
        }
	}


