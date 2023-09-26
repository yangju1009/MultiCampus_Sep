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

	static int a1_count = 0;
	static int a1_total = 0;
	static int a2_count = 0;
	static int a2_total = 0;
	static int a3_count = 0;
	static int a3_total = 0;
	static int n1_count = 0;
	static int n1_total = 0;

	public static void main(String[] args) {
		JFrame f = new JFrame();

		f.setSize(800, 1200);
		f.setResizable(false);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		// 주문 총 개수

		JLabel n1 = new JLabel();
		n1.setText(" 개수 : " + n1_count + "개");
		JLabel under = new JLabel();
		under.setText("");

		int a1_price = 8000;

		JButton a1 = new JButton();
		a1.setText("짬뽕");
		a1.setBackground(Color.red); // 배경색

		a1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭했을 때 처리하고 싶은 내용을 쭉 써주면 된다.
				a1_count++;
				n1_count++;
				a1_total = a1_price * a1_count;
				n1.setText("개수 : " + n1_count + "개");
				n1_total = a1_total + a2_total + a3_total;
				n1_total = a1_total + a2_total + a3_total;
				under.setText("결제 금액은 총 "+n1_total+"원 입니다");
				
			}
		});

		int a2_price = 7000;
		JButton a2 = new JButton();
		a2.setText("우동");
		a2.setBackground(Color.orange); // 배경색
		a2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a2_count++;
				n1_count++;
				n1.setText("개수 : " + n1_count + "개");
				a2_total = a2_price * a2_count;
				n1_total = a1_total + a2_total + a3_total;
				under.setText("결제 금액은 총 "+n1_total+"원 입니다");
			}
		});

		JButton a3 = new JButton();
		a3.setText("짜장");
		a3.setBackground(Color.lightGray); // 배경색
		int a3_price = 6000;
		a3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a3_count++;
				n1_count++;
				n1.setText("개수 : " + n1_count + "개");
				a3_total = a3_price * a3_count;
				n1_total = a1_total + a2_total + a3_total;
				under.setText("결제 금액은 총 "+n1_total+"원 입니다");
			}
		});

		JLabel n2 = new JLabel();
		n2.setText("결제금액");
		n2.setForeground(Color.red); // 글자색
		
		JButton reset = new JButton();
		reset.setText("초기화");
		reset.setBackground(Color.white);
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				a1_count = 0;
				a1_total = 0;
				a2_count = 0;
				a2_total = 0;
				a3_count = 0;
				a3_total = 0;
				n1_count = 0;
				n1_total = 0;
				n1.setText("개수 : " + n1_count + "개");
				n1_total = a1_total + a2_total + a3_total;
				under.setText("결제 금액은 총 "+n1_total+"원 입니다");
			}
		});

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
		f.add(reset);
		f.add(under);
		

		// Font - 글자스타일 담당(글자체, 진하게 여부, 글자크기)
		Font font = new Font("맑은 고딕", 1, 50);
		Font font2 = new Font("맑은 고딕", 1, 20);
		a1.setFont(font);
		a2.setFont(font);
		a3.setFont(font);
		n1.setFont(font);
		n2.setFont(font);
		under.setFont(font);
		reset.setFont(font2);


		f.setVisible(true);

	}

}
