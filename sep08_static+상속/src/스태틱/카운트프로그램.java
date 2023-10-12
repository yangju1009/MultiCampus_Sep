package 스태틱;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 카운트프로그램 {
	public static int count; // 전역변수 0으로 초기화

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운트 프로그램");
		f.setSize(700, 800);

//		FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout());

		JButton plus = new JButton("+1");
		plus.setBackground(Color.white);

		JButton reset = new JButton("Reset(0)");
		reset.setBackground(Color.white);
		plus.setOpaque(true);
		JButton minus = new JButton("-1");
		minus.setBackground(Color.white);
		JLabel number = new JLabel("0");
		
		

		Font font = new Font("맑은 고딕", Font.BOLD, 75);
		plus.setFont(font);
		reset.setFont(font);
		minus.setFont(font);

		number.setFont(new Font("맑은 고딕", Font.BOLD, 180));

		f.add(plus);
		f.add(reset);
		f.add(minus);
		f.add(number);

		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");
			}
		});

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");
			}
		});
		
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");
			}
		});

		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
