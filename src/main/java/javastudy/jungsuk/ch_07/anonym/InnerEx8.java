package javastudy.jungsuk.ch_07.anonym;

import java.awt.*;
import java.awt.event.*;

/**
 * InnerEx8
 */
class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("ActionEvent occurred!!!!");
                }
            } // 익명클래스 끝
        );
    } // main 끝
} // InnerEx8