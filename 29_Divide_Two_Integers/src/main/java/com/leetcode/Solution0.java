package com.leetcode;

public class Solution0 {

    boolean isMinus;
    boolean isDividentMinus;
    boolean isDivisorMinus;

    public int divide(int dividend, int divisor) {

        isMinus = false;
        isDividentMinus = false;
        isDivisorMinus = false;


        if (dividend < 0) {
            isDividentMinus = true;
        }

        System.out.println("isDividentMinus" + isDividentMinus);


        if (divisor < 0) {
            isDivisorMinus = true;
        }

        System.out.println("isDivisorMinus" + isDivisorMinus);


        if (dividend < 0 && divisor > 0) isMinus = true;

        if (dividend > 0 && divisor < 0) isMinus = true;


        System.out.println("isMinus" + isMinus);


        if (dividend == 0) {
            return 0;
        }




        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);

        String dividendStr = "" + dividendL;
        String divisorStr = "" + divisorL;
        int dividendStrLen = dividendStr.length();
        int divisorStrLen = divisorStr.length();
        long subDividendL;

        String subDividendStr;
        String restDividendStr;

        String result = "";
        int count = 0;


//
//        Tools.printingMapPut("dividendStr",dividendStr);
//
//        Tools.printingMapPut("divisorStr",divisorStr);
//
//        Tools.printingMapPut("dividendStrLen",dividendStrLen);
//
//        Tools.printingMapPut("divisorStrLen",divisorStrLen);
//
//        Tools.printingMapPut("dividendL",dividendL);
//
////        Tools.printingMapPut("subDividendL");
//
//        Tools.printingMapPut("dividendStr",dividendStr);
        if (dividendL < divisorL){
            result = "0";
        }

        while (dividendL >= divisorL) {
            dividendStr = "" + dividendL;
            dividendStrLen = dividendStr.length();
            count = 0;
            Tools.println("dividendL,dividendStr"  , dividendL,dividendStr);
            Tools.println("divisorL"  , divisorL);


            int decimalIndex = divisorStrLen;
            Tools.println("decimalIndex,dividendStr,divisorStr",decimalIndex,dividendStr,divisorStr);
            subDividendStr = dividendStr.substring(0, decimalIndex);
            restDividendStr = dividendStr.substring(decimalIndex, dividendStrLen);
            subDividendL = Long.parseLong(subDividendStr);
            Tools.println("subDividendStr,restDividendStr,subDividendL",subDividendStr,restDividendStr,subDividendL);

            // because dividendL >= divisorL so subDividendStr.length() >= divisorStrLen
            if (subDividendL < divisorL ) {
                decimalIndex++;
                subDividendStr = dividendStr.substring(0, decimalIndex);
                restDividendStr = dividendStr.substring(decimalIndex, dividendStrLen);
                subDividendL = Long.parseLong(subDividendStr);
                result = result + 0;

                Tools.println("subDividendStr,restDividendStr,subDividendL,result", subDividendStr,restDividendStr,subDividendL,result);
            }

            while (subDividendL - divisorL >= 0) {
                subDividendL = subDividendL - divisorL;
                count++;

                Tools.println("subDividendL,count",subDividendL,count);
            }
            result = result + count;
            dividendStr = ""+subDividendL + restDividendStr;
            dividendL = Long.parseLong(dividendStr);
            Tools.println("result,dividendStr,count,dividendL",result,dividendStr,count,dividendL);
            Tools.println("");

        }

//        Tools.printingMapPut(result, result);


        Tools.println("result", result);

        long resultL = Long.parseLong(result);

        resultL = isMinus ? -resultL : resultL;

        int resultInt;
        if (resultL > Integer.MAX_VALUE) {
            resultInt = Integer.MAX_VALUE;
        } else if (resultL < Integer.MIN_VALUE) {
            resultInt = Integer.MIN_VALUE;
        } else {
            resultInt = (int) resultL;
        }


