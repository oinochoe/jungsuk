package javastudy.jungsuk.ch_09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:\\Users\\copst\\OneDrive\\바탕 화면\\data3.txt");
        Scanner sc = new Scanner(f);
        int cnt = 0;
        int totalSum = 0;

        while(sc.hasNextInt()) {
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            while(sc2.hasNextInt()) {
                sum += sc2.nextInt();
            }
            System.out.println(line + ", sum = " + sum);
            totalSum += sum;
            cnt++;
        }
        System.out.println("Line : " + cnt + ", Total : " + totalSum);

    }
} // public static void main (String[] args)