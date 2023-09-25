package 연산자;

public class 성적평균 {
	
	public static void main(String[] args) {
		//성적의 평균을 구하는 문제
		int exer = 66;
		int math = 77;
		int eng = 88;
		int lang = 99;
		
		int sum = exer + math + eng + lang;
		// 모든 과목의 합산
		double avg = sum / 4.0;
		// 과목의 평균
		
		System.out.println(avg);
		
		
	}

}
