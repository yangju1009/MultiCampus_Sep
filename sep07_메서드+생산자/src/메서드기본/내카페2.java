package 메서드기본;

import java.util.Random;

public class 내카페2 {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		//메서드 이름이 하나로 똑같다.
		//입력형태가 다양하다.
		//하나의 이름으로 여러형태를 만들 수 있다.
		//다형성(오버로딩)제공
		//입력값의 순서와 타입, 개수를 가지고 구분
		int answer = cal2.add(1,2);
		System.out.println(answer);
		
		double answer2 =  cal2.add(1, 2.2);
		System.out.println(answer2);
		
		double answer3 =  cal2.add(1.1, 2.2) + cal2.add(10.1, 20.2);
		System.out.println(answer3);
		
		String answer4 =  cal2.add("가", 2);
		System.out.println(answer4);
		
		int [] answer5 = cal2.add();
		System.out.println(answer5[0]+100);
		
		Random r = new Random();
		int x=r.nextInt();
		double y=r.nextInt(100);
		
	}

}
