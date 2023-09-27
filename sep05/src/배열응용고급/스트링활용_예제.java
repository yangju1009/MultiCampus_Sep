package 배열응용고급;

import java.util.Arrays;

public class 스트링활용_예제 {

    public static void main(String[] args) {
        String w = "흐림, 맑음, 흐림";
        String w1 = w.trim(); // w를 trim하여 w1에 할당
        String[] w2 = w1.split(", ");
        System.out.println(Arrays.toString(w2));
        System.out.println(w2[0]);
        int count_1 = 0;
        int count_2 = 0;
        System.out.println(w2[2]);
        System.out.println(w2.length);
        for (int i = 0; i < w2.length; i++) {
            if (w2[i].equals("흐림")) {
                count_1++;
            } else if (w2[i].equals("맑음")) {
                count_2++;
            }
        }
        System.out.println("흐림은 " + count_1 + "개 입니다");
        System.out.println("맑음은 " + count_2 + "개 입니다");
    }

}
