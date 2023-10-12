package 스태틱;

public class 직원 {
	public String name;
	public int age;
	public String gender;
	public static int count;
	public static int sum;

	public 직원(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		sum = sum + age;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	// 메서드 생성.
	public static int getAvg() {
		// static 메서드안에서 instance를 쓰면 에러가 난다.
		// 이유는 static메서드 안에서는 static변수만 써야한다.
		// 힙영역의 변수는 언제 만들어지는가?
		// 힙영역의 변수는 객체생성후에 만들어진다.
		// System.out.println(age);
		return sum / count;
	}

}
