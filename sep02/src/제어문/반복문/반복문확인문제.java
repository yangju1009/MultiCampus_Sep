package 제어문.반복문;

public class 반복문확인문제 {

	public static void main(String[] args) {
		// * 10개 출력
		for (int i = 0; i < 10; i++) {
			// 처음값 조건식 증감값
			// 0~9
			System.out.print("*");
		}

		System.out.println("\n"); // 줄 바꿈

		// 커피* 5개 출력
		for (int i = 0; i < 5; i++) {

			System.out.print("커피*");
		}

		System.out.println("\n"); // 줄 바꿈

		for (int i = 0; i < 3; i++) {

			System.out.println("커피*우유");
		}

		System.out.println("\n"); // 줄 바꿈
		for (int i = 1; i < 4; i++) {

			System.out.println(i + " :  짱!");
		}
	}

}
