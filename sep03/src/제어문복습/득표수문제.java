package 제어문복습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 득표수문제 {

	public static void main(String[] args) {
		//1. 입력받는것
		Scanner sc = new Scanner(System.in);

		int iu = 0;
		int jae = 0;
		int bts = 0;

		while (true) {
			System.out.println("1)아이유 2)유재석 3)방탄 4)종료 ");
			int score = sc.nextInt();
			if (score == 1) {
				iu++;
			} else if (score == 2) {
				jae++;
			} else if (score == 3) {
				bts++;
			} else if (score == 4) {
				System.out.println("종료합니다.");
				System.out.println("아이유 득표수>> " + iu + "표");
				System.out.println("유재석 득표수>> " + jae + "표");
				System.out.println("BTS 득표수>> " + bts + "표");
				if (iu > jae && iu > bts) {
				    System.out.println("아이유가 가장 많은 득표를 받았습니다.");
				} else if (jae > iu && jae > bts) {
				    System.out.println("유재석이 가장 많은 득표를 받았습니다.");
				} else if (bts > iu && bts > jae) {
				    System.out.println("BTS가 가장 많은 득표를 받았습니다.");
				} else {
				    System.out.println("동점이 있거나 아직 투표가 이루어지지 않았습니다.");
				}
				// 심화문제 추가 ==> winner 프린트!
				System.exit(0);
			}else {
				System.out.println("다시 입력해주세요.");
			} // while
			
		}

	}

}
