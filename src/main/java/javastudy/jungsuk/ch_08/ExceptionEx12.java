package javastudy.jungsuk.ch_08;
/**
 * ExceptionEx12
 */
public class ExceptionEx12 {
    public static void main(String[] args) throws Exception {
        method1();      // 같은 클래스내의 static 멤버이므로 객체생성없이 직접 호출 가능.
    } // main 메서드의 끝

    static void method1() throws Exception {
        method2();
    } // method1 끝

    static void method2() throws Exception {
        throw new Exception();
    } // method2 끝
}