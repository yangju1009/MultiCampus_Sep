package 제어문.순차문;

import javax.swing.JOptionPane;

public class 확인문제1_bmi {

	public static void main(String[] args) {
		String w1 = JOptionPane.showInputDialog("몸무게 입력(kg)");
		String h1 = JOptionPane.showInputDialog("신장 입력(m)");
		
		int w2 = Integer.parseInt(w1);
		double h2 = Double.parseDouble(h1);
		double bmi = (double)w2 / (h2 * h2);
		
		System.out.printf("%.4f",  bmi);
		

	}

}
