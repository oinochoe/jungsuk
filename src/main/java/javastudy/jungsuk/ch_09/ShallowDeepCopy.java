package javastudy.jungsuk.ch_09;

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle4 c1 = new Circle4(new Point4(1, 1), 2.0);
        Circle4 c2 = c1.shallowCopy();
        Circle4 c3 = c1.deepCopy();

        System.out.println("c1=" + c1);
        System.out.println("c2=" + c2);
        System.out.println("c3=" + c3);

        c1.p.x = 9;
        c1.p.y = 9;
        System.out.println(" = c1의 변경 후 = ");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);

    }
}


class Circle4 implements  Cloneable {
    Point4 p; // 원점
    double r; // 반지름

    Circle4(Point4 p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle4 shallowCopy() { // 얕은 복사
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle4)obj;
    }

    public Circle4 deepCopy() { // 깊은 복사
        Object obj = null;

        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}

        Circle4 c = (Circle4)obj;
        c.p = new Point4(this.p.x, this.p.y);

        return c;
    }

    @Override
    public String toString() {
        return "[p=" + p + ", r=" + r + "]";
    }
}

class Point4 {
    int x, y;

    Point4 (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " +y + " )";
    }
}

