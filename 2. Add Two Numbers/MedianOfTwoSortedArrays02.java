
public class MedianOfTwoSortedArrays02 {
    public static void main(String[] args) {
        int[] nums1 = { 2, 3 };
        int[] nums2 = { 1 };
        double r = findMedianSortedArrays(nums1, nums2);
        System.out.println(r);
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int lengthNums1 = nums1.length;
        int lengthNums2 = nums2.length;
        int LeftIndexNums1 = 0, rightIndexNums1 = lengthNums1 - 1;
        int LeftIndexNums2 = 0, rightIndexNums2 = lengthNums2 - 1;
        int LeftValue;
        int rightValue;
        if (lengthNums1 != 0 && lengthNums2 != 0) {
            LeftValue = (nums1[LeftIndexNums1] <= nums2[LeftIndexNums2]) ? nums1[LeftIndexNums1]
                    : nums2[LeftIndexNums2];
            rightValue = (nums1[rightIndexNums1] >= nums2[rightIndexNums2]) ? nums1[rightIndexNums1]
                    : nums2[rightIndexNums2];

            for (int i = 0; i < (lengthNums1 + lengthNums2 + 1) / 2; i++) {

                // System.out.printf("LeftIndexNums1 : %s \tLeftIndexNums2: %s", LeftIndexNums1,
                // LeftIndexNums2);

                if (LeftIndexNums1 < lengthNums1 && LeftIndexNums2 < lengthNums2) {
                    if (nums1[LeftIndexNums1] <= nums2[LeftIndexNums2]) {
                        LeftValue = nums1[LeftIndexNums1];
                        LeftIndexNums1++;
                        System.out.println("*");

                    } else if (nums1[LeftIndexNums1] >= nums2[LeftIndexNums2]) {
                        LeftValue = nums2[LeftIndexNums2];
                        LeftIndexNums2++;
                        System.out.println("***");
                    }
                } else if (LeftIndexNums1 >= lengthNums1 && LeftIndexNums2 < lengthNums2) {
                    if (LeftValue <= nums2[LeftIndexNums2]) {
                        LeftValue = nums2[LeftIndexNums2];
                        LeftIndexNums2++;
                        System.out.println("**");
                    }

                } else if (LeftIndexNums1 < lengthNums1 && LeftIndexNums2 >= lengthNums2) {
                    if (LeftValue <= nums1[LeftIndexNums1]) {
                        LeftValue = nums1[LeftIndexNums1];
                        LeftIndexNums1++;
                        System.out.println("****");
                    }
                }

                // System.out.printf("rightIndexNums1: %s, \trightIndexNums2: %s\n",
                // rightIndexNums1, rightIndexNums2);

                if (0 <= rightIndexNums1 && 0 <= rightIndexNums2) {
                    if (nums1[rightIndexNums1] >= nums2[rightIndexNums2]) {
                        rightValue = nums1[rightIndexNums1];
                        rightIndexNums1--;
                    } else if (nums1[rightIndexNums1] <= nums2[rightIndexNums2]) {
                        rightValue = nums2[rightIndexNums2];
                        rightIndexNums2--;
                    }

                } else if (0 >= rightIndexNums1 && 0 <= rightIndexNums2) {
                    if (rightValue >= nums2[rightIndexNums2]) {
                        rightValue = nums2[rightIndexNums2];
                        rightIndexNums2--;
                    }
                } else if (0 <= rightIndexNums1 && 0 >= rightIndexNums2) {
                    if (nums1[rightIndexNums1] <= rightValue) {
                        rightValue = nums1[rightIndexNums1];
                        rightIndexNums1--;
                    }
                }
            }

            // System.out.printf("LeftValue: %s\t rightValue: %s\n\n", LeftValue,
            // rightValue);

        } else if (lengthNums1 != 0) {
            if (nums1.length % 2 == 1) {
                LeftValue = nums1[lengthNums1 / 2];
                rightValue = nums1[lengthNums1 / 2];
            } else {
                LeftValue = nums1[lengthNums1 / 2 - 1];
                rightValue = nums1[lengthNums1 / 2];
            }

        } else {
            if (nums2.length % 2 == 1) {
                LeftValue = nums2[lengthNums2 / 2];
                rightValue = nums2[lengthNums2 / 2];
            } else {
                LeftValue = nums2[lengthNums2 / 2 - 1];
                rightValue = nums2[lengthNums2 / 2];
                System.out.println(LeftValue + " " + rightValue);
            }
        }

        double result;

        if ((rightValue + LeftValue) % 2 == 1) {
            result = (rightValue + LeftValue) / 2 + 0.5;
        } else {
            result = (rightValue + LeftValue) / 2;
        }

        return result;

    }

}