        return resultInt;

//        String result = divideStr(dividend + "", divisor + "");
//        System.out.println(result);
//        result = isMinus ? "-" + result : result;
//        if (result.equals("2147483648")) result = "" + Integer.MAX_VALUE;
//        System.out.println(result);
//        System.out.println(isMinus);
//
//        System.out.println(result);
//        result = result.length() == 0 ? "0" : result;

//        return Integer.parseInt(result);


    }

    private String divideStr(String dividendStr, String divisorStr) {

        System.out.printf("-1. dividendStr: %s\tdivisorStr: %s\t\n", dividendStr, divisorStr);
        System.out.println("isDivisorMinus: " + isDivisorMinus);
        System.out.println("isDividentMinus: " + isDividentMinus);


        System.out.printf("0. dividendStr: %s\tdivisorStr: %s\t\n", dividendStr, divisorStr);


        String restDividendStr = "";
        int count = 0;
        String result = "";


        if (dividendStr.isEmpty()) {
            return 0 + "";
        }

        while (dividendStr.charAt(0) == '0') {
            result = result + 0;
            System.out.println(dividendStr);
            dividendStr = dividendStr.substring(1);
            System.out.println(dividendStr);
        }


        long dividendL = Math.abs((long) Integer.parseInt(dividendStr));

        long subDividend;
        long divisorL = Math.abs((long) Integer.parseInt(divisorStr));


        if (isDivisorMinus) {
            divisorStr = divisorStr.substring(1);
        }

        if (isDividentMinus) {
            dividendStr = dividendStr.substring(1);
        }

        int dividendStrLen = dividendStr.length();
        int divisorStrLen = divisorStr.length();


//        if (dividendStrLen >= divisorStrLen) {
//            subDividend = Integer.parseInt(dividendStr.substring(0, divisorStrLen));
//        }
//        subDividend = Integer.parseInt(dividendStr.substring(0, divisorStrLen));

        int decimalIndex = divisorStrLen;

        System.out.printf("1. dividendL: %s\tdivisorL: %s\t\n", dividendL, divisorL);

        if (dividendL >= divisorL) {
            subDividend = Integer.parseInt(dividendStr.substring(0, decimalIndex));
            restDividendStr = dividendStr.substring(decimalIndex);

        } else {

            return "";


        }


        while (subDividend < divisorL) {

            if (dividendStrLen == divisorStrLen) {
                return "";
            }
            System.out.printf("2. subDividend: %s\tdivisorL: %s\t\n", subDividend, divisorL);
//            subDividend = Integer.parseInt(dividendStr.substring(0, divisorStrLen));
            subDividend = Integer.parseInt(dividendStr.substring(0, ++decimalIndex));
            restDividendStr = dividendStr.substring(decimalIndex);

        }


        while (subDividend >= divisorL) {
//            System.out.printf("2.1. dividendInt: %s\tdivisorInt: %s\trestDividendStr: %s\t\n", dividendInt, divisorInt, restDividendStr);

            System.out.printf("3. subDividend: %s\tdivisorL: %s\tcount: %s\n", subDividend, divisorL, count);
            subDividend = subDividend - divisorL;
            count++;


        }
        System.out.printf("3.1. subDividend: %s\tdivisorL: %s\tcount: %s\n", subDividend, divisorL, count);

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

        System.out.printf("4. result: %s\n", result);

//        dividendStr = ""  + dividendStr;

//        if (dividendInt == 0){
//            dividendStr ="-"+ dividendInt+restDividendStr;
//        } else {
//            dividendStr = dividendInt+restDividendStr ;
//        }


//        System.out.printf("4. result: %s\tdividendStr: %s\t\n\n", result, dividendStr);


        dividendStr = (isDividentMinus) ? "-" + subDividend + restDividendStr : subDividend + restDividendStr;
        System.out.printf("5. dividendStr: %s\n", dividendStr);

        if (isDivisorMinus) {
            divisorStr = "-" + divisorStr;
        }


        String rest = divideStr(dividendStr, divisorStr);
        System.out.printf("6. rest: %s\n", rest);

//        String val;
        if (Integer.MAX_VALUE - Integer.parseInt(((result.length() == 0) ? "0" : result)) < Integer.parseInt((rest.length() == 0) ? "0" : rest)) {
            System.out.printf("7. result: %s\trest: %s\n", result, rest);
            return Integer.MAX_VALUE + "";
        }

        if (Integer.MIN_VALUE + Integer.parseInt(((result.length() == 0) ? "0" : result)) > -Integer.parseInt((rest.length() == 0) ? "0" : rest)) {
            System.out.printf("8. result: %s\trest: %s\n", result, rest);
            return Integer.MIN_VALUE + "";
        }


        return result + divideStr(dividendStr, divisorStr);


    }


}
