import java.lang.invoke.SwitchPoint;

public class Solution01 implements Solution{
    public int mySqrt(int x) {

        String str = Integer.toString(x);
        int length = str.length();
        int decimal = (length - 1)/2;


        // initial the start num
        int num;
        int startNum = 0;
        int sqrtNum;
        for (int i = 0 ; i< decimal; i++){
            num = Integer.valueOf(str.substring(i));
            sqrtNum = getSqrtNum(num);
            startNum = startNum*10+ sqrtNum;
        }





        return 0;
    }

    private int getSqrtNum(int num) {

        if (num >=9){
            return 3;
        } else if (num >=4){
            return 2;
        } else return 1;





    }
}
