package 자바응용;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 계산기_예시 {

    private JFrame frame;
    private JTextField inputField;
    private double num1 = 0.0;
    private double num2 = 0.0;
    private String operator = "";
    private boolean isOperatorClicked = false;

    // 생성자의 이름을 클래스 이름과 동일하게 변경
    public 계산기_예시() {
        frame = new JFrame("간단한 계산기");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        inputField = new JTextField(10);
        inputField.setFont(new Font("Arial", Font.PLAIN, 24));
        inputField.setHorizontalAlignment(JTextField.RIGHT);
        inputField.setEditable(false);

        frame.add(inputField, BorderLayout.NORTH);
        frame.add(new JScrollPane(createButtonPanel()), BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private Component createButtonPanel() {
		// TODO Auto-generated method stub
		return null;
	}

	// 나머지 코드는 그대로 유지

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new 계산기_예시();
            }
        });
    }
}
