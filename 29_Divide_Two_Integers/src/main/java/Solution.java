public class Solution {
    boolean isMinus;

    public int divide(int dividend, int divisor) {

        isMinus=false;
        if ((dividend >=0 && divisor >0) || (dividend <=0 && divisor <= 0) ){
            isMinus = true;
        }



        return (!isMinus)?-1*Integer.parseInt(divideStr(Math.abs(dividend) + "", Math.abs(divisor))):Integer.parseInt(divideStr(Math.abs(dividend)+"", Math.abs(divisor)));


    }

    private String divideStr(String dividend, int divisor) {



//        System.out.println(dividend + "\t" + divisor);
        int result = 0;
        String tmpDividendStr;
        int tmpDividendInt;
        int divisorLen = (divisor + "").length();

        int rightLen = (dividend + "").length() - divisorLen;
        if (dividend.isEmpty()){
            return "";
        }
//        System.out.println(tmpDividendInt + "\t" + divisor);
        if (Math.abs(Integer.parseInt(dividend)) - Math.abs(divisor) < 0) {
            return "";
        } else {

            tmpDividendStr = (dividend + "").substring(0, divisorLen);
            tmpDividendInt = Integer.parseInt(tmpDividendStr);
//            System.out.println(tmpDividendInt + "\t" + divisor);

            if (tmpDividendInt < divisor){
                tmpDividendStr = (dividend + "").substring(0, divisorLen+1);
                tmpDividendInt = Math.abs(Integer.parseInt(tmpDividendStr));
//                System.out.println(tmpDividendInt + "\t" + di
//                visor);
            }

            while (tmpDividendInt - divisor >= 0) {
                tmpDividendInt = tmpDividendInt - divisor;
                result++;

            }


        }
        tmpDividendStr = tmpDividendStr.substring(tmpDividendStr.length() - rightLen, tmpDividendStr.length());

//        if (tmpDividendStr.length() == 0){
//            System.out.println("~~1~");
//            return "";
//        } else {
//            System.out.println("~~2~");
//            tmpDividendInt = Integer.parseInt(tmpDividendStr);
//        }



//        System.out.println(tmpDividendInt + "\t" + divisor);

        String rest = divideStr(tmpDividendStr, divisor);

        if (isMinus && (Integer.MIN_VALUE + Integer.parseInt(rest) >= -result )){
            result = Integer.MIN_VALUE;
        }

        return "" + result + rest;


    }


}
