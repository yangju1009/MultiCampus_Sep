package 제어문.조건문;

import java.util.Scanner;

public class Switch확인문제 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신이 먹고싶은 점심 메뉴는? ");
		
		String menu = sc.next();
		
		switch (menu) {
		case "짜장면":
			System.out.println("중국집으로 가요");
			//break를 포함하고 있는 {}를 찾으세요.!
			break;//벗어나겠다.
		case "라면":
			System.out.println("분식집으로 가요");
			break;
		case "회":
			System.out.println("횟집으로 가요");
			break;

		default:
			System.out.println("그냥 안먹어요");
			break;
		}
	}
	
}
