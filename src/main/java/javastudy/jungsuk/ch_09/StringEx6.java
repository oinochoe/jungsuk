package javastudy.jungsuk.ch_09;

class StringEx6 {
    public static void main(String[] args) {
        int iVal=100;
        String strVal   = String.valueOf(iVal); // int를 string으로 반환

        double dVal = 200.0;
        String strVal2  = dVal + "";           // int를 string으로 변환하는 또 다른 방법

        double sum      = Integer.parseInt("+".trim() + strVal.trim()) + Double.parseDouble(strVal2);
        // trim을 붙여 습관적으로 공백을 제거하기도 함

        double sum2     = Integer.valueOf(strVal) + Double.parseDouble(strVal2);

        System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
        System.out.println(strVal+"+"+strVal2+"="+sum2);
    }
}