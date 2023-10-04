package 부품만들기;

public class 전화기 {
	//멤버변수 + 멤버
	public int size; //기본형변수, 전역변수
	// 전역변수는 자동초기화 0;
	public String speaker;
	
	public void 인터넷하다() {
		System.out.println("크롬으로 실행");
	}
	//상속받은 메서드가 8개 있음
	//눈에 안보임.
	//상속받은 메서드를 재정의해서 쓸 수 있다.
	//마음대로 고쳐쓸 수 있다.

	@Override
	public String toString() {
		return "전화기 [size=" + size + ", speaker=" + speaker + "]";
	}
	
	
}
