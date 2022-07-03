package com.leetcode;

import com.leetcode.Tools;


public class Solution04 {

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



        if (dividendL < divisorL) {
            return 0;
        }
        Tools.println("dividendL,divisorL", dividendL, divisorL);
        int decimalIndex = divisorStrLen;
        Tools.println("decimalIndex,dividendStr,divisorStr", decimalIndex, dividendStr, divisorStr);
        subDividendStr = dividendStr.substring(0, decimalIndex);
        restDividendStr = dividendStr.substring(decimalIndex, dividendStrLen);
        subDividendL = Long.parseLong(subDividendStr);
        Tools.println("subDividendStr,restDividendStr,subDividendL", subDividendStr, restDividendStr, subDividendL);


        while (dividendL >= divisorL) {
            dividendStr = "" + dividendL;
            dividendStrLen = dividendStr.length();
            count = 0;
            Tools.println("dividendL,dividendStr", dividendL, dividendStr);
            Tools.println("divisorL", divisorL);

            decimalIndex = subDividendStr.length();

            Tools.println("decimalIndex", decimalIndex);
            while (subDividendL < divisorL) {
                Tools.println("subDividendL,divisorL", subDividendL, divisorL);
                decimalIndex++;
                subDividendStr = dividendStr.substring(0, decimalIndex);
                restDividendStr = dividendStr.substring(decimalIndex, dividendStrLen);
                subDividendL = Long.parseLong(subDividendStr);
                result = result + 0;
                Tools.println("decimalIndex,subDividendL,restDividendStr,result", decimalIndex, subDividendL, restDividendStr, result);
            }


            while (subDividendL - divisorL >= 0) {
                subDividendL = subDividendL - divisorL;
                count++;


                Tools.println("subDividendL,count", subDividendL, count);
            }
            result = result + count;


            subDividendStr = "" + subDividendL;

            Tools.println("subDividendStr,restDividendStr", subDividendStr, restDividendStr);

            if (restDividendStr.length() > 0) {
                subDividendStr = "" + subDividendStr + restDividendStr.substring(0, 1);
                restDividendStr = restDividendStr.substring(1);

                dividendStr = "" + subDividendStr + restDividendStr;
                dividendL = Long.parseLong(dividendStr);

            if (dividendL < divisorL){
                result= result+0;
            }

            }


            subDividendL = Long.parseLong(subDividendStr);

            Tools.println("subDividendStr,restDividendStr", subDividendStr, restDividendStr);

            dividendStr = "" + subDividendStr + restDividendStr;
            dividendL = Long.parseLong(dividendStr);




            Tools.println("result,dividendStr,count,dividendL", result, dividendStr, count, dividendL);
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




    }
}