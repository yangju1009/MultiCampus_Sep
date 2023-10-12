package 메서드활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class 넷플릭스드라마 {

	public static int start = 2;

	public static void main(String[] args) {
		String[] title = { "국민사형투표", "너의 시간 속으로", "도적:칼의 소리", "마스크걸", "힙하게" };
		String[] img = { "1.JPG", "2.JPG", "3.JPG", "4.JPG", "5.JPG" };
		double[] score = { 7.1, 7.8, 7.2, 7.5, 7.2 };
		JFrame f = new JFrame("넷플릭스 한국 드라마");
		f.setSize(800, 1050);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 라벨 3개
		JLabel top = new JLabel(title[2]);
		ImageIcon icon = new ImageIcon(img[2]);
		JLabel mid = new JLabel();
		mid.setIcon(icon);
		JLabel bottom = new JLabel("IMDb 점수: " + String.valueOf(score[2]));
		// 버튼 2개
		JButton left = new JButton("<<");
		JButton right = new JButton(">>");
		// 폰트
		Font font = new Font("맑은 고딕", 1, 50);
		top.setFont(font);
		left.setFont(font);
		right.setFont(font);
		bottom.setFont(font);

		// 색지정
		left.setBackground(Color.white);
		left.setForeground(Color.black);
		right.setBackground(Color.white);
		right.setForeground(Color.black);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (start == 0) {
					JOptionPane.showMessageDialog(f, "첫번째 입니다!");
				} else {
					start--; // 1번
					top.setText(title[start]);
					bottom.setText("IMDb 점수: " + String.valueOf(score[start]));
					ImageIcon icon = new ImageIcon(img[start]);
					mid.setIcon(icon);
				}
			}
		}); // 왼쪽 버튼 기능
		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (start == 4) {
					JOptionPane.showMessageDialog(f, "마지막입니다");
				} else {

					start++;
					top.setText(title[start]);
					bottom.setText("IMDb 점수: " + String.valueOf(score[start]));
					ImageIcon icon = new ImageIcon(img[start]);
					mid.setIcon(icon);
				}
			}
		}); // 오른쪽 버튼 기능

		// 순서 정렬
		f.add(top, BorderLayout.NORTH);
		f.add(left, BorderLayout.WEST);
		f.add(mid, BorderLayout.CENTER);
		f.add(right, BorderLayout.EAST);
		f.add(bottom, BorderLayout.SOUTH);
		f.setVisible(true);

	}

}
