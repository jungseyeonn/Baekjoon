package q2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		for (int i=0;i<N;i++) {
			for (int j=1;j<N-i;j++) {
				System.out.print(" ");
			}
			for (int d=0;d<=i;d++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
