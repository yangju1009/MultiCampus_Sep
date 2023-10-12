package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1600, 700);
		f.setTitle("로그인화면"); // void

		// 라벨3개, 텍스트필드2개, 버튼2개
		JLabel top = new JLabel();
		// top.setText("이미지 들어가는곳");
		JLabel id1 = new JLabel();
		id1.setText("ID: ");
		JLabel pw1 = new JLabel();
		pw1.setText("PW: ");
		JButton login = new JButton();
		// login.setText("로그인");
		login.setBackground(Color.white);
		JButton reset = new JButton();
		// reset.setText("초기화");
		reset.setBackground(Color.white);

		JTextField id2 = new JTextField(10);
		JPasswordField pw2 = new JPasswordField(10);
		id2.setBackground(Color.yellow);
		pw2.setBackground(Color.pink);

		// 레이아웃 flowlayout
		// 폰트
		Font font = new Font("맑은 고딕", 1, 50);
		top.setFont(font);
		id1.setFont(font);
		id2.setFont(font);
		pw1.setFont(font);
		pw2.setFont(font);
		login.setFont(font);
		reset.setFont(font);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); // void
		// 이미지 삽입
		ImageIcon icon1 = new ImageIcon("잠금.jpg");
		ImageIcon icon2 = new ImageIcon("login.jpg");
		ImageIcon icon3 = new ImageIcon("reset.JPG");
		top.setIcon(icon1);
		login.setIcon(icon2);
		reset.setIcon(icon3);

		f.add(top); // void

		f.add(id1);
		f.add(id2);
		f.add(pw1);
		f.add(pw2);
		f.add(login);
		f.add(reset);

		// 버튼에 이벤트기능을 붙여준다.
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Login버튼을 눌렀을 때 실행할 내용을 넣어주세요.
				// 버튼 하나당 함수하나로 매칭
				System.out.println("login 버튼 클릭함");
				// 1. id2, pw2에서 입력한 데이터를 가지고
				String id3 = id2.getText();
				String pw3 = pw2.getText();
				// 2. id2의 값이 root인지, pw2의 값이 1234인지 확인
				if (id3.equals("root") && pw3.equals("1234")) {
					System.out.println("로그인 성공");
					JOptionPane.showMessageDialog(f, "성공");
					//일기장 화면 띄우기
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
					f.setVisible(false);
					
				} else {
					System.out.println("로그인 실패. 다시확인 바람");
					JOptionPane.showMessageDialog(f, "실패, 다시확인");
				}
				// 둘다 맞으면 맞아요, 출력 둘 중 하나라도 틀리면 틀려요.
				// 정상코드는 아닌데 가짜로 이런식으로 하겠다라고 써넣은것
				// 주석형태로 써놓았음.
				// 가짜코드 ==> 의사코드(수도코드)

			}
		}); // login

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset버튼 눌렀을 때 처리하고 싶은 내용
				// 버튼하나당 함수하나로 매칭
				System.out.println("reset 버튼 클릭함");
				id2.setText("");
				// void <--> String id3 = id2.getText(); void xxx
				pw2.setText("");

			}
		}); // reset

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 위 설정한 것들을 보이도록 설정.
		f.setVisible(true);

	}

}
