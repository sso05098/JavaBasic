package aaaa;

import java.util.Scanner;

public class JAVA122P01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if ( num >= 19 ) {
			System.out.println("성년");
		}else {
			System.out.println("미성년");
		}

	}

}
