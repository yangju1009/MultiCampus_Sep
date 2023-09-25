package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 중국집주문 {

	public static void main(String[] args) {
		JFrame f = new JFrame();

		f.setSize(800, 1200);
		f.setResizable(false);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		int n1_count = 0;

		JButton a1 = new JButton();
		a1.setText("짬뽕");
		a1.setBackground(Color.red); // 배경색
		int a1_count = 0;
		int a1_price = 8000;
		

		JButton a2 = new JButton();
		a2.setText("우동");
		a2.setBackground(Color.orange); // 배경색
		int a2_count = 0;
		int a2_price = 7000;

		JButton a3 = new JButton();
		a3.setText("짜장");
		a3.setBackground(Color.lightGray); // 배경색
		int a3_count = 0;
		int a3_price = 6000;

		// 주문 총 개수
		
		JLabel n1 = new JLabel();
		n1.setText(" 개수 : 0 개");

		JLabel n2 = new JLabel();
		n2.setText("결제금액");
		n2.setForeground(Color.red); // 글자색
		// 이미지
		JLabel img1 = new JLabel();
		// 이미지 부품, Image파일은 프로젝트 바로 아래에 있어야함.
		ImageIcon icon = new ImageIcon("중국집.jpg");
		img1.setIcon(icon);

		// 나열할 것들 목록
		f.add(a1); // 짬뽕
		f.add(a2); // 우동
		f.add(a3); // 짜장
		f.add(n1); // 갯수
		f.add(img1); // 중국집이미지
		f.add(n2); // 결제금액

		// Font - 글자스타일 담당(글자체, 진하게 여부, 글자크기)
		Font font = new Font("맑은 고딕", 1, 50);
		a1.setFont(font);
		a2.setFont(font);
		a3.setFont(font);
		n1.setFont(font);
		n2.setFont(font);

		f.setVisible(true);

	}

}
