package 제어문.조건문;

public class SwitchTest1 {

	public static void main(String[] args) {
		String name = "자바";
		
		switch (name) {
		case "자바":
			System.out.println("1101호로 가세요");
			//break를 포함하고 있는 {}를 찾으세요.!
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
