package 제어문복습;

import java.util.Scanner;

public class 반복누적 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값과 종료값을 순서대로 입력해주세요.");
		int start = sc.nextInt();  //String --> int, 3
		int end = sc.nextInt(); // String --> int, 200
		
		// 1-10까지 다 더해보자.
		
		int sum = 0; // 누적시키는 변수는 반복문 밖에서 만들어야함.
		for (int i = start; i <= end; i++) {
			// 초기값, 조건식, 증감식 ==> 유한반복 <--> 무한반복 while(true)
			// 조건식은 비교하는 연산이 나와야하고, 반드시 결과가 논리형(true)
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
