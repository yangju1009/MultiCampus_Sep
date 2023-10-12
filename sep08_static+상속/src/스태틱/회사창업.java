package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {
		직원 work1 = new 직원("홍길동", 25, "여");
		직원 work2 = new 직원("김길동", 24, "남");
		직원 work3 = new 직원("송길동", 26, "여");

		// 1) 우리회사 직원수
		System.out.println("직원수는 " + 직원.count + "명 입니다");
		// 2) 직원 각 정보 프린트
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		// 3. 직원 평균 나이
		System.out.println("평균 나이는 " + (직원.sum / 직원.count) + "세 입니다");
		System.out.println(직원.getAvg());
	}

}
