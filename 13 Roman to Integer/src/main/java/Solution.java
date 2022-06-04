public class Solution {
    public int romanToInt(String s) {
        char[] charArr = s.toCharArray();
        if (s.isEmpty())
            return 0;
        int result = 0;


        for (int i = 0; i < charArr.length; i++) {


            switch (charArr[i]) {
                case 'I':
                    if ((i + 1) < charArr.length && charArr[i + 1] == 'V') {
                        result = result + 4;
                        i++;
                    } else if ((i + 1) < charArr.length && charArr[i + 1] == 'X') {
                        result = result + 9;
                        i++;
                    } else {
                        result++;
                    }

                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if ((i + 1) < charArr.length && charArr[i + 1] == 'L') {
                        result = result + 40;
                        i++;
                    } else if ((i + 1) < charArr.length && charArr[i + 1] == 'C') {
                        result = result + 90;
                        i++;
                    } else {
                        result +=10;
                    }
                    break;
                case 'L':
                    result +=50;
                    break;
                case 'C':
                    if ((i + 1) < charArr.length && charArr[i + 1] == 'D') {
                        result = result + 400;
                        i++;
                    } else if ((i + 1) < charArr.length && charArr[i + 1] == 'M') {
                        result = result + 900;
                        i++;
                    } else {
                        result +=100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
                default:
                    System.out.println("There is an error");
            }


        }


        return result;
    }


}
