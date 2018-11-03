package javastudy.jungsuk.ch_08;

/**
 * ExceptionEx13
 */
public class ExceptionEx13 {
        public static void main(String[] args) {
        method1(); //
    }   // main

    static void method1() {
        try {
            throw new Exception();
        }
        catch (Exception e) {
            System.out.println("method1 exception complete");
            e.printStackTrace();
        }
    }
}