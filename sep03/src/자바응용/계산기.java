package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.peer.LightweightPeer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		// 필요한 부품을 ram에 다 가져다 놓아야 한다.
		JFrame f = new JFrame();

		f.setSize(600, 1200);
//		f.setBackground(Color.blue);
		f.getContentPane().setBackground(Color.LIGHT_GRAY);

		// 물흐르듯 순서대로 붙여줍니다.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton plus = new JButton(); // 200
		plus.setText("더하기");
		plus.setBackground(Color.yellow); //배경색
		plus.setForeground(Color.black); //글자색


		JButton minus = new JButton(); // 200
		minus.setText("빼 기");
		minus.setBackground(Color.orange); //배경색
		minus.setForeground(Color.black); //글자색


		
		JLabel l1 = new JLabel();
		l1.setText("숫자1");
		l1.setForeground(Color.black); //글자색
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.red); //배경색
		t1.setForeground(Color.white); //글자색

		
		JLabel l2 = new JLabel();
		l2.setText("숫자2");
		l2.setForeground(Color.black); //글자색
		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.blue); //배경색
		t2.setForeground(Color.white); //글자색
		
		//글자넣는 부품 JLabel
		JLabel img1 = new JLabel();
		//이미지 부품, Image파일은 프로젝트 바로 아래에 있어야함.
		ImageIcon icon = new ImageIcon("계산기.jpg");
		img1.setIcon(icon);

		f.add(img1);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);

		// Font - 글자스타일 담당(글자체, 진하게 여부, 글자크기)
		Font font = new Font("맑은 고딕", 1, 50);
		plus.setFont(font);
		minus.setFont(font);
		l1.setFont(font);
		l2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);

		// 위에서 설정한 거 다 보이도록 설정. 맨 끝줄에 넣어야함
		f.setVisible(true);

	}

}
