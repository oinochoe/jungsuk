package javastudy.jungsuk.ch_07.inner;

/**
 * InnerEx4
 */
class OuterClass {
    class InstanceInnerClass {
        int iv = 100;
    }

    static class StaticInnerClass {
        int iv = 200;
        static int cv = 300;
    }

    void ymMethod() {
        class LocalInnerClass {
            int iv = 400;
        }
    }
}
public class InnerEx4 {
    public static void main(String[] args) {
        // 인스턴스 클래스의 인스턴스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야 한다.
        OuterClass oc = new OuterClass();
        OuterClass.InstanceInnerClass ii = oc.new InstanceInnerClass();
        
        System.out.println("ii.iv : " + ii.iv); // 100;
        System.out.println("OuterClass.StaticInner.cv : " + OuterClass.StaticInnerClass.cv); // 300
        
        // 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
        OuterClass.StaticInnerClass si = new OuterClass.StaticInnerClass();
        System.out.println("si.iv : " +  si.iv); // 200
    }
}

