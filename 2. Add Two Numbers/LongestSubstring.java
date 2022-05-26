import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LongestSubstring {
    public static void main(String[] args) {

        int result = lengthOfLongestSubstring("bbbbb");
        System.out.println(result);
    }

    public static int lengthOfLongestSubstring(String s) {
        int count = 0, maxCount = 0;
        int index = 0;
        char[] charArr = s.toCharArray();
        Map<Integer, Character> hashMap = new HashMap<>();
        int charArrLength = charArr.length;
        for (int i = 0; i < charArrLength; i++) {
            Character tmpStr = charArr[i];

            if (!hashMap.containsValue(tmpStr)) {

                count++;

            } else {

                for (int j = index; j < i; j++) {
                    if (hashMap.get(j) == tmpStr) {
                        index = j + 1;
                        count = i - j;
                        hashMap.remove(j);
                        if (maxCount > (charArrLength - j)) {
                            return maxCount;
                        }
                        break;
                    } else {
                        hashMap.remove(j);
                    }
                }

            }

            hashMap.put(i, charArr[i]);

            maxCount = (maxCount < count) ? count : maxCount;
            // System.out.printf("hashMap.get(%d): %s\tcount: %d\tmaxCount: %d\n", i,
            // hashMap.get(i), count, maxCount );
        }

        return maxCount;

    }

}
