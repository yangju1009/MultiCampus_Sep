package 배열기본;

public class 배열기초확인문제2 {

	public static void main(String[] args) {
		
		// 첫번째 문제
		// 1. int크기 200인 배열을 생성해보세요.
		int[] n1 = new int[200];
		// 2. 첫번째 공간 1000, 두번째 공간 2000, 세번째 3000, 마지막 공간 5000
		n1[0] = 1000;
		n1[1] = 2000;
		n1[2] = 3000;
		n1[n1.length - 1] = 5000;
		// 3. 프린트
		for (int i = 0; i < n1.length; i++) {
			System.out.println(i + ". " + n1[i]);
		}
		System.out.println();
		// 두번째 문제
		double[] n2 = new double[300];
		n2[0]=10.1;
		n2[1]=20.2;
		n2[2]=30.3;
		n2[n2.length-1]=50.5;
		for (int i = 0; i < n2.length; i++) {
			System.out.println(i + ". " + n2[i]);
		}

	}

}
