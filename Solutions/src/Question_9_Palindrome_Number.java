/*
9. Palindrome Number
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true
Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:

Coud you solve it without converting the integer to a string?
*/
public class Question_9_Palindrome_Number {

    public boolean isPalindrome(int x) {


        if ( x < 0){
            return false;
        } else if ( x == 0 ) {
            return true;
        }



        int theLength = (int) (Math.log10( x ) + 1);


        int theX = x;
        int theNumA;
        int theNumB;
        boolean result = true;
        int theXB = 0 , theXB_cal = x;


        // odd length
        if ( theLength % 2 == 1 ){

            for (int i = 0 ; i < (theLength - 1 ) / 2 ; i++){
                theNumA = theX % 10 ;
                theNumB = (int) (theXB_cal / Math.pow(10, theLength - i - 1 ));


                if ( theNumA != theNumB ){
                    return false;
                }
                theXB = (int) (theXB + theNumB * Math.pow(10, theLength - i - 1));
                theXB_cal = x - theXB;
                theX = (theX - theNumA ) /10;

            }

        } else{



            // even length


            for (int i = 0 ; i < (theLength)/2 ; i++){
                theNumA = theX % 10 ;
                theNumB = (int) (theXB_cal / Math.pow(10, theLength - i - 1 ));


                if ( theNumA != theNumB ){
                    return false;
                }
                theXB = (int)(theXB + (int)theNumB * Math.pow(10, theLength - i - 1));
                theXB_cal = x - theXB;
                theX = (theX - theNumA ) /10;
            }

        }

        return result;


    }

}
