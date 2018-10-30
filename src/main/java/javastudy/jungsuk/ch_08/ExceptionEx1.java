package javastudy.jungsuk.ch_08;

/**
 * ExceptionEx1
 */
public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try { } catch (Exception e) { }
        }
        catch (Exception e) {
            try { } catch (Exception e) {} // 에러. 변수 e가 중복선언
            
        } // try-catch 끝
        
        try { } catch (Exception e) { } // try - catch 끝
    } // main 메서드 끝
}