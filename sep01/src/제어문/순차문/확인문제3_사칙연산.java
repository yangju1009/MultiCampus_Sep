package 제어문.순차문;

import javax.swing.JOptionPane;

public class 확인문제3_사칙연산 {

	public static void main(String[] args) {
		String n1 = JOptionPane.showInputDialog("첫 번째 수");
		String n2 = JOptionPane.showInputDialog("두 번째 수");
		
		int n11 = Integer.parseInt(n1);
		int n22 = Integer.parseInt(n2);
		
		int result = n11 + n22;
		
		System.out.println(result);
		
		

	}

}
