package 배열응용;

public class 여러개배열문제 {

	public static void main(String[] args) {
		String[] f = { "아버지", "어머니", "형", "나" };
		int[] a = { 63, 53, 32, 27 };
		double[] h = { 180.3, 165.8, 181.1, 181.3 };

		System.out.println("우리집 식구 정리");
		System.out.println("===============");
		System.out.println("식구\t나이\t 키");
		System.out.println("------------------");
		for (int i = 0; i < h.length; i++) {
			System.out.println(f[i] + "\t" + a[i] + "세" + "\t" + h[i] + "cm");
		}
		for (int i = 0; i < h.length; i++) {
			System.out.println(f[i] + "의");
			System.out.println("나이는 " + a[i] + "세 이며");
			System.out.println("키는 " + h[i] + "cm 입니다");
			System.out.println();
		}

		// 우리가족 내년 나이 +1
		for (int i = 0; i < h.length; i++) {
			System.out.println(f[i] + "의");
			System.out.println("내년 나이는 " + (a[i] + 1) + "세 이다");
			System.out.println();
		}
		// 동생만 키가 5cm 컸음
		for (int i = 0; i < h.length; i++) {
			System.out.println(f[i] + "의");
			System.out.println("내년 나이는 " + (a[i] + 1) + "세 이다");
			System.out.println();
		}

	}
}
