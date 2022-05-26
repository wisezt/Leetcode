import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LongestSubstring02 {
    public static void main(String[] args) {

        int result = lengthOfLongestSubstring("bbbbb");
        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        int line = 0;
        int result = -1;
        String str = s;
        int theLength = str.length();
        int countMax = 0, count = 0;

        Set<Character> theSet = new HashSet<>();
        int j = 0;

        for (int i = 0; i < theLength - countMax; i++) {
            theSet.clear();
            theSet.add(str.charAt(i));
            count = 1;
            if (i < theLength - 1) {
                j = i + 1;

                while (theSet.add(str.charAt(j))) {
                    line++;
                    count++;

                    j++;

                    if (j > theLength - 1) {
                        break;
                    }

                }
            }

            countMax = countMax > count ? countMax : count;

        }

        result = countMax;

        return result;

    }

}
