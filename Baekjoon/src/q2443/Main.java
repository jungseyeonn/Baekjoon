package q2443;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		for(int i=0;i<num;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for (int j=i;j<=2*num-(i+2);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
