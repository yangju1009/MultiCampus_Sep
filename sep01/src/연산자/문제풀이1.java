package 연산자;

import javax.swing.JOptionPane;

public class 문제풀이1 {
	
	public static void main(String[] args) {
		//JAVA01 확인문제(p154)
		//class 문제풀이1
		//1. 입력
		String today = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String doing = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		
		//2. 처리
		String result = "오늘 " + today + "에 수업후 나는 " + doing + "할 예정";
		
		//3. 출력
		System.out.println(result);
		
	}

}
