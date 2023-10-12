package 스태틱;

public class 딸 {
	public String 이름;
	public String 성별;
	public static int d_money = 10000;
	public static int count;

	public 딸(String 이름, String 성별) {
		super();
		this.이름 = 이름;
		this.성별 = 성별;
		count++;
	}

	@Override
	public String toString() {
		return "딸 [이름=" + 이름 + ", 성별=" + 성별 + "]";
	}

}
