import java.util.ArrayList;
import java.util.List;

public class Question_22 {


    public List<String> generateParenthesis(int n) {

        List<String> theList = new ArrayList<>();
        char[] charArr = new char[2n]
        String str;

        for (int i = 0 ; i < n ; i++){
            charArr[i] = '(';
        }

        for (int i = n ; i < 2n ; i++){
            charArr[i] = ')';
        }


        for (int i = n-1 ; i > 0 ; i--){
            charArr [i] = ')';
            for (int j = i + 1 ; j < i + n ; j++){
                charArr[j] = '(';

                str = String.valueOf(charArr);

                theList.add(str);

            }




        }





        return charArr;

    }
}
