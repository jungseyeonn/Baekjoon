package q2438;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		String star = "*";
//		int n = sc.nextInt();
//		for (int i = 0; i < n; i++) {
//			System.out.println(star);
//			star = star + "*";
//		}

		// 이중for문 쓰기
		int num = sc.nextInt();
		sc.close();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
