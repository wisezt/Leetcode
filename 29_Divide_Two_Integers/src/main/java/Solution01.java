public class Solution01 {


    public int divide(int dividend, int divisor) {

        boolean isMinus = false;
        if ((dividend >= 0 && divisor > 0) || (dividend <= 0 && divisor <= 0)) {
            isMinus = true;
        }


        if (dividend >=0){
            dividend = - dividend;
        }

        if (divisor >= 0){
            divisor = -divisor;
        }

        if (dividend == 0){
            return 0;
        }


        return (!isMinus) ? -1 * Integer.parseInt(divideStr(dividend + "", divisor+ "")) : Integer.parseInt(divideStr(dividend + "", divisor + ""));


    }

    private String divideStr(String dividendStr, String divisorStr) {
        System.out.printf("0. dividendStr: %s\tdivisorStr: %s\t\n", dividendStr, divisorStr);


        if (dividendStr.isEmpty()) {
            return 0 + "";
        }

        int dividendInt = Integer.parseInt(dividendStr);
        int divisorInt = Integer.parseInt(divisorStr);
        int dividendStrLen = dividendStr.length();
        int divisorStrLen = divisorStr.length();
        String restDividendStr ="";
        int count = 0;
        String result = "";

        if (dividendStrLen - divisorStrLen < 0) {
            System.out.printf("1. dividendStrLen: %s\tdivisorStrLen: %s\t\n", dividendStrLen, divisorStrLen);

            return "";
        }

        dividendInt = Integer.parseInt(dividendStr.substring(0, divisorStrLen));

        System.out.printf("2. subDividendInt: %s\t\n", dividendInt);

        int decimalIndex = 2;
        restDividendStr =  dividendStr.substring(decimalIndex, dividendStrLen);
        while (dividendInt > divisorInt){
            System.out.printf("2.1. dividendInt: %s\tdivisorInt: %s\trestDividendStr: %s\t\n", dividendInt,divisorInt,restDividendStr);
            if (dividendStrLen <= divisorStrLen){
                count = 0;
                result = result + count;
                break;
            } else {
                dividendInt = Integer.parseInt(dividendStr.substring(0, decimalIndex++));
                restDividendStr =  dividendStr.substring(decimalIndex, dividendStrLen);
                System.out.printf("2.2. dividendInt: %s\trestDividendStr: %s\n", dividendInt,restDividendStr);


            }
        }

        while (dividendInt - divisorInt <= 0 && count < 10) {
            dividendInt = dividendInt - divisorInt;
            count++;
            System.out.printf("3. dividendInt: %s\tdivisorInt: %s\tcount: %s\t\n", dividendInt, divisorInt, count);
        }



//
//        if (subDividendInt - divisorInt < 0) {
//            if (dividendStrLen - divisorStrLen <= 0) {
//                return "0";
//            } else {
//                subDividendInt = Integer.parseInt(dividendStr.substring(0, divisorStrLen + 1));
//                result = "0";
//                dividendStr = "" + dividendStr.substring(divisorStrLen + 1, dividendStrLen);
//            }
//
//
//        } else {
//
//            dividendStr = "" + dividendStr.substring(divisorStrLen, dividendStrLen);
//        }
//        System.out.printf("dividendStr: %s\t\n", dividendStr);
//
//        while (subDividendInt - divisorInt >= 0) {
//            subDividendInt = subDividendInt - divisorInt;
//            count++;
//            System.out.printf("subDividendInt: %s\tdividendInt: %s\tcount: %s\t\n", subDividendInt, dividendInt, count);
//        }

        result = result + count;

//        dividendStr = ""  + dividendStr;

        if (dividendInt == 0){
            dividendStr ="-"+ dividendInt+restDividendStr;
        } else {
            dividendStr = dividendInt+restDividendStr ;
        }




        System.out.printf("4. result: %s\tdividendStr: %s\t\n\n", result, dividendStr);


        if (Integer.parseInt(dividendStr) - divisorInt > 0){
            return result + "";
        }


        return result + divideStr(dividendStr, divisorStr);


    }


}
