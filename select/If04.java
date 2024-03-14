package select;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		int num = sc.nextInt();
		char grade;
		if (num >= 90 ) {
			grade = 'A';
		}
		else if (num >= 80) {
			grade = 'B';
		}
		else if (num >= 70) {
			grade = 'C';
		}
		else if (num >= 60) {
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("학점은 : "+ grade + "입니다.");
	}

}
