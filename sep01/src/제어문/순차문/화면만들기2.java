package 제어문.순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 화면만들기2 {
	public static void main(String[] args) {
		// 1. 필요한 부품을 rem에 다 준비합시다.

		// 다 import 해주는 단축키 - 컨트롤 + 쉬프트 + O
		JFrame f = new JFrame();
		f.setSize(600, 600);

		JButton b = new JButton();
		b.setText("버튼");
		JTextField t1 = new JTextField(20);
		JTextField t2 = new JTextField(20);
		JTextField t3 = new JTextField(20);
		FlowLayout flow = new FlowLayout();
		//글자 써주는 부품 JLabel
		JLabel l1 = new JLabel();
		l1.setText("이름");
		JLabel l2 = new JLabel();
		l2.setText("나이");
		JLabel l3 = new JLabel();
		l3.setText("취미");
		JLabel l4 = new JLabel();
		l4.setText("특기");
		
		f.setLayout(flow);
		f.add(b);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(l4);
		// setVisible은 항상 맨끝에 넣어야함
		// 위에 작업한 것들을 보이는것이기 때문.
		f.setVisible(true);

	}

}
