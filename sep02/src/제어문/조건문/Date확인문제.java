package 제어문.조건문;

import java.util.Date;

public class Date확인문제 {

	public static void main(String[] args) {
		Date date = new Date();
		int year = date.getYear() + 1900;
		if (year >= 2000) {
			System.out.println("밀레니엄 세대시군요.");
		} else {
			System.out.println("밀레니엄 세대가 아니시군요.");
		}
		
	
		int day = date.getDay();
		//if문
		if (day == 6 || day == 0) {
				System.out.println("쉬자");
		} else {
				System.out.println("쉬지마");
		}
		System.out.println("----------/if문");
		//switch문
		switch (day) {
		case 0:
		case 6:
			System.out.println("쉬자");
			break;
		default:
			System.out.println("쉬지마");
			break;
		}
		System.out.println("---------/switch문");
		
		int month = date.getMonth() + 1;  
		if (month == 2) {
			System.out.println("28일 까지");
		}else if (month == 4 || month == 6 || month == 9 || month == 11) {
			System.out.println("30일까지");
		}else {
			System.out.println("31일까지");
		}
		

	}

}
