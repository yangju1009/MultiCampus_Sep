package 제어문.반복문;

import java.util.Date;

public class 반복문기본1 {

	public static void main(String[] args) {
	//반복문을 할 때는
		//cpu가 처음값을 변수에 저장해두고
		//1씩 증가시키면서 조건을 체크해서 반복
		//처음값, 증가값, 조건식이 필요
		for (int i = 0; i < 10; i++) {
		// 처음값			조건식			 증감값
			//0~9
			System.out.println("@");
		}
		
		int start = 0;
		while (start < 10) {  //조건식
			System.out.println("%");
			start++; //증감값
		}
		
		while (true) {
			
			System.out.println("계속 돌아감.");
			
		Date date = new Date();
		if (date.getMinutes() == 26) {
			System.out.println("EXIT");
			break;
		}
		}
	}
	
}
