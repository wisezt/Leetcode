import java.util.ArrayList;
import java.util.List;

public class Question_6_ZigZag_Conversion {


    public static void main(String[] strings){

        String str= "oxjpkcpdekyazevyzxudsirvddoxmptaodryfhdltcmuijsigolaxevcimbwduwrzqrhxvssxgmhpgpxvdyujvwrhzpktmdvcvcbquvpbhwsposktsecncwxbljxznsdiugaqbprknmabekwwrzltxixiuwihonrkutaviuixgibkuxinythvcgewcofsbycxrctbydyelzqhzyvxsetwkzuonbgqziosmjvnmtrzvkiuidrcjkavlwjaxrrybhsqsndghwhegpyrvrvgcwcpsnqsfjqgqjykwbqfyzjeojxlbtsfpwujjkbqtuzldxxbznjxmuddedqhwioneiwqvygqufezdbacrlbfggkmjbvfjjsqtrgormhlulkxombfyengkxuwypdkyyarpiiiwptqcdnsrqypunxfkrdlggvggxaxhifdzyuddjvvcvkwikdvbggkpbqvyqvfaakzzgecsazuxmqgwwbxchhtkarkqmrrmbsnixsczrwwdoebkfzpoikyibkbpbuedmrnllpkfnjkbnmovnfjxpkitwjiydmdrgqdthpywyjzmvnhksshkepdbylbdaexiwabfrabqlaegqnskhzumpzpplqvnwsvsuwxlyabjchruujhclbqcbhtozobviypcwmoxoriqbanvluzyxpaawwovkrsvrhxotnnjhvcivpfjjfjgwkhtgxqsrjpiqnymclvlhxveobpxgzgclnxtmqndzdmrsmduybifadlpebomaurljoewerzfwnxoacjydrfeuqvbtjnteegnvmjbgljcygraicamvfspynsrwgnamvqjiblomuqlcjnkloygvsytfqneycglxwwfyhtkdmxhvlujbspwlnqsefwchdpezmmzvfkbtjirwcaxxpukfmcltznaefgdtsdqaprvacmxemubeoljcquvpjxvqeajwfcyutuvvgscv";
        int num = 918;

        String result = convert(str,num);

        System.out.println(result);



    }




    public static String convert(String s, int numRows) {
        int theLength = s.length();
        int theNumRows= numRows;
        List<List<Character>> theList = new ArrayList<>();







        for (int i = 0 ; i < theNumRows ; i++){
            List<Character> theInnerList = new ArrayList<>();
            theList.add(theInnerList);
        }




        int i = 0;
        while(i < theLength ){



            for (int j = 0 ; j < theNumRows && i < theLength ; j++, i++){
                System.out.println(s.charAt(i) + " i: " + i);
                Character theChr = s.charAt(i);
                theList.get(j).add(theChr);

            }


            for (int j = theNumRows - 2 ; j > 0  && i < theLength ; j--, i++){
                System.out.println(s.charAt(i) + " i: " + i);
                Character theChr = s.charAt(i);
                theList.get(j).add(theChr);

            }






        }






        for (int h = 0 ; h < theNumRows ; h++){
            int length = theList.get(h).size();
            for (int j = 0 ; j < length ; j++){
                System.out.print(theList.get(h).get(j));
            }
            System.out.println();

        }




        String string = "";
        StringBuilder sb = new StringBuilder();

        for (int h = 0 ; h < theNumRows ; h++){



            // Appends characters one by one
            for (Character ch : theList.get(h)) {
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
