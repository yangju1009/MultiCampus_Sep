package 배열기본;

public class 배열맛보기 {
	public static void main(String[] args) {
		// 배열: 많은 양의 데이터를 다루기 위함.
		int age = 100;
		System.out.println(age);

		// 1. 배열을 만들 때 이미 값을 알고 있는 경우
		int[] addr = { 1, 1, 2, 3 }; // 참조형 변수 (변수에 주소 저장)
		System.out.println(addr);

		// 2. 배열을 만들 때 값을 모르고 있는 경우
		int[] addr2 = new int[1000];
		System.out.println(addr2);
		// 1 1 2 3
		// 1 2 4 3

		int[] 내답 = { 1, 2, 4, 3 };

	}
}
