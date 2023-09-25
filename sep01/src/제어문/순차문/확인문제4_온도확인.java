package 제어문.순차문;

import javax.swing.JOptionPane;

public class 확인문제4_온도확인 {

	public static void main(String[] args) {
		String t1 = JOptionPane.showInputDialog("현재 온도");
	
		int t2 = Integer.parseInt(t1);
		if(t2 >= 25) {
			System.out.println("너무 더워요");
		}else {
			System.out.println("괜찮아요");
		}
		

	}

}
