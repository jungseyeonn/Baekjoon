package q2441;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		for (int i=0;i<num;i++) {
			for (int j=5-i;j<5;j++) {
				System.out.print(" ");
			}
			for (int d=0;d<num-i;d++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
