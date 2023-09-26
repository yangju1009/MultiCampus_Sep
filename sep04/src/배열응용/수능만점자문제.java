package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능만점자문제 {

	public static void main(String[] args) {
		// 0부터 450까지 랜덤 변수 (점수)
		Random r = new Random();
		// 수능 응시자 10000명
		int[] student = new int[10000];
		int sum = 0;
		for (int i = 0; i < student.length; i++) {
			student[i] = r.nextInt(451);
			sum = sum + student[i];
		}

//		System.out.println(Arrays.toString(student));
		System.out.println("평균 점수는 " + (double) sum / student.length + "점 입니다");
		System.out.println("====================");

		// 최댓값, 최소값
		// 오름차순으로 정렬해보자.
		// cpu가 ram의 값을 변경해버림. ==> 파괴형 함수
		Arrays.sort(student); // 램에 들어있는 10000개의 데이터를 위치를 옮겨 정렬해줌

		// Arrays. toString(student) ==> 비파괴형 함수
		// Double.parseDouble(date) ==> 비파괴형 함수
//		System.out.println(Arrays.toString(student));
		int min = student[0];
		int max = student[student.length - 1];
		System.out.println("최저 점수는 " + min + "점 입니다");
		System.out.println("최고 점수는 " + max + "점 입니다");
		System.out.println("====================");

		// 점수가 최소값인 사람의 수, 점수가 최대값인 사람의 수 프린트
		// 배열을 순서대로 순회해서 데이터 접근
		int minCount = 0;
		int maxCount = 0;
		for (int i = 0; i < student.length; i++) {
			if (student[i] == min) {
				minCount++;
			} else if (student[i] == max) {
				maxCount++;
			}
		}
		System.out.println("최저점인 학생 수는 " + minCount + "명 입니다");
		System.out.println("최고점인 학생 수는 " + maxCount + "명 입니다");
		System.out.println("====================");

		// 300점 이상인 사람 수를 카운트
		int count_300 = 0;
		for (int i = 0; i < student.length; i++) {
			if (student[i] >= 300) {
				count_300++;
			}
		}
		System.out.println(count_300);
		System.out.println("==================");

		// 평균보다 +- 50점인 학생 카운트(포함)
		int count_1 = 0;
		int count_2 = 0;
		int avg = sum / student.length;
		for (int i = 0; i < student.length; i++) {
			if (student[i] <= (avg - 50)) {
				count_1++;
			} else if (student[i] >= (avg + 50)) {
				count_2++;
			}
		}
		System.out.println("평균점수는 " + avg + "점 입니다");
		System.out.println("평균점수보다 50점 낮은 학생 수는 " + count_1 + "명 입니다");
		System.out.println("평균점수보다 50점 높은 학생 수는 " + count_2 + "명 입니다");

	}
}
