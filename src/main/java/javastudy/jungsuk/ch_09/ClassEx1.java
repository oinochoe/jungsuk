package javastudy.jungsuk.ch_09;

class ClassEx1 {
    public static void main(String[] args) throws Exception {
        Card3 c = new Card3("HEART", 3);          // new 연산자로 객체생성
        Card3 c2 = Card3.class.newInstance();                 // class 객체를 통해서 객체 생성

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}


final class Card3 {
    String kind;
    int num;

    Card3() {
        this("SPADE", 1);
    }

    Card3(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    public String toString() {
        return kind + ":" + num;
    }
}