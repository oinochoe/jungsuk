package javastudy.jungsuk.ch_09;

public class EqualsEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(80083837483847L);
        Person p2 = new Person(80083837483847L);

        if (p1==p2) {
            System.out.println("p1 과 p2는 ㅋ");
        } else {
            System.out.println("p1 과 p2는 다른사람임");
        }

        if (p1.equals(p2)){
            System.out.println("p1 과 p2는 같은사람임");
        } else {
            System.out.println("p1 과 p2는 다른사람임");
        }
    }
}

class Person {
    long id;

    public boolean equals(Object obj) {
        if (obj!=null && obj instanceof Person) {
            return id == ((Person)obj).id; // obj가 Object 타입이므로 id 값을 참조하기 위해서는 Person타입으로 형변환 필요
        } else {
            return false;                  // 타입이 Person이 아니면 값을 비교할 필요도 없다.
        }
    }

    Person(long id) {
        this.id = id;
    }
}