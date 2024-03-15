package select;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨온도(F)를 입력하세요.");
		double num =sc.nextDouble();
		double a = (((num - 32)/9)*5);
	    System.out.println("섭씨온도(c)는"+a+"입니다");	
				

	}

}
