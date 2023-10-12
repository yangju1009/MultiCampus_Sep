package 메서드기본;

public class 내카페3 {
	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전에 온 손님 수
		int count2 = 4; // 오후
		int total = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + total + "명 입니다");
		// 오전과 오후 손님 수 차이는?
		int total2 = cal3.minus(count1, count2);
		System.out.println("손님 수 차이는 " + total2 + "명 입니다");
		// 오전에 들어온 손님의 결제 금액은?
		int am_total = cal3.mul(count1, price);
		System.out.println("오전 결제금액은 " + am_total + "원 입니다");
		// 오후 손님 결제금액은?
		int pm_total = cal3.mul(count2, price);
		System.out.println("오후 결제금액은 " + pm_total + "원 입니다");
		// 오전, 오후 손님 총 결제 금액은?
		int today_total = am_total + pm_total;
		System.out.println("오늘 하루 총 결제 금액은 " + today_total + "원 입니다");
		// 총 결제 금액을 통해 1인당 결제 금액을 계산
		int per_price=cal3.div(today_total, total);
		System.out.println("1인당 결제 금액은 " + per_price + "원 입니다");
	}
}
