package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.UnderlineAction;

public class 계산기문제 {

	public static void main(String[] args) {
		// 필요한 부품을 ram에 다 가져다 놓아야 한다.
		JFrame f = new JFrame();

		f.setSize(400, 800);
//		f.setBackground(Color.blue);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);

		// 물흐르듯 순서대로 붙여줍니다.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton plus = new JButton(); // 200
		plus.setText("더하기");
		plus.setBackground(Color.yellow); // 배경색
		plus.setForeground(Color.black); // 글자색

		JButton minus = new JButton(); // 200
		minus.setText("빼 기");
		minus.setBackground(Color.orange); // 배경색
		minus.setForeground(Color.black); // 글자색

		JLabel l1 = new JLabel();
		l1.setText("숫자1");
		l1.setForeground(Color.black); // 글자색
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.red); // 배경색
		t1.setForeground(Color.white); // 글자색

		JLabel l2 = new JLabel();
		l2.setText("숫자2");
		l2.setForeground(Color.black); // 글자색
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.blue); // 배경색
		t2.setForeground(Color.white); // 글자색

		JLabel under = new JLabel();
		under.setText("결과들어가는 곳");

		// 이미지 부품, Image 파일은 프로젝트 바로 아래에 있어야 합니다.
		ImageIcon icon = new ImageIcon("계산기1.jpg");
		Image img = icon.getImage(); // ImageIcon을 Image로 변환
		int newWidth = 400; // 원하는 너비
		int newHeight = 300; // 원하는 높이
		Image newImg = img.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH); // 새로운 크기로 이미지 조절
		ImageIcon newIcon = new ImageIcon(newImg); // 새로운 이미지로 ImageIcon 생성

		JLabel imgLabel = new JLabel(newIcon); // 새로운 이미지로 JLabel 생성

		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에다가 버튼을 클릭했을 때 처리 내용을 써주면 됨.!
				System.out.println("플러스 버튼을 눌렀군.");
				// t1, t2에 글자를 가지고 와서 ram에 저장해보자.
				String s1 = t1.getText();
				String s2 = t2.getText();

				if (s1.equals("") || s2.equals("")) {
					JOptionPane.showMessageDialog(f, "숫자를 입력해주세요");
				} else {
					// 숫자로 변경해서 그 결과값을 모니터에 출력하기
					int n1 = Integer.parseInt(s1);
					int n2 = Integer.parseInt(s2);
					int sum = n1 + n2;

					// System.out.println("더한 값은" + sum);

					under.setText("더한 값은 " + sum);

					// t1, t2 입력한 값 지우자
					n1 = 0;
					n2 = 0;
				}

			}
		});
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에다가 버튼을 클릭했을 때 처리 내용을 써주면 됨.!
				System.out.println("마이너스 버튼을 눌렀군.");
				String s1 = t1.getText();
				String s2 = t2.getText();

				if (s1.equals("") || s2.equals("")) {
					JOptionPane.showMessageDialog(f, "숫자를 입력해주세요");
				} else {
					int n1 = Integer.parseInt(s1);
					int n2 = Integer.parseInt(s2);
					int result = n1 - n2;
					// 결과값 출력
					under.setText("뺀 값은 " + result);
					// t1, t2 입력한 값 지우자
					n1 = 0;
					n2 = 0;
				}
			}
		});

		f.add(imgLabel);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(under);

		// Font - 글자스타일 담당(글자체, 진하게 여부, 글자크기)
		Font font = new Font("맑은 고딕", 1, 40);
		plus.setFont(font);
		minus.setFont(font);
		l1.setFont(font);
		l2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		under.setFont(font);

		// 위에서 설정한 거 다 보이도록 설정. 맨 끝줄에 넣어야함
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// x를 누르면 종료!
		// 이 설정이 없으면, 보이지만 않게 된 것임.
		f.setVisible(true);

	}

}
