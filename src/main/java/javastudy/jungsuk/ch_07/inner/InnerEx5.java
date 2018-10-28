package javastudy.jungsuk.ch_07.inner;

/**
 * InnerEx5
 */
class OuterCl{
    int value = 10;         // OuterCl.this.value

    class InnerCl {
        int value = 20;     // this.value

        void method1() {
            int value = 30;
            System.out.println("             value : " + value);
            System.out.println("        this.value : " + this.value);
            System.out.println("OuterCl.this.value : " + OuterCl.this.value);
        }
    } // InnerCl 끝
} // OuterCl 끝

public class InnerEx5 {
    public static void main(String[] args) {
        OuterCl outer = new OuterCl();
        OuterCl.InnerCl inner = outer.new InnerCl();
        inner.method1();
    }
}