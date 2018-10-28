package javastudy.jungsuk.ch_07.inter;

/**
 * InterfaceTest3
 */
public class InterfaceTest3 {
    public static void main(String[] args) {
        F f = new F();
        f.methodF();
    }
}

class F {
    void methodF() {
        I2 i = InstanceManager.getInstance(); // 제3의 클래스 메서드를 통해 인터페이스 I2를 구현한 클래스의 인스턴스를 얻어온다
        i.methodG();
        System.out.println(i.toString()); // i 로 Object 클래스의 메서드 호출 가능...
    }
}

interface I2 {
    public abstract void methodG();
}

class G implements I2 {
    public void methodG() {
        System.out.println("methodF in G class");
    }
    public String toString() { return "class G"; }
}

class InstanceManager {
    public static I2 getInstance() {
        return new G(); // 다른 인스턴스로 바꾸려면 여기만 변경하면 됨..
    };
}
