package 연산자;

public class 확인문제_물건값계산 {

	public static void main(String[] args) {

		int mask_p = 2000;
		int mask_c = 3;
		int water_p = 1000;
		int water_c = 2;

		int result1 = mask_c * mask_p;
		int result2 = water_c * water_p;	
		int result3 = result1 + result2;
		
		System.out.println("생수값은 " + result1 + "원 입니다" );
		System.out.println("마스크값은 " + result2 + "원 입니다");
		System.out.println("총 지불금액은 " + result3 + "원 입니다");

	}
}