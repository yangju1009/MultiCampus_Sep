package 배열운용;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {
		int[] 답안 = new int[990];
		int[] 내답안 = new int[990];
		
		Random r = new Random();
		for (int i = 0; i < 내답안.length; i++) {
			답안[i]=r.nextInt(4); //0~3
			내답안[i]=r.nextInt(4); //0~3
			
		}
		System.out.println(Arrays.toString(답안));
		System.out.println(Arrays.toString(내답안));
		int score = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (답안[i]==내답안[i]) {
				score++;
			}
		}
		System.out.println(score);
	}

}
