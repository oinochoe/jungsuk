package javastudy.jungsuk.ch_07;

/**
 * DrawShape
 */
public class DrawShape {
    public static void main(String[] args) {
        Point6[] p = { new Point6(100, 100), new Point6(140, 50), new Point6(20, 100) };
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point6(150, 150), 50);

        c.draw(); // 원을 그린다
        t.draw(); // 삼각형을 그린다
    }
}

class Shape {
    String color = "black";

    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}

class Point6 {
    int x;
    int y;

    Point6(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point6() {
        this(0, 0);
    }

    String getXY() {
        return "(" + x + "," + y + ")"; // x와 y의 값을 문자열로 반환
    }
}

class Circle extends Shape {
    Point6 center; // 원의 원점좌표
    int r;

    Circle() {
        this(new Point6(0, 0), 100); // Circle(Point6, center, int r)를 호출
    }

    Circle(Point6 center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() { // 원을 그리는 대신에 원의 정보를 출력하도록 했다.
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point6[] p = new Point6[3]; // 3개의 Point 인스턴스를 담을 배열을 생성

    Triangle(Point6[] p) {
        this.p = p;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}