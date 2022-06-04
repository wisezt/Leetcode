public class Solution02 {


    public int maxArea(int[] height) {
//        int count = 0;
        int maxAmountWater = 0;


        int lengthH = height.length;

        int maxHeightRightIndex = lengthH - 1;
        int maxHeightLeft = 0;
        int maxHeight;
        int amountWater;
        for (int i = 0; i < lengthH; i++) {
            if (maxHeightLeft <= height[i]) {
                maxHeightLeft = height[i];

            } else {
                continue;
            }

            maxHeight = height[lengthH - 1];
            maxHeightRightIndex = lengthH - 1;
            amountWater = amountWater(i, lengthH - 1, height);
            maxAmountWater = (amountWater >= maxAmountWater) ? amountWater : maxAmountWater;
            for (int j = maxHeightRightIndex; j >= i; j--) {

                if (height[maxHeightRightIndex] >= height[i]) {
//                    System.out.printf("height[%s]: %s\theight[%s]: %s\n",maxHeightRightI,height[maxHeightRightI], i, height[i]);
//                    System.out.println("count: " + count);
//                    return maxAmountWater;
                    continue;
                }

//                count++;
                if (height[j] > maxHeight) {
                    maxHeight = height[j];
                    maxHeightRightIndex = j;
                    amountWater = amountWater(i, j, height);
                    maxAmountWater = (amountWater > maxAmountWater) ? amountWater : maxAmountWater;
//                    System.out.printf("height[%s]: %s\theight[%s]: %s\n", maxHeightRightIndex, height[maxHeightRightIndex], i, height[i]);

//                    System.out.printf("maxHeight: %s\tamountWater: %s\tmaxAmountWawter: %s\n\n",maxHeight,amountWater,maxAmountWater);
                }


//                System.out.printf("maxHeight: %s\tamountWater: %s\tmaxAmountWawter: %s\n");
                //   This is an optimization.

            }


        }

//        System.out.println("count: " + count);

        return maxAmountWater;
    }

    private int amountWater(int i, int j, int[] height) {

        int minHeight = (height[i] < height[j]) ? height[i] : height[j];

        int result = (j - i) * minHeight;

        return result;

    }

}
