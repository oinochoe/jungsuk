package javastudy.jungsuk.ch_09;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTokenizerEx1 {
    public static void main(String[] args) {
       String source = "100, 200, 300, 400";
       StringTokenizer st = new StringTokenizer(source, ",");

       while (st.hasMoreTokens()) {
           System.out.println(st.nextToken().trim());
       }
    }
}
