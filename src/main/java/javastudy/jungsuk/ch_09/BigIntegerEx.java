package javastudy.jungsuk.ch_09;

import java.math.BigInteger;

public class BigIntegerEx {
    public static void main(String[] args) {
        for (int i=1; i < 100; i++) { // 1!부터 99!까지 출력
            System.out.printf("%d!=%s%n", i, calcFactorial(i));
            try {
                Thread.sleep(100); // 0.3초의 지연
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static String calcFactorial(int n) {
        return factorial(BigInteger.valueOf(n)).toString();
    }

    static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO)) {
            return BigInteger.ONE;
        } else { // return n * factorial(n-1);
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
    }
}
