package 배열기본;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		// 1. 정수입력
		int[] n = new int[5];

		for (int i = 0; i < n.length; i++) {
			System.out.println("숫자를 입력하세요. " + (n.length-i) + "번 남았습니다");
			n[i] = sc.nextInt();
		}
		System.out.println(n[0] + n[2]);

		// 2. 문자열 입력
		String[] s = new String[3];
		for (int i = 0; i < s.length; i++) {
			System.out.println("프로그램 언어를 입력하세요. " + (s.length-i) + "번 남았습니다");
			s[i] = sc.next();
		}
		System.out.println(s[0]+" 보다는 "+ s[1]);
	}

}
