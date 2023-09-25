package 제어문.반복문;

import java.util.Scanner;

public class 숫자비교 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pre = 0;  //앞이 큰 경우 카운트
		int post = 0; // 뒤가 큰 경우 카운트
		while (true) {
			
			
			System.out.println("숫자1입력>> ");
			int num_1 = sc.nextInt();
			System.out.println("숫자2입력>> ");
			int num_2 = sc.nextInt();
			if (num_1 > num_2) {
				System.out.println("숫자1이 더 큽니다");
				pre++;
			} else if (num_1 == num_2) {
				System.out.println("두 숫자가 동일합니다.");
				
			}else {
				System.out.println("숫자2가 더 큽니다");
				post++;
			}
			System.out.print("더 하시겠습니까? 종료(x),  계속(o)");
			String exit = sc.next();
			char exit2 = exit.charAt(0);   // 첫번째 문자 1개를 가지고 옵니다.
			
			if (exit2 == 'x' || exit2 == 'X') {
				System.out.println("시스템을 종료합니다");
				System.out.println("앞이 큰 경우는 " + pre + "회 입니다");
				System.out.println("뒤가 큰 경우는 " + post + "회 입니다");
				System.exit(0);
			}else if (exit2 == 'o' || exit2 == 'O') {
				
			}else {
				System.out.println("o 또는 x만 입력해주세요");
			}
	}

}
}