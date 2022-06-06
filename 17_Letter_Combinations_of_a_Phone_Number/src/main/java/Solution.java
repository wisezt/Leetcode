import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) return new ArrayList<>();

        List<String> result = new ArrayList<>();
        result.add("");

        char[] digitsArr = digits.toCharArray();




        for (int i = 0; i < digitsArr.length; i++) {
//            System.out.println(digitsArr[i]);

            switch (digitsArr[i]) {
                case '2':
//                    System.out.println("2: " + digitsArr[i]);
                    // A String append 3 characters
                    result = appendCharacter(result, 'a', 'b', 'c');

                    break;
                case '3':
                    result = appendCharacter(result, 'd', 'e', 'f');
                    break;
                case '4':
                    result = appendCharacter(result, 'g', 'h', 'i');
                    break;
                case '5':
                    result = appendCharacter(result, 'j', 'k', 'l');
                    break;
                case '6':
                    result = appendCharacter(result, 'm', 'n', 'o');
                    break;
                case '7':
                    result = appendCharacter(result, 'p', 'q', 'r', 's');
                    break;
                case '8':
                    result = appendCharacter(result, 't', 'u', 'v');
                    break;
                case '9':
                    result = appendCharacter(result, 'w', 'x', 'y', 'z');
                    break;
                default:
                    System.out.println("Something is Wrong!");


            }


        }


        return result;
    }

    private List<String> appendCharacter(List<String> list, char... chars) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
//            System.out.printf("list.get(%s): %s", i,list.get(i) );
            String tmpStr = list.get(i);
            for (int j = 0; j < chars.length; j++) {
                StringBuilder tmpSB = new StringBuilder(tmpStr);
                tmpSB.append(chars[j]);
                result.add(tmpSB.toString());
            }


        }

        return result;
    }

}
