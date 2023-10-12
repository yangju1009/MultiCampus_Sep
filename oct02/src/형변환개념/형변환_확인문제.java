package 형변환개념;

import java.util.ArrayList;

public class 형변환_확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000); // int
		me.add(189.1); // double
		me.add(false); // boolean
		me.add('남'); // char
		// 1.전체 프린트
		System.out.println(me);
		// 2.돈 1000을 꺼내서 2000을 더해 프린트
		// int <-- Integer <-- Object
		int money = (int) me.get(0) + 2000;
		System.out.println(money);
		// 3.키 189.1을 꺼내서 10을 더해 프린트
		double h = (double) me.get(1) + 10;
		System.out.println(h);
		// 4. 아침여부 flase를 꺼내서 아침을 먹었으면 배불러요 아니면 배고파요
		boolean meal = (boolean) me.get(2);
		// boolean <-- Boolean <-- Object
		if (meal) { // true
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}
		// 5. 남이면 주민 1,3 여면 주민번호 2,4
		char gen = (Character) me.get(3);
		if (gen == '남') {
			System.out.println("주민번호는 1,3입니다");
		} else {
			System.out.println("주민번호는 2,4입니다");
		}
		//ArrayList에는 다양한 타입을 넣을 수 있기는 하다.
		//실제로 코드할 때 다양한 타입을 넣는 경우가 정말 흔치 않다.
		//매번 넣을 때마다 형변환을 해야할까??
		ArrayList<String> list = new ArrayList<String>();
		//ArrayList<Integer> list 
		//<클래스>만 쓸 수 있음. <기본형>사용불가
		//<>를 쓰면 객체를 생성할 때 타입을 결정할 수 있음.
		//형변환을 할 필요가 없음.
		//제너릭(제너럴, 일반적인) 프로그래밍
		list.add("홍길동");
		list.add("김길동");
		list.add("송길동");
		String s = list.get(1);

	}

}
