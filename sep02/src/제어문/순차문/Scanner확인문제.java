package 제어문.순차문;

import java.util.Scanner;

public class Scanner확인문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나의 이름은? ");
		String name = sc.next();
		
		

		System.out.println("나의 이름은 " + name + " 입니다.");
		
		System.out.println("나의 키는? ");
		double hei = sc.nextDouble();
		System.out.println("나의 키는 " + hei + " 입니다.");
		
		System.out.println("나의 몸무게는? ");
		double w = sc.nextDouble(); 
		System.out.println("내 내년 몸무게는 " + (w - 10));
		
		System.out.println("나는 저녁을 먹었나요? ");
		boolean d = sc.nextBoolean(); 
		System.out.println("나는 저녁을 " + d + " 했습니다.");
		
		System.out.println("나의 좌우명은? ");
		sc.nextLine();
		String t = sc.nextLine(); 
		System.out.println("나의 좌우명은 " + t + " 입니다.");


	}

}
