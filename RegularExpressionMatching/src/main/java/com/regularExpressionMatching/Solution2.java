package com.regularExpressionMatching;

public class Solution2 {
    public boolean isMatch(String s, String p) {


        int indexP = 0;
        int indexS = 0;

        while (indexP < p.length() && indexS < s.length()) {

            char charP = p.charAt(indexP);
            char charS = s.charAt(indexS);

            if (indexP + 1 < p.length()) {

                if (p.charAt(indexP + 1) == '*') {

                    if (indexP + 2 < p.length()) {

                        if (isMatchRight(s.substring(indexS), p.substring(indexP)) == -2) {
                            return false;
                        } else if (isMatchRight(s.substring(indexS), p.substring(indexP)) == -1){
                            return true;
                        }
                    } else {
                        if (charS == charP){
                            indexS++;
                        }

                    }




                } else {

                }

            } else {

                if (charP == charS) {
                    return true;
                } else if (charP == '.') {
                    return true;
                } else if (charP == '*') {

                } else return false;


            }

        }

        return;
    }


}
