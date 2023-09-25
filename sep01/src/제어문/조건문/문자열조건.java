package 제어문.조건문;

public class 문자열조건 {

	public static void main(String[] args) {
		String pass = "password";
		// DB 관리자가 제일 많이 사용하고 있는 비밀번호는 뭘까요
		//기본형만 == 연산자를 통해 값을 비교 가능하다.
		
		if (pass.equals("password")) {
			System.out.println("입장가능");
		} else {
			System.out.println("입장 불가");
		}
		
	}

}
