package javastudy.jungsuk.ch_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:\\Users\\copst\\OneDrive\\바탕 화면\\data.txt");
        Scanner sc = new Scanner(f);
        int sum = 0;
        int cnt = 0;

        while(sc.hasNextInt()) {
            sum += sc.nextInt();
            cnt++;
        }

        System.out.println("sum=" + sum);
        System.out.println("average=" + (double)sum/cnt);
    }
} // public static void main (String[] args)