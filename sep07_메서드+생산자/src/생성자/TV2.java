package 생성자;

public class TV2 {

	// 멤버변수와 멤버메서드는 동일함.
	public int ch;
	public int vol;
	public boolean onOff;
	public TV2(int ch, int vol, boolean onOff) {
		this.ch = ch;
		this.vol = vol;
		this.onOff = onOff;
	}
	
	//생성자를 하나도 만들어주지 않는 경우에는
	//눈에 보이지 않지만 자동으로 클래스와 동일한
	//생성자 메서드를 자동으로 만들어준다.

	//생성자는 무조건 void라서 쓰지 않음.
	//클래스이름과 동일해야 객체생성시 자동호출
	//생성자메서드(생성자), constructor
//	public TV2(int c, boolean o, int v) {
//		ch = c;
//		vol = v;
//		onOff = o;
//	}
//
//	public void change() {
//		System.out.println("채널을 바꾸다.");
//	}
//
	@Override
	public String toString() {
		return "TV2 [ch=" + ch + ", vol=" + vol + ", onOff=" + onOff + "]";
	}

	// 클래스를 만들면 기본 8개의 정도의 메소드는 가지고 시작한다.
	// 안보인다.
	// toString()은 참조형변수 tv2를 프린트 할 때 자동으로
	// 프린트할 스트링을 만들어서 리턴해주는 메서드
}
