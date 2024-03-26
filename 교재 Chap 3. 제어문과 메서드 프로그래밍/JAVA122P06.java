package aaaa;

import java.util.Scanner;

public class JAVA122P06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("철수 : ");
		String c = sc.nextLine();
		System.out.print("영희 : ");
		String y = sc.nextLine();
		
		if ((c.equals("r") && y.equals("s")) || (c.equals("p") && y.equals("r")) || (c.equals("s") && y.equals("p"))){
			System.out.println("철수, 승!");
		} else if (c.equals(y)) {
			System.out.println("무승부!");
		}else {
			System.out.println("영희, 승!");
		}
	}
}
