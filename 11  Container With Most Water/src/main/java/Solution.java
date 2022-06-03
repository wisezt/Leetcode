public class Solution {


    public int maxArea(int[] height) {
        int maxAmountWater=0;
//        int amountWater;
        int lengthH = height.length;

        for (int i =0 ; i < lengthH; i++){
            for (int j = i ; j < lengthH; j++){
                int amountWater = amountWater(i, j, height);
                maxAmountWater = (amountWater > maxAmountWater)? amountWater : maxAmountWater;
            }

        }

        return maxAmountWater;
    }

    private int amountWater(int i, int j, int[] height) {

        int minHeight = (height[i] < height[j])? height[i] : height[j];

        int result = (j - i ) * minHeight;

        return result;

    }

}
