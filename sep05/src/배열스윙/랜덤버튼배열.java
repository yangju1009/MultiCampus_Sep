package 배열스윙;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 랜덤버튼배열 {
    static int count = 0;
  
    static StringBuilder reservedSeats = new StringBuilder(); 

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("랜덤버튼 만들기");
        f.setSize(700, 800);
        f.setLayout(new FlowLayout());
        f.getContentPane().setBackground(Color.black);

        JButton[] buttons = new JButton[500];
        Color[] colors = { Color.black, Color.blue, Color.red, Color.orange, Color.yellow, Color.gray, Color.pink,
                Color.green, Color.darkGray, Color.lightGray };

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setText((i + 1) + "번 ");
            Random r = new Random();
            int c1 = r.nextInt(10);
            int c2 = r.nextInt(10);

            buttons[i].setBackground(colors[c1]);
            buttons[i].setForeground(colors[c2]);

            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton clickedButton = (JButton) e.getSource();
                    String seatNumber = clickedButton.getText().replace("번", "").trim();

                    if (reservedSeats.toString().contains(seatNumber)) {
                        JOptionPane.showMessageDialog(f, "이미 예약된 좌석입니다");
                    } else {
                        reservedSeats.append(seatNumber).append(" ");
                        count++;
                        int pay = count * 10000;
                        JOptionPane.showMessageDialog(f,
                                seatNumber + "좌석을 선택하셨습니다 " + "현재 결제 금액은 " + pay + "원 입니다." + "좌석번호는 " + reservedSeats.toString() + "입니다");
                    }
                }
            });
            f.add(buttons[i]);
        }

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
