package select;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은?");
		int sc = num.nextInt();
        System.out.print("원기둥의 높이는?");
        int se = num.nextInt();
        System.out.println("원기둥의 부피는"+((sc*sc*3.14)*se));
        
	}

}
