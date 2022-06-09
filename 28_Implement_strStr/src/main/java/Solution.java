public class Solution {


//     public int strStr(String haystack, String needle) {
//         int result;

//         if(haystack.contains(needle)){

//             result = haystack.indexOf(needle);


//         } else {
//             result = -1;
//         }

//         return result;


//     }


    public int strStr(String haystack, String needle) {
        int result = -1;

        if (haystack.length() < needle.length()) {
            return -1;
        }


        if (needle.length() == 0) {
            return 0;
        }

        boolean isMatch = false;
        int nIndex = 0;
        for (int i = 0; i < haystack.length(); i++) {

            System.out.printf("haystack.charAt(%s): %s\tneedle.charAt(%s): %s\t\n",i,haystack.charAt(i),nIndex,needle.charAt(nIndex));


            if (haystack.charAt(i) == needle.charAt(nIndex)) {

                result = isMatch?result:i;
                isMatch = true;
                nIndex++;

                if (haystack.length() <= i + needle.length() - nIndex) {
                    result = -1;
                    break;
                }


            } else {
                i = isMatch?i -nIndex:i;
                isMatch = false;
                nIndex = 0;
                result = -1;

            }

            if (nIndex == needle.length())
                break;

        }


        return result;


    }


}
