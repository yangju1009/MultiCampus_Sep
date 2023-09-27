package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 입력받아스트링배열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next(); //감자,고구마,양파
		String[] data2 = data.split(",");
		System.out.println(Arrays.toString(data2));
	}
}
