//         Given a string, find the length of the longest substring without repeating characters.
//
//        Example 1:
//
//        Input: "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


import java.util.HashSet;
import java.util.Set;

public class Question_3_LongestSubstringWithoutRepeatingCharacters {


        public static void main(String[] strings){
            System.out.println("Test");

            System.out.println("s d".charAt(1) + "d");
            String str = "ibuwnuxdaudvevtbyntmduprwuvuvnbdrvcepzjswmnckidivxubrjspdplacmetkizbjktfzihjrltoknpdyhsdyf";
            int num = lengthOfLongestSubstring(str);
            System.out.println("num: " + num);


        }



    public static int lengthOfLongestSubstring(String s) {
            int line = 0;
        int result = -1;
        String str = s;
        int theLength = str.length();
        int countMax = 0, count = 0;

        Set<Character> theSet = new HashSet<>();
        int j = 0;

        for (int i = 0 ; i < theLength-countMax ; i++){
            theSet.clear();
            theSet.add(str.charAt(i));
            count = 1;
            if (i < theLength-1){
                j = i + 1;


                while (theSet.add(str.charAt(j))){
                    line++;
                    count++;


                    j++;

                    if (j > theLength -1){
                        break;
                    }


                }
            }


            countMax = countMax > count ? countMax : count;

        }

        System.out.println("line: " + line);
        result = countMax;


        return result;



    }







}
