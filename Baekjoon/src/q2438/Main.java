package q2438;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String star = "*";
		int n = sc.nextInt();
		sc.close();
		for (int i=0;i<n;i++) {
			System.out.println(star);
			star = star+"*";
		}
	}
}
