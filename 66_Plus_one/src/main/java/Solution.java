class Solution {
    public int[] plusOne(int[] digits) {

        int sum;
        int onePlus=0;
        sum = digits[digits.length - 1] + 1;

        digits[digits.length - 1] =  sum%10;
        onePlus = sum/10;
        for (int i = digits.length -2 ; i >=0; i--){
            sum = (digits[i] + onePlus);
            digits[i] = sum % 10;
            onePlus = sum /10;

        }

        if(onePlus ==0){
            return digits;
        } else{
            int[] result = new int[digits.length + 1];
            result[0] = 1;

            for (int i = 1; i < result.length; i++ ){
                result[i] = digits[i-1];
            }


            return result;



        }





    }
}