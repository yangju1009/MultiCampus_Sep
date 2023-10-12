package 상속;

public class 증가스레드 extends Thread{
	public static int sum;
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			sum++;
			System.out.println("증가 "+sum);
		}
	}
}
