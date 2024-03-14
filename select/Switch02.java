package select;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		System.out.println("학점을 넣으세요");
		Scanner sc = new Scanner(System.in);
		String grade = sc.nextLine();

		switch(grade) {
		case "A","B": 
			System.out.println("아주열심히하셨군요~~~!!");
			break;
		case "C":
			System.out.println("남들만큼하셨네요~~~");
			break;
		case "D":
			System.out.println("조금더노력이필요합니다.");
			break;
		case "F":
			System.out.println("교수실로찾아오세요");
			break;
		
		}
		

	}

}
