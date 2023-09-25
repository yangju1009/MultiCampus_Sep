package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		// 1. 배열 만들 때 기준 - 값을 모르고 있는 경우
		int[] s = new int[5]; // 자동 초기화 {0,0,0,0,0}
		// 2. 배열 만들 때 기준 - 값을 이미 알고 있는 경우
		int[] s2 = { 1, 2, 3, 4, 5 };

		// s가 가르키고 있는 첫번째 값에다가 100을 넣어보자.
		s[0] = 100;
		// s가 가르키고 있는 세번째 값에다가 200을 넣어보자.
		s[2] = 200;
		// s가 가르키고 있는 마지막 값에다가 300을 넣어보자.
		s[s.length - 1] = 300;

		// s와 s2의 개수(사이즈size, 길이length)를 프린트
		System.out.println("s의 사이즈는 " + s.length);
		System.out.println("s2의 사이즈는 " + s2.length);
		// id는 램에 저장자리에 대한 위치를 부여할 때 0부터 부여
		// s가 가르키는 첫번째 값 프린트
		System.out.println(s[0]);

		// s가 가르키는 세번째 값 프린트
		System.out.println(s[2]);

		// s가 가르키는 마지막 값 프린트
		System.out.println(s[s.length - 1]);

		// s가 가르키고 있는 첫번째 값과 세번째 값을 더해서 프린트
		int sum = (s[0] + s[2]);
		System.out.println("s가 가르키고 있는 첫번째 값과 세번째 값을 더하면 " +sum);
		// s가 가르키고 있는 첫번째 값과 세번째 값이 동일한지 프린트
		System.out.println(s[0] == s[2]);
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s[i]);
		}
		for (int x : s) {
			//출력용으로만 사용
			System.out.println(x);
		}

	}
}
