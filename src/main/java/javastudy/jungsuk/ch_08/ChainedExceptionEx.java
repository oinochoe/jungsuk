package javastudy.jungsuk.ch_08;

public class ChainedExceptionEx {
    public static void main (String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }       // main 끝

    static void install() throws InstallException {
        try {
            startInstall();     //프로그램 설치에 필요한 준비를 한다.
            copyFiles();        // 파일들을 복사한다.
        } catch (SpacefulException e) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(e);
            throw ie;
        } catch (MemoryfulException me) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();      // 프로그램 설치에 사용된 임시파일들을 삭제
        } // try 끝
    }

    static void startInstall() throws SpacefulException, MemoryfulException {
        if (!enoughSpace()) {
            throw new SpacefulException("설치공간 부족");
        }
        if (!enoughMemory()) {
            throw new MemoryfulException("메모리 부족");
            // throw new RuntimeException(new MemoryfulException("메모리가 부족합니다"));
        }
    } // startInstall 메서드 끝

    static void copyFiles() {
        /* 파일 복사 코드 */
    }

    static void deleteTempFiles() {
        /* 임시파일 삭제 코드 */
    }

    static boolean enoughSpace() {
        // 설치하는데 필요한 공간이 있는지?
        return false;
    }

    static boolean enoughMemory() {
        /* 설치하는데 필요한 메모리가 있는지 */
        return true;
    }
} // Exception Test 코드 끝

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpacefulException extends Exception {
    SpacefulException(String msg) {
        super(msg);
    }
}

class MemoryfulException extends Exception {
    MemoryfulException(String msg) {
        super(msg);
    }
}