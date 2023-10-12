package 스태틱;

public class 우리집 {

	public static void main(String[] args) {
		딸 d1 = new 딸("홍길순", "여");
		딸 d2 = new 딸("홍길진", "여");
		//a.딸들의 정보 출력
		System.out.println(d1);
		System.out.println(d2);
		//b. 딸이 몇명인지 카운트
		System.out.println(딸.count+"명 입니다");
		//c. 아빠 지갑 남은 돈 프린트
		System.out.println("아빠 지갑에 남은 돈은 "+(딸.d_money-딸.count*1000)+"원 입니다");

	}

}
