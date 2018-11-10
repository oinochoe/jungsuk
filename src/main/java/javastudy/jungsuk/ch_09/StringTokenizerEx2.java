package javastudy.jungsuk.ch_09;

import java.util.StringTokenizer;

public class StringTokenizerEx2 {
    public static void main(String[] args) {
        String expression = "x=100*(200+3]00)/2"; //   "]" 는 아래 delim(구분자)에 없어서 같이 붙어서 나온다.
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);

        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

    }
}
