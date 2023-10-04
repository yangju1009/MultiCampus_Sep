package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기쓰기화면 {
	// 멤버 변수
	// 멤버메서드(*)
	public void open() {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.black);
		f.setTitle("일기장");
		f.setSize(500, 700);

		JLabel t = new JLabel();
		t.setText("오늘의 제목 ");
		t.setForeground(Color.white);
		JTextField t1 = new JTextField(10);
		JLabel w = new JLabel();
		w.setText("오늘의 날짜 ");
		w.setForeground(Color.white);
		JTextField t2 = new JTextField(10);
		JLabel s = new JLabel();
		s.setText("오늘의 내용 ");
		s.setForeground(Color.white);
		JTextArea t3 = new JTextArea(5, 10);
		JButton save = new JButton();
		save.setText("파일에 저장");
		save.setBackground(Color.white);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		// 폰트
		Font font = new Font("맑은 고딕", 1, 30);
		t.setFont(font);
		w.setFont(font);
		s.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		save.setFont(font);

		f.add(t);
		f.add(t1);
		f.add(w);
		f.add(t2);
		f.add(s);
		f.add(t3);
		f.add(save);

		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String title = t1.getText();
				String day = t2.getText();
				String content = t3.getText();
				try {
					FileWriter file = new FileWriter(day + ".txt");
					file.write(title + "\n");
					file.write(day + "\n");
					file.write(content + "\n");
					file.close(); // stream을 닫는다.
					System.exit(0);
				} catch (IOException e1) {
					// 대처할 내용 쓰면됨
					System.out.println("에러발생함");
					e1.printStackTrace(); // 자세하게 에러정보도 볼수 있음.
				}

			}
		});

		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
//	public void open() {

}
