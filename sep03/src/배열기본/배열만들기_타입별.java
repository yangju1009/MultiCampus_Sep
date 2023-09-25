package 배열기본;

public class 배열만들기_타입별 {

	public static void main(String[] args) {
		// int, char, String, JButton, double, boolean
		int[] age = { 200, 100, 50, 10 }; // 4개 고정
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		System.out.println();
		for (int x : age) {
			System.out.println(x + " ");
		}
		System.out.println();

		double[] weight = { 99.9, 88.8, 77.7, 66.6 };
		for (int i = 0; i < weight.length; i++) {
			System.out.println(weight[i] + " ");
		}
		System.out.println();
		for (double d : weight) {
			System.out.println(d + " ");
		}
		System.out.println();
		//가족 이름 ==> String[] name
		String[] name = {"양희성", "박영민", "양승주", "양민주"};
		for (int i = 0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		System.out.println();
		//성별 ==> char[] gender
		char[] gender = {'남', '여', '남', '남'};
		for (int i = 0; i < gender.length; i++) {
			System.out.println(gender[i]);
		}
		System.out.println();
		//아침식사 여부 ==> boolean [] food
		boolean[] food = {true, false, false, false};
		for (int i = 0; i < food.length; i++) {
			System.out.println(food[i]);
		}
		
	}

}
