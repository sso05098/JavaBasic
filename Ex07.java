package select;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean a = x%4==0;
		boolean b = x%5==0;
		System.out.println("1)"+(a && b));
		boolean c = x%4==0;
		boolean d = x%5==0;
		System.out.println("2)"+(c || d));
		boolean e = x%4==0;
		boolean f = x%5==0;
		boolean g = x%20==0;
		System.out.println((e || f)&g);
		
		

	}
}
