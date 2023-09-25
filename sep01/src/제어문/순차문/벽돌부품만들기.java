package 제어문.순차문;

import java.awt.FlowLayout;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 벽돌부품만들기 {

	public static void main(String[] args) {
		// 벽돌 벽돌1 = new 벽돌();
		// 세탁기 세탁기1 = new 세탁기();
		// 자전거 자전거1 = new 자전거();

		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setVisible(true);

		JFrame f2 = new JFrame();

		// 배치해주는 부품을 따로 설정하지 않으면 다 가운데로 들어가버림.
		// 물흐르듯이 순서대로 배치해주는 부품을 써야한다.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b = new JButton();
		b.setText("나의 정보 확인");

		f.add(b); // f에 b를 올려라
		JTextField t1 = new JTextField();
		JTextField t2 = new JTextField();
		JTextField t3 = new JTextField();
		Date date2 = new Date();

		f.setVisible(true);

		// Date date1
		Date date1 = new Date();
		// Random r
		Random r = new Random();
		// JButton b

	}

}
