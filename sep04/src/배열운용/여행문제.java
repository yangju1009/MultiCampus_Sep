package 배열운용;

public class 여행문제 {

	public static void main(String[] args) {
		String[] last = { "제주도", "양양", "속초" }; // 작년에 가고싶은 곳
		String[] present = { "제주도", "부산", "울산" }; // 올해에 가고싶은 곳

		// 비교하는데 String ==(X), equals() (O)
		int count_same = 0;
		int count_diff = 0;
		int same = 0;
		for (int i = 0; i < present.length; i++) {
			if (last[i].equals(present[i])) {
				count_same++;
				same = i;
			} else {
				count_diff++;
			} // else end
		} // for end
		System.out.println("또 가고싶은 곳은 " + count_same + "곳 입니다");
		System.out.println("=======================");
		// 마음이 바뀐 곳은 몇 곳인가?
		System.out.println("작년과 다른 곳은 " + count_diff + "곳 입니다");
		// 동일한 장소는 어디인가?
		System.out.println("또 가고싶은 곳은 " + present[same] + "입니다");

	}

}
