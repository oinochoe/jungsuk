package javastudy.jungsuk.ch_08;

import java.io.*;
public class ExceptionEx15 {

    public static void main(String[] args) {
        // comand line's value created by typing
        File f = createFile("newname.txt");
        System.out.println(f.getName() + "file is created successfully");
    }

    static File createFile (String fileName) {
        try {
            if (fileName==null || fileName.equals(""))
                throw new Exception("fileName is unavaliable");
        } catch (Exception e) {
            // if fileName is unappropriate, filename will be noName.txt.
            fileName = "noName.txt";
        } finally {
            File f = new File(fileName); // making file Object
            createNewFile(f);            // create file by using created Object
            return f;
        }
    }

    static void createNewFile(File f) {
        try {
            f.createNewFile(); // create file
        }
        catch (Exception e) { } 
    }
}