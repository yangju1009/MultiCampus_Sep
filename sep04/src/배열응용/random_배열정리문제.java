package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class random_배열정리문제 {

	public static void main(String[] args) {
		Random r = new Random();
		// 랜덤한 값 1000개
		int[] n = new int[1000]; // {0,0,0,0,0,0,0,....}
		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(1000); // 범위는 0~999까지의 값
		}
		System.out.println(Arrays.toString(n));
		// 300이상 개수
		int count_300 = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 300) {
				count_300++;
			}
		}
		System.out.println("300이상 수의 개수는 " + count_300);
		System.out.println("==============");

		// 400 이상 개수
		int count_400 = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 400) {
				count_400++;
			}
		}
		System.out.println("400이상 수의 개수는 " + count_400);
		System.out.println("==============");

		// 500 이상 개수
		int count_500 = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 500) {
				count_500++;
			}
		}
		System.out.println("500이상 수의 개수는 " + count_500);
		System.out.println("==============");

		// 600 이상 개수
		int count_600 = 0;
		for (int i = 0; i < n.length; i++) {
			if (n[i] >= 600) {
				count_600++;
			}
		}
		System.out.println("600이상 수의 개수는 " + count_600);
		System.out.println("==============");

		// 오름차순 정렬 후, 배열 전체 목록 프린트
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));

		// 최대값, 최소값 프린트
		int min = n[0];
		int max = n[n.length - 1];
		System.out.println("최소값은 " + min + " 입니다");
		System.out.println("최고값은 " + max + " 입니다");

	}

}
