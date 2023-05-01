package q9498;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		if (num>=90 && num<=100) {
			System.out.println("A");
		} else if (num>=80) {
			System.out.println("B");
		} else if (num>=70) {
			System.out.println("C");
		} else if (num>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		int s = num/10;
		switch(s) {
		case 10 :
		case 9 :
		System.out.println("A");
		break;
		case 8 : System.out.println("B");
		break;
		case 7 : System.out.println("C");
		break;
		case 6 : System.out.println("D");
		break;
		default : System.out.println("F");
		
		}
	}
}
