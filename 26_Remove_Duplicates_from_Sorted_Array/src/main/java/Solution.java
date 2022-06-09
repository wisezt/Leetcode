class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length ==0){
            return 1;
        }

        int referenceValue = nums[0];
        int firstAvaliableSpaceIndex=1;

        for (int i = 1 ; i < nums.length; i++){


            if (nums[i]> referenceValue){
                referenceValue = nums[i];
                nums[firstAvaliableSpaceIndex] =referenceValue;
                firstAvaliableSpaceIndex++;

            }
        }



    return firstAvaliableSpaceIndex;

    }
}