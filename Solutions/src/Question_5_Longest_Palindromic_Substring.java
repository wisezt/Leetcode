public class Question_5_Longest_Palindromic_Substring {

    public static void main(String[] strings){



        String s = //"civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";

                "cbbd";

        String result = longestPalindrome(s);

        System.out.println(result);



    }



    public static String longestPalindrome(String s) {








        int maxCount = 1, currentIndex = 0, currentIndex_Inner, maxIndex = 0;
        char currentChr;



        if (s.length() == 0){
            return "";
        }

        for(int i = 0 ; i < s.length() - maxIndex && i < 1000; i++){

            currentChr = s.charAt(i);
            currentIndex = i;
            currentIndex_Inner = currentIndex + 1;



            while(isNoDuplicate(currentIndex, currentIndex_Inner, s)){
                System.out.println("i: " + i + " maxCount: " + maxCount + " maxIndex: " + maxIndex + " currentIndex_Inner: " + currentIndex_Inner);

               // maxCount = maxCount < currentIndex_Inner ? currentIndex_Inner : maxCount;

                if(maxCount < currentIndex_Inner){
                    maxCount = currentIndex_Inner;
                    maxIndex = i;
                    System.out.println("maxIndex: " + maxIndex);
                }

                currentIndex_Inner++;

            }

            if (maxCount == s.length()){
                maxCount = 1;
                maxIndex = i;
            }
        }



        System.out.println("maxIndex: " + maxIndex + " maxCount: " + maxCount + "maxIndex: " +  maxIndex + " s.length()" + s.length()) ;


        return s.substring(maxIndex, maxCount + maxIndex);







    }


    public static boolean isNoDuplicate(int currentIndex, int currentIndex_Inner, String s){


        System.out.println("currentIndx: " + currentIndex + " currentIndex_Inner: " + currentIndex_Inner);


        if(currentIndex_Inner >= s.length()){
            return false;
        }

        if(s.charAt(currentIndex) == s.charAt(currentIndex_Inner)){
            return false;
        }else{
            return true;
        }


    }


}
