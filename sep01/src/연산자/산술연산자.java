package 연산자;

public class 산술연산자 {
	public static void main(String[] args) {
		// 산술연산자(+ - * / %)
		
		int x = 200;
		int y = 100;
		
		System.out.println("두수의 합은 " + (x + y));
		System.out.println("두수의 차는 " + (x - y));
		System.out.println("두수의 곱은 " + x * y);
		System.out.println("두수의 나눗셈은 " + x / y);
		
		x = x + y;
		System.out.println(x);
		
		int result = x + y;
		System.out.println(result);
		
	}

}
