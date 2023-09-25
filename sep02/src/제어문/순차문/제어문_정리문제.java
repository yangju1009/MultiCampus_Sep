package 제어문.순차문;

import java.util.Scanner;

public class 제어문_정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 제어문 정리문제 1
		
		System.out.println("ID를 입력하세요 ");
		String id = sc.next();
		System.out.println("PW를 입력하세요 ");
		int pw = sc.nextInt();
		if(id.equals("root") && pw == 1234 ) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		// 제어문 정리문제 2
		System.out.println("사과 구매 개수 ");
		int ap_count = sc.nextInt();
		System.out.println("사과 개당 가격 ");
		int ap_price = sc.nextInt();
		System.out.println("딸기 구매 개수 ");
		int st_count = sc.nextInt();
		System.out.println("딸기 개당 가격 ");
		int st_price = sc.nextInt();
		int ap_total = ap_count * ap_price;
		int st_total = st_count * st_price;
		System.out.println("사과 구매 가격은 "+ ap_total + "원 입니다");
		System.out.println("딸기 구매 가격은 "+ st_total + "원 입니다");
		System.out.println("전체 구매 가격은 "+ (st_total+ap_total) + "원 입니다");
		
	}

}
