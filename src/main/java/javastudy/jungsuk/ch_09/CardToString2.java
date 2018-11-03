package javastudy.jungsuk.ch_09;

public class CardToString2 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("Heart", 10);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

class Card2 extends Object {
    String kind;
    int number;

    Card2() {
        this("SPADE", 1);
    } // Card(String kind, int number)를 호출

    Card2(String kind, int number) {
        super();
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        return "kind : " + kind + ", number : " + number; // Card의 인스턴스의 kind와 number를 문자열로 반환
    }
}