package javastudy.jungsuk.ch_07.anonym;

import java.awt.*;
import java.awt.event.*;

/**
 * InnerEx7
 */
public class InnerEx7 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent Occurred!!! ");
    }
}

// 이 예제를 실행하면 아무것도 화면에 나타나지 않은 채 종료 단지 익명 클래스로 변환하는 예를 보여주기 위함
