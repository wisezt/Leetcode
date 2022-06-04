public class Solution {


    public int maxArea(int[] height) {
        int maxAmountWater = 0;
//        int maxHeight = 0;
//        int amountWater;

        int lengthH = height.length;

        int maxHeightRightI=0;
        for (int i = 0; i < lengthH; i++) {
            if (maxHeightRightI < height[i]){
                maxHeightRightI = height[i];
            }else {
                continue;
            }

            int maxHeight = 0;
            for (int j = lengthH - 1; j >= i; j--) {
//                System.out.printf("i: %s\tj: %s\n",i,j);
                if (height[j] > maxHeight) {
                    maxHeight = height[j];
                    int amountWater = amountWater(i, j, height);
                    maxAmountWater = (amountWater > maxAmountWater) ? amountWater : maxAmountWater;
//                    System.out.printf("maxHeight: %s\tamountWater: %s\tmaxAmountWawter: %s\n\n",maxHeight,amountWater,maxAmountWater);

                }
//                System.out.printf("maxHeight: %s\tamountWater: %s\tmaxAmountWawter: %s\n");

            }

        }

        return maxAmountWater;
    }

    private int amountWater(int i, int j, int[] height) {

        int minHeight = (height[i] < height[j]) ? height[i] : height[j];

        int result = (j - i) * minHeight;

        return result;

    }

}
