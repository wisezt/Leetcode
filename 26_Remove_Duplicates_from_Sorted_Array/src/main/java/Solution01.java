class Solution01 {
    public int removeDuplicates(int[] nums) {
        if (nums.length ==0){
            return 1;
        }

//        int referenceValue = nums[0];
        int L=1;

        for (int i = 1 ; i < nums.length; i++){


            if (nums[i]> nums[i-1]){

                nums[L] =nums[i];
                L++;

            }
        }



        return L;

    }
}