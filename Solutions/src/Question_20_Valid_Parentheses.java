import java.util.ArrayList;
import java.util.List;

public class Question_20_Valid_Parentheses {

    public boolean isValid(String s) {

        List<Character> startBrackets = new ArrayList<>();
        List<Character> endBrackets = new ArrayList<>();
        boolean result = true;




        for (int i = 0 ; i < s.length() ; i++){


            switch(s.charAt(i)){
                case '(':startBrackets.add('(');
                    break;
                case '{':startBrackets.add('{');
                    break;
                case '[':startBrackets.add('[');
                    break;
                case ')': result = isExistedStartBracket(')', startBrackets);
                    break;
                case '}': result = isExistedStartBracket('}', startBrackets);
                    break;
                case ']': result = isExistedStartBracket(']', startBrackets);
                    break;

            }


            if (result == false){
                return false;
            }


        }


        if ( startBrackets.size()  != 0){
            result = false;
        }


        return result;

    }






    static public boolean isExistedStartBracket(Character theBracket, List<Character> theList){

        if(theList.size() < 1){
            return false;
        }

        //System.out.println("theBracket: " + theBracket + " theList: " + theList.get(0)  );


        switch(theBracket){
            case ')':      if ( theList.get(theList.size() -1 ) == '(' ){
                theList.remove(theList.size() -1 );
                return true;

            } else {
                return false;
            }

            case ']':      if ( theList.get(theList.size() -1 ) == '[' ){
                theList.remove(theList.size() -1 );
                return true;

            } else {
                return false;
            }

            case '}':      if ( theList.get(theList.size() -1 ) ==  '{' ){
                theList.remove(theList.size() -1 );
                return true;

            } else {
                return false;
            }



        }



        return true;
    }

}
