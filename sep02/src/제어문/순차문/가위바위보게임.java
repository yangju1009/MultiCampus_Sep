package 제어문.순차문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int win = 0;
        int lose = 0;
        int draw = 0;

        while (true) {
            int com = r.nextInt(3); // 0, 1, 2 중 하나를 무작위로 선택

            System.out.print("가위(0), 바위(1), 보(2) 중 하나를 선택하세요: ");
            int me = sc.nextInt();

            System.out.println("컴퓨터: " + com);
            System.out.println("당신: " + me);

            if (me == com) {
                System.out.println("무승부!");
                draw++;
            } else if ((me == 0 && com == 2) || (me == 1 && com == 0) || (me == 2 && com == 1)) {
                System.out.println("당신의 승리입니다!");
                win++;
            } else {
                System.out.println("컴퓨터의 승리입니다!");
                lose++;
            }

            System.out.print("종료하시겠습니까? (X 입력 시 종료): ");
            String exit = sc.next();
            if (exit.equalsIgnoreCase("X")) {
                System.out.println("시스템을 종료합니다");
                System.out.println("총 경기 횟수: " + total + "회");
                System.out.println("당신의 승리 횟수: " + win + "회");
                System.out.println("당신의 패배 횟수: " + lose + "회");
                System.out.println("무승부 횟수: " + draw + "회");
                System.exit(0);
            }

            total++;
        }
    }
}