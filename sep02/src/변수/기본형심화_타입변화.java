package 변수;

public class 기본형심화_타입변화 {

	public static void main(String[] args) {
		byte age = 127; // 1바이트
		int age2 = age; // 4바이트 (문제없음)
		// 큰방 <-- 작은방: 자동으로 알아서 들어감

		int age3 = 127; // 4바이트
		// byte age4 = age3; //1바이트
		byte age4 = (byte) age3;
		// 작은방 <-- (작은방의 타입)큰방
		// 강제 타입 변환 (강제형변환, casting, 캐스팅)

	}

}
