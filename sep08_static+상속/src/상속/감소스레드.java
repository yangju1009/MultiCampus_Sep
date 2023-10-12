package 상속;

public class 감소스레드 extends Thread{
	public static int sum=1000;
	
	@Override
	public void run() {
		for (int i = 1000; i > 0; i--) {
			
			System.out.println("감소 "+sum);
			sum--;
		}
	}
}
