package 배열기본;

public class 배열기초확인문제1 {

	public static void main(String[] args) {
		// 1. int크기 5인 배열을 생성해보세요.
		int[] n = new int[5];
		//n, int[5], length ==> 7개입니다.
		// 2. 배열의 크기를 프린트하세요.
		System.out.println(n.length);
		//index ==> 0, 1, 2, 3, 4
		
		System.out.println();
		// 3. 배열의 첫번째 위치에 100을 넣어서 프린트
		n[0] = 100;
		System.out.println(n[0]);
		
		// 4. 배열의 마지막 위치에 500을 넣어서 프린트
		n[n.length - 1] = 500;
		System.out.println(n[n.length - 1] + " ");
		
		// 5. 배열의 3번째 위치에 200을 넣어서, 프린트
		n[2] = 200;
		System.out.println(n[2]);
		System.out.println();
		// 6. 배열의 전체 데이터를 프린트
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i] + " ");
		}
		System.out.println();
		// 7. 배열의 전체 데이터를 인덱스와 함께 프린트
		for (int j = 0; j < n.length; j++) {
			System.out.println(j + ". " + n[j]);
		}
		

	}

}
