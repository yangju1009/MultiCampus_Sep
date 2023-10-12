package 형변환응용;

import java.io.IOException;
import java.util.concurrent.locks.Condition;

import javax.swing.JOptionPane;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {
	public static void main(String[] args) {
		String company = JOptionPane.showInputDialog("코드를 입력하세요.");
		// 005930, 086520, 022100
		Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code="+company); /// Connection
		System.out.println(conn);
		try {
			Document doc = conn.get();
//			System.out.println(doc);
			Elements list = doc.select("span.code"); // ArrayList 상속 -- > Elements
			// 조건에 맞는 태그들의 리스트를 객체 {태그, 태그, 태그, 태그,....}
			// Element == tag
			// Elements == tag리스트 {tag, tag, tag, tag,....}
//			System.out.println(list.size());
//			String code = list.get(0).text(); // 005930
//			System.out.println("code>> " + code);
			System.out.println("--------------------");

			Elements list2 = doc.select("td.first span.blind");
			System.out.println(list2.size());
			String yes = list2.get(0).text();
			String start = list2.get(1).text();
			System.out.println("전일가>> " + yes);
			System.out.println("시작가>> " + start);

//			for (int i = 0; i < list.size(); i++) {
//				//<span>자동저장 끄기 </span>
//				System.out.println(list.get(i).text());
//			}
			doc.select(".service_name");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 연결한 사이트에서 코드를 가지고 온다. html문서에 대한 코드 Document
		// 위험한 상황 - 외부자원 연결(cpu, file), network
		// 위험한 상황에 대해서는 상황이 발생했을 때 어떻게 처리할지를 반드시 명시해야한다.
	}
}
