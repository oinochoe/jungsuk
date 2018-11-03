package javastudy.jungsuk.ch_08;

/**
 * ExceptionEx14
 */
public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main method exception excuted");
            e.printStackTrace();
        }
    }   // main method end

    static void method1() throws Exception {
        throw new Exception();
    }
}