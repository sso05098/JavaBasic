package loop;

import java.util.Scanner;

public class Star01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	    for ( int i = 1; i <= num; i++ ) {
	    	for ( int j = 1; j <= i; j += 1) {
	    	System.out.print("*");
	    }
	   System.out.println(); 
	}
}
}