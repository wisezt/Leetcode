public class Question_5_Longest_Palindromic_Substring_02 {

    public static void main(String[] strings){



        String s = //"civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";

                "bb";

        String result = longestPalindrome(s);

        System.out.println(result);



    }



    public static String longestPalindrome(String s) {


            if(s.length() <= 1) return s;

            boolean charDuplicate = false, anyDuplicate = false ;
            int subIndex, count, maxCount = 1, maxIndexStart = 0, maxIndexEnd = 0;


            for (int i = 0 ; i < s.length() ; i++){


                subIndex =  i + 1;
                if(subIndex > s.length()-1 || subIndex >=1000)break;



                count = 0;
                while (!charDuplicate){
                    count++;
                    System.out.println("=======" + "i: " + i + " subIndex: " + subIndex + " maxCount: " + maxCount + " maxIndexStart: " + maxIndexStart + " maxIndexEnd: " + maxIndexEnd + " charDuplicate: " + charDuplicate);

                    charDuplicate = s.charAt(i) == s.charAt(subIndex);
                    System.out.println(s.charAt(i) + " " + s.charAt(subIndex));



                    if (count >= maxCount){
                        maxCount = count;
                        maxIndexStart = i;
                        maxIndexEnd = subIndex + 1;

                    }

                    System.out.println("i: " + i + " subIndex: " + subIndex + " maxCount: " + maxCount + " maxIndexStart: " + maxIndexStart + " maxIndexEnd: " + maxIndexEnd + " charDuplicate: " + charDuplicate);



                    if(charDuplicate) anyDuplicate = true;




                    subIndex++;
                    System.out.println("subIndex: " + subIndex + "s.length(): " + s.length());
                    if(subIndex >= s.length()-1 || subIndex >=1000)break;


                }

                if (!anyDuplicate) maxCount = 0;






            }

            if( !anyDuplicate ){
              return s.substring(0,1);
            }


            return s.substring(maxIndexStart, maxIndexEnd);










    }





}
