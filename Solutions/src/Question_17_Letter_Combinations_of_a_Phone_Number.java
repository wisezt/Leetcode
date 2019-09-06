import java.util.ArrayList;
import java.util.List;

public class Question_17_Letter_Combinations_of_a_Phone_Number {



    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
    String str;
    //  String[] strArr = new String[3];
    List<String> strList = new ArrayList<>();
    List<String> tempList = new ArrayList<>();


            tempList.add("");




    int length= digits.length();

        for (int i = 0 ; i < length ; i++){

        strList.clear();
        result.clear();



        str = Character.toString(digits.charAt(i));

        switch (str){
            case "2":
                strList.add("a");
                strList.add("b");
                strList.add("c");
                break;
            case "3":
                strList.add("d");
                strList.add("e");
                strList.add("f");
                break;
            case "4":
                strList.add("g");
                strList.add("h");
                strList.add("i");
                break;
            case "5":

                strList.add("j");
                strList.add("k");
                strList.add("l");
                break;
            case "6":

                strList.add("m");
                strList.add("n");
                strList.add("o");
                break;
            case "7":
                strList.add("p");
                strList.add("q");
                strList.add("r");
                strList.add("s");
                break;
            case "8":
                strList.add("t");
                strList.add("u");
                strList.add("v");
                break;
            case "9":
                strList.add("w");
                strList.add("x");
                strList.add("y");
                strList.add("z");
                break;

        }


        // Print the List
//             for (int j = 0 ; j < strList.size() ; j++){
//                 System.out.println("strList: " + strList.get(j));


//             }


        for (int j = 0 ; j < tempList.size() ; j++){

            for (int k = 0 ; k < strList.size() ; k ++){

                //   System.out.println("tempList: " + tempList.get(j));
                //   System.out.println("strList:" + strList.get(k));
                result.add(tempList.get(j).concat(strList.get(k)));

            }

        }

        tempList.clear();

        for (int k = 0 ; k < result.size() ; k++){
            tempList.add(result.get(k));


        }





    }


            return result;


}
}
