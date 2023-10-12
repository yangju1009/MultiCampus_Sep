package 상속;

public class 스레드사용예제 {
	
	public static void main(String[] args) {
		증가스레드 plus = new 증가스레드();
		감소스레드 minus = new 감소스레드();
		별스레드 t1 = new 별스레드();
		골뱅이스레드 t2 = new 골뱅이스레드();
		이름스레드 name = new 이름스레드();
		t1.start();
		t2.start();
		plus.start();
		minus.start();
		name.start();
	}
}
