package 연산자;

import javax.swing.JOptionPane;
//패키지이름은 java, javax로 사용하지 않는다.
// 

public class 암호몸무게 {

	public static void main(String[] args) {

		char 가입pw = 'p';

		String 로그인pw = JOptionPane.showInputDialog("패스워드 입력");
		char 로그인pw2 = 로그인pw.charAt(0);

		if (가입pw == 로그인pw2) {
			JOptionPane.showMessageDialog(null, "PASS!");
		} else {
			JOptionPane.showMessageDialog(null, "재입력!");
		}
		
		String wei_ch = JOptionPane.showInputDialog("몸무게 변화량 입력");
		
		double wei_ch2 = Double.parseDouble(wei_ch);
		if (wei_ch2 > 2 && 가입pw == 로그인pw2) {
			System.out.println("다이어트 성공");
		} else {
			System.out.println("내일 다시 도전!");
		}

	}
}
