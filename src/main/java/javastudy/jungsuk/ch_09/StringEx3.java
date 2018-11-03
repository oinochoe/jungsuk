package javastudy.jungsuk.ch_09;

class StringEx3 {
    public static void main(String[] args) throws Exception {
        // 길이가 0인 char 배열을 생성
        char[] cArr = new char[0];      // char[] cArr = {}; 와 같다.
        String s = new String(cArr);    // String s = new String("");와 같다.

        System.out.println("cArr.length=" + cArr.length);
        System.out.println("@@@" + s + "@@@");
    }
}