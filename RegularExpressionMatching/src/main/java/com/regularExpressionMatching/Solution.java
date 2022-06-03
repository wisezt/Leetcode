package com.regularExpressionMatching;

public class Solution {
    public boolean isMatch(String s, String p) {

        int indexP = 0;
        int indexS = 0;

        while (indexP < p.length() && indexS < s.length()) {

            char charP = p.charAt(indexP);
            char charS = s.charAt(indexS);

            if (charP == '*') {

                if (indexP + 1 >= p.length()) {
                    return true;
                }

                return IgnoreLeftStr(s.substring(indexS), p.substring((indexP++)));

            } else if (charP == '.') {
                indexP++;
                indexS++;
//                result=true;
            } else if (charP == charS) {
                indexP++;
                indexS++;
            } else if (charP != charS) {
                return false;
            }


        }

        if (indexP != p.length() || indexS != s.length()) {
            return false;
        }

        return true;
    }

    private boolean IgnoreLeftStr(String s, String p) {
        int indexP = p.length() - 1;
        int indexS = s.length() - 1;


        while (indexP >= 0 && indexS >= 0) {

            char charP = p.charAt(indexP);
            char charS = s.charAt(indexS);

            if (charP == '*') {

                if (indexP <= 0 ) {
                    return true;
                }

                return IgnoreRightStr(s.substring(indexS), p.substring((indexP--)));

            } else if (charP == '.') {
                indexP--;
                indexS--;
//                result=true;
            } else if (charP == charS) {
                indexP--;
                indexS--;
            } else if (charP != charS) {
                return false;
            }


        }

        if (indexP == -1 && indexS == -1) {
            return true;
        } else {
            return false;
        }



    }

    private boolean IgnoreRightStr(String s, String p) {
        int indexP = 0;
        int indexS = 0;

        while (indexP < p.length() && indexS < s.length()) {

            char charP = p.charAt(indexP);
            char charS = s.charAt(indexS);

            if (charP == '*') {

                if (indexP + 1 >= p.length()) {
                    return true;
                }

                return IgnoreLeftStr(s.substring(indexS), p.substring((indexP++)));

            } else if (charP == '.') {
                indexP++;
                indexS++;
//                result=true;
            } else if (charP == charS) {
                indexP++;
                indexS++;
            } else if (charP != charS) {
                return false;
            }


        }

        if (indexP == p.length()  && indexS == s.length() ) {
            return true;
        } else return false;


    }



}
