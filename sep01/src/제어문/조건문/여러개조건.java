package 제어문.조건문;

public class 여러개조건 {
	
	
	public static void main(String[] args) {
		int score = 80;
		
		String result = "";
		if (score >= 90) {
			result = "A학점";
		}else if (score >= 80) {
			result = "B학점";
		}else if (score >= 70) {
			result = "C학점";
		}else if (score >= 60) {
			result = "D학점";
		}else {
			result = "F학점";
		}
		
		System.out.println(result);
	}

}
