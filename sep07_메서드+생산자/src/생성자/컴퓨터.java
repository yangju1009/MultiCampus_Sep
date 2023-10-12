package 생성자;

public class 컴퓨터 {
	//멤버변수
	int price;
	String company;
	int size;
	public 컴퓨터(int price, String company, int size) {
		super();
		this.price = price;
		this.company = company;
		this.size = size;
	}
	@Override
	public String toString() {
		return "컴퓨터 [가격=" + price + "만원, 제조회사=" + company + ", 모니터크기=" + size + "inch]";
	}
}
