import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question_30_Substring_with_Concatenation_of_All_Words {



    public static void main(String[] strings){
        String s = "miudowshwyqwmysgveoymhuqvbuvtcdhmzkavejscaqqakwwpnwbuqtrtnomruvdthfplpjppzipjenarjdozwfsmugdobjjioyvdhnsivksbxuvhyjguqbgmhmclvmvjkrnuehcbrweprzypiglbhunrgqebezmoqzkwjnzcletedrtoyhphbeyhwckacwruydtjqslewficyeqwlheonexkjjmnffhfjcqbvcftjqvhunghumxkqwuzfiomowszaiavmirvymfualbwxagpwcrbnfnbdhaescbekscihjejuhfthokdsbgfjwimdksxnwezogixroglwogdeqjwupcdlmrrxmomislyavwrkeegskjwduvzkzexlxokjdwtxiuyfqrpwwxpijnndimnhqlvobfzeeteonctfvlbriscrgpvqekyuvvkxakdefhsulozhzcahvebdwytaitwgohfrtkxysssfgtohvpqsvrvrprramogdvluovtopngvtzlcwatpwmmnefhesvmvszrgumumacjvbuyzxtqvfdklirpcmdxecqmzdgldkwanqynnrdkzivkrmcvzfvfilshqauvlqwyiunyorinzdzsqbqrhlyrwqaptukgmggubusrnbemgdhyhxpqkqhgghvbdihpoojrkeixfmlnssmbrdrbtakcjhdopndedovnsekzsvnmqzpjcilwixytedhwqmatbxgtdsvyoimghcplkchvzhoglycbkevlddhhwcfmmtstvhgimodnvttirxkcdhphmyqicxuoqojmyqwkgzzdsvmmsyqyhhftgxekuybkpmyneuzkvyqotccocsmjztehqismjvwyhxnmtmwpmofgqhuuzifabkitscfdxdbeaqswcplpdqxwztsybyaekizekgijjlqmciiezvvfludmnvkqvkwfvvkhburnfjbjrjqrglwtgzfvwrmsdkzyglijfbynkzwbkmuqasjirodqhrilcjjkvtvcuupetoigacwaviioyogghorjacvvyrxsnpzgdhodlngivqzvefbowuxwzvrxmqrzfqhixwoljwtgmsbtafhwzgsablzpbrojhythwjshfnnsiqnixuezcyzejztmqkvzkrggaangqcayupislornmqtvrnjjzfjjyrpyuegmiimcxuuiinywgrrxgajfhuqhlhghlovtxhywbuhlifhoyanfdwmmqduekcnyqjtpqrouovhycrmcrbhwawjqzfwlhmjzvdrnwfjmcrkgiwibasyaojspqraxdmyyrpnnuxayomeyjnzlfzntkfiawkzbwyznnndkkfiarnycczphzccjkmmgwlktljizynlkutkmikqkkgtlivwshibewlzhwjixxtjrpwfzgwkqeddobajiimoezpmv";
               String[] words = {"mhuqvbuvtcdhmzkavejsca","qqakwwpnwbuqtrtnomruvd","thfplpjppzipjenarjdozw","fsmugdobjjioyvdhnsivks","bxuvhyjguqbgmhmclvmvjk","rnuehcbrweprzypiglbhun","rgqebezmoqzkwjnzcleted","rtoyhphbeyhwckacwruydt","jqslewficyeqwlheonexkj","jmnffhfjcqbvcftjqvhung","humxkqwuzfiomowszaiavm","irvymfualbwxagpwcrbnfn","bdhaescbekscihjejuhfth","okdsbgfjwimdksxnwezogi","xroglwogdeqjwupcdlmrrx","momislyavwrkeegskjwduv","zkzexlxokjdwtxiuyfqrpw","wxpijnndimnhqlvobfzeet","eonctfvlbriscrgpvqekyu","vvkxakdefhsulozhzcahve","bdwytaitwgohfrtkxysssf"};


        List<Integer> theList = findSubstring(s , words);

        for (Integer i: theList){

            System.out.println(i);
        }


    }



    public static List<Integer> findSubstring(String s, String[] words) {

        List<Integer> theList = new ArrayList<>();



        Map<String, Integer> theWordsMap = new HashMap<>();

        List<String> theSList = new ArrayList<>();

        List<Integer> theResult = new ArrayList<>();

        if (words.length == 0) return theResult;

        int wdlen = words[0].length();

        int theGroupNum = s.length() / wdlen;

        for (int i = 0 ; i < words.length ; i++){

            if (theWordsMap.containsKey(words[i])){
                theWordsMap.put(words[i], theWordsMap.get(words[i]) + 1);
            } else {
                theWordsMap.put(words[i], 1);
            }


        }

        // theWordsMap.forEach((id, name) -> {
        // 	System.out.println("Key : " + id + " value : " + name);
        // });



//         for (String str : theSList){

//             System.out.println("String from theSList: " + str );

//         }

//        System.out.println("theSList.size(): " + theSList.size() + " theGroupNum: " + theGroupNum );


        for (int i = 0 ; i < s.length() - words.length * wdlen + 1 ; i++){
            // System.out.println("Test");
            theSList.clear();
            for (int j = i ; j < i + words.length * wdlen ; j = j + wdlen){

                theSList.add(s.substring(j, j + wdlen));


            }

            if ( isContainAllWords(theSList, theWordsMap )) theResult.add(i);

        }

//        for (int i = 0 ; i < theResult.size() ; i++){
//            theResult.set( i, theResult.get(i) ) ;
//
//        }





        return theResult;





//         String theSubS;
//         Map<String, Integer> tempWordsMap =  new HashMap<>();


//         for (int i = 0 ; i < s.length ; i = i + wdlen){
//             theSubS = s.subString(i, i + wdlen);

//             tempWordsMap = copyMap(theWordsMap);


//             if (theWordsMap.containsKey(theSubS)){
//                tempWordsMap.put(theWordsMap.get(theSubs) - 1)
//                   if ( tempWordsMap.get(theSubs) == 0) tempWordsMap.remove( theSubS );
//                   if ( tempWordsMap.size() == 0 ) break;
//             }


//         }

//         if ( tempWordsMap.size() == 0 )



    }

    public static boolean isContainAllWords(List<String> theStrList, Map<String, Integer> theWordsMap ){
        // System.out.println("*************************************************");
        int mapSize =  0 ;

        for (Map.Entry<String, Integer> entry : theWordsMap.entrySet() ){
            mapSize += entry.getValue();
        }

        Map<String, Integer> tempWordsMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : theWordsMap.entrySet()) {
            tempWordsMap.put(entry.getKey(), entry.getValue());
        }

        //   for (Map.Entry<String, Integer> entry: tempWordsMap.entrySet()){
        // System.out.println("tempWordsMap： entry.getKey(): " + entry.getKey() + "  entry.getValue: " + entry.getValue());

        //  }



        for (int i = 0 ; i < mapSize ; i++){
            // System.out.println( "theStrList.get(i): " + theStrList.get(i));
            // System.out.println("index: " + i);



            if ( tempWordsMap.containsKey(theStrList.get(i)) ){
                //   System.out.println("theWordsMap.containsKey(theStrList.get(i)): " + tempWordsMap.containsKey(theStrList.get(i)));
                //  System.out.println("theStrList.get(i): " + theStrList.get(i) +" tempWordsMap.get: " + tempWordsMap.get(theStrList.get(i)) );
                tempWordsMap.put(theStrList.get(i) , tempWordsMap.get(theStrList.get(i)) - 1);
                if ( tempWordsMap.get( theStrList.get(i) ) == 0 ) tempWordsMap.remove( theStrList.get(i) );


                if ( tempWordsMap.size() == 0 ) return true;


            } else return false;

            // System.out.println("map.size; " + tempWordsMap.size() );
            for (Map.Entry<String, Integer> entry: tempWordsMap.entrySet()){


                //  System.out.println(" entry.getKey(): " + entry.getKey() +  " entry.getValue: " + entry.getValue() );


            }





        }


        return false;

    }


}
