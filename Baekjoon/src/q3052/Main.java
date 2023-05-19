package q3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] na = new int[10];
		int cnt = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			na[i] = arr[i] % 42;

		}
		for (int i = 0; i < 42; i++) {
			boolean chk = false;
			for (int j = 0; j < 10; j++) {
				if (i == na[j]) {
					chk = true;
				}
			}
			if (chk == true) {
				cnt++;
			}
		}
		System.out.print(cnt);
		sc.close();
	}
}
