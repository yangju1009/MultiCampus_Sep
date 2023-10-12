package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(150, "intel", 27);
		System.out.println(com1);
		컴퓨터 com2 = new 컴퓨터(200, "amd", 30);
		System.out.println(com2);

	}

}
