package javastudy.jungsuk.ch_08;

import java.io.*;

public class ExceptionEx16 {
    public static void main (String[] args) {
        try {
            File ff = createFiles(args[0]);
            System.out.println(ff.getName() + "파일 생성 성공");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "다시 입력해주소");
        }
    }   // main 메서드의 끝

    static File createFiles (String fileName) throws Exception {
        if (fileName==null || fileName.equals(""))
            throw new Exception("파일이름이 유효하지 않습니다.");
        File ff = new File(fileName);           // File클래스의 객체를 만든다.
        ff.createNewFile();
        return ff;                              // 생성된 객체의 참조를 반환
    }
}