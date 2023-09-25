package 연산자;

import javax.swing.JOptionPane;

public class 논리연산자3 {

	public static void main(String[] args) {
		String 가입id = "root";
		String 가입pw = "pass";

		String 로그인id = JOptionPane.showInputDialog("아이디 입력");
		String 로그인pw = JOptionPane.showInputDialog("패스워드 입력");
		// String은 부품(class)
		if (가입id.equals(로그인id) && 가입pw.equals(로그인pw)) {
			JOptionPane.showConfirmDialog(null, "로그인 성공");		
		}else {
			JOptionPane.showConfirmDialog(null, "로그인 실패");		
		}

	}

}
