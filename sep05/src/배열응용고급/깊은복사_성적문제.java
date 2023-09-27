package 배열응용고급;

import java.util.Arrays;

public class 깊은복사_성적문제 {

	public static void main(String[] args) {
		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] term1 = { 44, 66, 22, 99, 100 };
		int[] term2 = term1.clone();
		term2[0] = 22;
		term2[2] = 88;
		System.out.println("1학기 성적>> " + Arrays.toString(term1));
		System.out.println("2학기 성적>> " + Arrays.toString(term2));
		// 1학기 2학기 성적 중 동일한 성적과목수
		int count1 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] == term2[i]) {
				count1++;
			}
		}
		System.out.println("");
		System.out.println("작년과 동일한 점수 과목수는 " + count1 + "과목 입니다");
		System.out.println("--------------------------");
		// 2. 성적이 오른 과목수
		int count2 = 0;
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count2++;
			}
		}
		System.out.println("성적이 오른 과목수는 " + count2 + "과목 입니다");
		System.out.println("--------------------------");
		// 3. 성적이 오른 과목명
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				System.out.println(과목명[i] + " 과목 성적이 오르셨습니다");
			}
		}

	}

}
