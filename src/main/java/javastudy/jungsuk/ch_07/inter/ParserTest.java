package javastudy.jungsuk.ch_07.inter;

/**
 * ParserTest
 */
interface Parseable{
    // 구문 분석 작업을 수행한다.
    public abstract void parse(String fileName);
}

class ParserManager {
    // 리턴 타입이 Parseable 인터페이스이다. -> 이 말인 즉슨 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것이다.
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
            // return new HTMLParser();
        }
    }
}

class XMLParser implements Parseable {
    public void parse (String fileName) {
        /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName) {
        /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "-HTML parsing completed.");
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}