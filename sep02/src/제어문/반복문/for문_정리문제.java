package 제어문.반복문;

public class for문_정리문제 {

	public static void main(String[] args) {
		// for 연습문제1
		int sum1 = 0; // 더한 결과를 저장할 변수

		for (int i = 33; i <= 222; i++) {
			sum1 += i; // 현재 숫자를 더함
		}

		System.out.println(sum1);

		

		int sum2 = 0;
		for (int i = 55; i <= 4500; i = i + 2) {
			sum2 += i; // 현재 숫자를 더함
		}
		
		System.out.println(sum2);
		
		

		int sum3 = 0;
		for (int i = 0; i <= 6000; i = i + 5) {
			sum3 += i; 
		}
		
		System.out.println(sum3);
		
		//for 연습문제 2

		int sum4 = 0;
		 for (int i = 1; i <= 1000; i += 3) {
	            if (i % 5 != 0) { // 5의 배수가 아닌 경우에만 더하기
	                sum4 += i;
	            }
	            if (sum4 > 100) {
	                break; // 더한 값이 100을 초과하면 멈춤
	            }
	        }
	        System.out.println(sum4);
	}

}
