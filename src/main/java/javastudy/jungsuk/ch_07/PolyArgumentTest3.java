package javastudy.jungsuk.ch_07;

import java.util.*;
/**
 * PolyArgumentTest3
 */
class Product3 {
    int price;      // 제품의 가격
    int bonusPoint; // 제품 구매 시 제공하는 보너스 점수
    
    Product3(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }

    Product3() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv4 extends Product3 {
    Tv4() { super(100); } // 조상 클래스의 생성자 Product3(int price)를 호출한다.
    public String toString() { return "TV4"; }
}

class Computer3 extends Product3 {
    Computer3() { super(200); }
    public String toString() { return "Computer3"; }
}

class Audio2 extends Product3 {
    Audio2() { super(50); }
    public String toString() { return "Audio2"; }
}

class Buyer3 {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector();         // 구입한 제품을 저장하는데 사용될 Vector 객체
    
    void buy(Product3 p) {
        if (money < p.price) {
            System.out.println("잔액부족");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);                    // 구입한 제품을 Vector에 저장
        System.out.println(p + "구입완료");
    }
    
    void refund(Product3 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "반품");
        } else {                        // 제거 실패한 경우
            System.out.println("구입한 제품이 없는데요");
        }
    }
    
    void summary() {
        int sum = 0;
        String itemList = " ";

        if (item.isEmpty()) {           // Vector 가 비어있는지 확인
            System.out.println("구입한 제품 없다");
            return;
        }

        // 반복문 이용해서 구입한 물품의 총 가격과 목록 만듦
        for (int i = 0; i < item.size(); i++) {
            Product3 p = (Product3)item.get(i);       // Vector의 i번째 있는 객체 얻어옴
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품 총금액 :" + sum);
        System.out.println("구입한 제품 리스트" + itemList);
    }
}

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3();
        Tv4 tv4 = new Tv4();
        Computer3 com = new Computer3();
        Audio2 audio2 = new Audio2();

        b.buy(tv4);
        b.buy(com);
        b.buy(audio2);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}