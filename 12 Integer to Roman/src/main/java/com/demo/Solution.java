package com.demo;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String intToRoman(int num) {
        String result = "";

//        int rd;
//        while ( num % 10 > 0){
//            rd = num % 10;
//            result = getRomanNUm(rd) +result;
//            num = num/10;
//        }

        int tmp;
        for (int i = 3; i >= 0; i--) {
            tmp = (int)((num/(int)Math.pow(10,i))*Math.pow(10,i));
            result =  result + getRomanNUm(tmp);
            num = num - tmp;
        }




        return result;
    }

    private String getRomanNUm(int i) {
        Map<Integer, String> Int2RomanMap = new HashMap<Integer, String>();
        Int2RomanMap.put(1, "I");
        Int2RomanMap.put(2, "II");
        Int2RomanMap.put(3, "III");
        Int2RomanMap.put(4, "IV");
        Int2RomanMap.put(5, "V");
        Int2RomanMap.put(6, "VI");
        Int2RomanMap.put(7, "VII");
        Int2RomanMap.put(8, "VIII");
        Int2RomanMap.put(9, "IX");
        Int2RomanMap.put(10, "X");
        Int2RomanMap.put(20, "XX");
        Int2RomanMap.put(30, "XXX");
        Int2RomanMap.put(40, "XL");
        Int2RomanMap.put(50, "L");
        Int2RomanMap.put(60, "LX");
        Int2RomanMap.put(70, "LXX");
        Int2RomanMap.put(80, "LXXX");
        Int2RomanMap.put(90, "XC");
        Int2RomanMap.put(100, "C");
        Int2RomanMap.put(200, "CC");
        Int2RomanMap.put(300, "CCC");
        Int2RomanMap.put(400, "CD");
        Int2RomanMap.put(500, "D");
        Int2RomanMap.put(600, "DC");
        Int2RomanMap.put(700, "DCC");
        Int2RomanMap.put(800, "DCCC");
        Int2RomanMap.put(900, "CM");
        Int2RomanMap.put(1000, "M");
        Int2RomanMap.put(2000, "MM");
        Int2RomanMap.put(3000, "MMM");

        String result = Int2RomanMap.get(i);

        if (result != null){
            return result;
        }else{

            return "";
        }

    }
}
