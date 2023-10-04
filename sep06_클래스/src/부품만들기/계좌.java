package 부품만들기;

public class 계좌 {
	public String 이름;
	public String 계좌이름;
	public int 금액;
	@Override
	public String toString() {
		//원래있는 toString()은 참조형변수 프린트할 때 무조건 호출
		//부품만들기.계좌@--------
		//패키지명.클래스명@주소관리코드값
		return "계좌 [이름=" + 이름 + ", 계좌이름=" + 계좌이름 + ", 금액=" + 금액 + "]";
	}
}
