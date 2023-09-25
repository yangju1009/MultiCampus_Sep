package 제어문.순차문;

public class 확인문제5_커피계산 {

	public static void main(String[] args) {

		int cof_c = 5;
		int cof_p = 5000;
		int result = cof_c * cof_p;
		if (result > 20000) {
			System.out.println("할인해드릴게요.");
		} else {
			System.out.println("총 커피값을 내세요.");
		}
	}

}
