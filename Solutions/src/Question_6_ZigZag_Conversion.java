import java.util.ArrayList;
import java.util.List;

public class Question_6_ZigZag_Conversion {


    public static void main(String[] strings){

        String str= "PAYPALISHIRING";
        int num = 3;

        String result = convert(str,num);

        System.out.println(result);



    }




    public static String convert(String s, int numRows) {
        int theLength = s.length();
        int theNumRows= numRows;
        List<List<Character>> theList = new ArrayList<>();
        int y = theNumRows, x = (int)Math.floor(theLength/numRows);
        int theGroupNum = (numRows*2) -2;
        int theModule = theLength % ((numRows*2) -2);
        int theNoModuleLength = theLength - theModule;
        int theTotalGroup = (int)Math.floor((theLength / theGroupNum ));

        int theIndex  = 0;




        for (int i = 0 ; i < theNumRows ; i++){
            List<Character> theInnerList = new ArrayList<>();
            theList.add(theInnerList);
        }
        System.out.println("theGroupNum: " + theGroupNum);
        System.out.println("theTotalGroup: " + theTotalGroup );
        System.out.println("theNumRows: " + theNumRows);


        for (int i = 0 ; i < theTotalGroup ; i++){

            System.out.println("theGroupNum: " + theGroupNum);
            System.out.println("theTotalGroup: " + theTotalGroup );
            System.out.println("theNumRows: " + theNumRows);



            for (int j = 0 ; j < theNumRows ; j++){
                theIndex = i + j;
                System.out.println(s.charAt(theIndex) + " : " + theIndex + " i: " + i + " j: " +j   );
                Character theChr = s.charAt(theIndex);
                theList.get(j).add(theChr);

            }


            for (int j = 0; j < theNumRows - 2 ; j++){
                theIndex = i + j + theNumRows;
                Character theChr = s.charAt(theIndex);
                System.out.println("theNumRows: " + theNumRows +  " j: " + j );

                theList.get(theNumRows-j-1).add(theChr);

            }


        }


        int count=0;
        theIndex= theNoModuleLength - 1;

        for (int i = theNoModuleLength - 1 ; i < theLength ; i++){
            Character theChr = s.charAt(theIndex);
            theList.get( theNumRows - count -1).add(theChr);
            count++;

        }

        String string = "";

        for (int i = 0 ; i < theNumRows ; i++){

            StringBuilder sb = new StringBuilder();

            // Appends characters one by one
            for (Character ch : theList.get(i)) {
                sb.append(ch);


                // convert in string
                string = sb.toString();

                // print string
                System.out.println(string);
            }

        }



        return string;



    }
}
