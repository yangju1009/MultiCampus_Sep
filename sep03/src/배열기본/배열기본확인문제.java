package 배열기본;

import java.util.Arrays;

public class 배열기본확인문제 {

	public static void main(String[] args) {
		String[] trip = { "강릉", "속초", "홍천", "부산", "대구" };
		char[] color = { 'r', 'g', 'b', 'y', 'p' };
		double[] height = { 162.8, 176.1, 182.3, 162.6, 158.4 };
		System.out.println(Arrays.toString(trip));
		System.out.println(Arrays.toString(color));
		System.out.println(Arrays.toString(height));

		for (int i = 0; i < trip.length; i++) {
			System.out.print(trip[i] + " ");

		}
		System.out.println();

		for (int j = 0; j < color.length; j++) {
			System.out.print(color[j] + " ");
		}
		System.out.println();

		for (int k = 0; k < height.length; k++) {
			System.out.print(height[k] + " ");
		}
	}
}
