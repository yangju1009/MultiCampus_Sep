package 연산자;

public class 원의면적 {
	
	public static void main(String[] args) {
		
		final double pi = 3.14; // final 은 상수 지정. 후에 변경 불가
 		double rad = 2.2;
		
		double area = pi * rad * rad;
		// 원의 면적을 구하는 식
		
		System.out.printf("%.4f%n", area);
		
		
	}

}
