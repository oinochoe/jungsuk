package javastudy.jungsuk.ch_07.inter;

/**
 * RepairableTest
 */
public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();
        scv.repair(tank);           // SCV가 Tank를 수리하도록 한다.
        scv.repair(dropship);
        //scv.repair(marine);       // 에러! repair(Repairable) in SCV cannot be applied to (Marine);
    }
}

interface Repairable {}

class Unit2 {
    int hitPoint;
    final int MAX_HP;
    Unit2(int hp) {
        MAX_HP = hp;
    }
}

class GroundUnit2 extends Unit2 {
    GroundUnit2(int hp) {
        super(hp);
    }
}

class AirUnit2 extends Unit2 {
    AirUnit2(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit2 implements Repairable {
    Tank() {
        super(150);     // Tank의 HP는 150이다.
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
}

class Dropship extends AirUnit2 implements Repairable {
    Dropship() {
        super(125);     // Dropship의 HP는 125
        hitPoint = MAX_HP;
    }
    
    public String toString() {
        return "Dropship";
    }
}

class Marine extends GroundUnit2 {
    Marine() {
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit2 implements Repairable {
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof Unit2) {
            Unit2 u = (Unit2)r;
            while(u.hitPoint!=u.MAX_HP) {
                /* Unit2의 HP를 증가시킨다 */
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝남");
        }
    }
}