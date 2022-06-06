import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isValid(String s) {

        char[] charArr = s.toCharArray();

        List<Character> charList = new ArrayList<>();

        int countOpenParentheses = 0;

        loop:
        for (int i = 0; i < charArr.length; i++) {
            switch (charArr[i]) {
                case '(':
                    charList.add('(');
                    countOpenParentheses++;
                    break;
                case '[':
                    charList.add('[');
                    countOpenParentheses++;
                    break;
                case '{':
                    charList.add('{');
                    countOpenParentheses++;
                    break;
                case ')':
                    if (charList.size() == 0) return false;
                    if (charList.get(charList.size() - 1) == '(') {
                        charList.remove(charList.size() - 1);
                    } else break loop;
                    break;
                case ']':
                    if (charList.size() == 0) return false;
                    if (charList.get(charList.size() - 1) == '[') {
                        charList.remove(charList.size() - 1);
                    } else break loop;
                    break;
                case '}':
                    if (charList.size() == 0) return false;
                    if (charList.get(charList.size() - 1) == '{') {
                        charList.remove(charList.size() - 1);
                    } else break loop;
                    break;
                default: System.out.println("Something is wrong!");

            }

            if (countOpenParentheses > charArr.length/2){
                return false;
            }
        }

        return charList.size() == 0;
    }
}