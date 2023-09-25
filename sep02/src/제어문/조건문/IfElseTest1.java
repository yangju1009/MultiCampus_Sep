package 제어문.조건문;

public class IfElseTest1 {

	public static void main(String[] args) {
		String name = "자바";

		if (name.equals("자바")) {
			System.out.println("1101호로 가세요");
		} else if (name.equals("파이썬")) {
			System.out.println("1102호로 가세요");
		} else if (name.equals("리눅스")) {
			System.out.println("1103호로 가세요");
		} else {
			System.out.println("카운터에서 문의해주세요");
		}
		
		
		//데이터타입: longX, 정수만 가능, 실수불가능!
		//		   char,  String 사용 가능
		switch (name) {
		case "자바":
			System.out.println("1101호로 가세요");
			// break를 포함하고 있는 {}를 찾으세요.!
			 break;//벗어나겠다.
		case "파이썬":
			System.out.println("1102호로 가세요");
			 break;
		case "리눅스":
			System.out.println("1103호로 가세요");
			 break;

		default:
			System.out.println("카운터에서 문의해주세요");
			 break;
		}

	}

}
