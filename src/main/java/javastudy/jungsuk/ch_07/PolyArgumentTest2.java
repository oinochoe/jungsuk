package javastudy.jungsuk.ch_07;

/**
 * PolyArgumentTest2
 */

class Product2{
    int price;      // 제품의 가격
    int bonusPoint; // 제품 구매 시 제공하는 보너스 점수
    
    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }

    Product2(){} // 기본 생성자
}

class Tv3 extends Product2 {
    Tv3() { super(100); } // 조상 클래스의 생성자 Product2(int price)를 호출한다.
    public String toString() { return "TV3"; }
}

class Computer2 extends Product2 {
    Computer2() { super(200); }
    public String toString() { return "Computer2"; }
}

class Audio extends Product2 {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}

class Buyer2 {                          // 고객, 물건을 사는 사람
    int money = 1000;                  // 소유금액
    int bonusPoint = 0;                // 보너스점수
    Product2[] item = new Product2[10];  // 구입한 제품을 저장하기 위한 배열
    int i = 0;                         // Product배열에 사용될 카운터

    void buy(Product2 p) {
        if (money < p.price) {
            System.out.println("잔액부족");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p;                  // 제품을 Product2[] item에 저장
        System.out.println(p + "구입 완료");
    }

    void summary() {                    // 구매정보 요약
        int sum = 0;                    // 구입한 물품의 가격합계
        String itemList = "";           // 구입한 물품목록

        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.length; i++) {
            if (item[i]==null) break;
            sum += item[i].price;
            //itemList += item[i] + ", "; 마지막에도 ,가 눈에 거슬린다면 변경해보자
            itemList += (i==0) ? item[i] : ", " + item[i]; // 젤앞에 빼고 다 붙이는 것.
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv3());
        b.buy(new Computer2());
        b.buy(new Audio());
        b.summary();
    }
}