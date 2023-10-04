package 부품사용하기;

import 부품만들기.계좌;

public class 계좌정보프린트 {
	public static void main(String[] args) {
		계좌 me = new 계좌();
		me.이름 = "홍길동";
		me.계좌이름 = "튼튼적금";
		me.금액 = 10000;

		계좌 mom = new 계좌();
		mom.이름 = "박길동";
		mom.계좌이름 = "튼튼예금";
		mom.금액 = 20000;

		계좌 dad = new 계좌();
		dad.이름 = "홍기사";
		dad.계좌이름 = "다음적금";
		dad.금액 = 30000;

		System.out.println(me);
		System.out.println(dad);
		System.out.println(mom);
	}
}
