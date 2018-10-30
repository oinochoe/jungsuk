public class ExceptionEx5 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);    // made a error.. Occurs ArithmeticException dividing 0.
            System.out.println(4);      // not execute..
        } catch (ArithmeticException ae) {
            System.out.println(5);      // execute
        } // try-catch end
        System.out.println(6);
    }
}

