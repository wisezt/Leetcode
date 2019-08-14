public class Question_4_MedianofTwoSortedArrays_Recursion {

    public static void main(String[] strings) {

        int[] nums1 = {1, 3};
        int[] nums2 = {3};


        System.out.println("num: " + findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int theTotalLength = nums1.length + nums2.length;
        int nums1L = nums1.length, nums2L = nums2.length;
        double medianIndex = Math.floor((theTotalLength - 1) / 2);
        boolean isMedian = false;
        int count = 0;
        boolean isArr1 = false;


        double result = getMedianValue(count, medianIndex, isMedian, isArr1, nums1, nums2, 0, 0, theTotalLength, 0);

        return result;
    }

    public static double getMedianValue(int count, double medianIndex, boolean isMedian, boolean isArr1, int[] nums1, int[] nums2, int index_1, int index_2, int theTotalLength, int currArrIndex) {
        if (medianIndex == count) isMedian = true;
        System.out.println("count: " + count + "  medianIndex: " + medianIndex + " isMedian: " + isMedian + " isArr1: " + isArr1 + " nums1: " + nums1[index_1] + " nums2: " + nums2[index_2] + " index_1: " + index_1 + "  index_2: " + index_2);

        if (isMedian) {
            if (isArr1) {

    //            System.out.println("nums1[index_1]: " + nums1[index_1]);
                if (index_1 >= nums1.length) {
                    currArrIndex = index_2;
                    return getMedianValueByOE(isArr1, nums1, nums2, index_1, currArrIndex, theTotalLength);

                }


                return getMedianValueByOE(isArr1, nums1, nums2, currArrIndex, index_2, theTotalLength);
            } else {
                System.out.println("nums2[index_2]: " + nums2[index_2]);

                if (index_2 >= nums1.length) {
                    currArrIndex = index_1;
                    return getMedianValueByOE(isArr1, nums1, nums2, index_1, currArrIndex, theTotalLength);

                }
                return getMedianValueByOE(isArr1, nums1, nums2, index_1, currArrIndex, theTotalLength);
            }
        } else {


            if (index_1 >= nums1.length) {
                count++;
                index_2++;
                isArr1 = false;
                System.out.println("index_1 >= nums1.length");

            } else if (index_2 >= nums2.length) {
                count++;
                index_1++;
                isArr1 = true;
                System.out.println("index_2 >= nums2.length");

            } else if (nums1[index_1] < nums2[index_2]) {
                count++;
                currArrIndex = index_1;
                index_1++;
                isArr1 = true;
                System.out.println("nums1[index_1]< nums2[index_2]");

            } else if (nums1[index_1] > nums2[index_2]) {
                count++;
                currArrIndex = index_2;
                index_2++;
                isArr1 = false;
                System.out.println("index_1 > index_2");


            } else {
                System.out.println("index_1 == index_2");
                count++;
                currArrIndex = index_1;
                index_1++;



            }


            return getMedianValue(count, medianIndex, isMedian, isArr1, nums1, nums2, index_1, index_2, theTotalLength, currArrIndex);

        }


    }

    public static double getMedianValueByOE(boolean isArr1, int[] nums1, int[] nums2, int index_1, int index_2, int theTotalLength) {

        if (theTotalLength % 2 == 1) {

            if (isArr1) {
                return nums1[index_1];
            } else return nums2[index_2];


        } else {

            if (isArr1) {
                double medianPlus = getBiggerValue(isArr1, nums1, nums2, index_1, index_2, theTotalLength);
                return (nums1[index_1] + medianPlus) / 2;
            } else {
                double medianPlus = getBiggerValue(isArr1, nums1, nums2, index_1, index_2, theTotalLength);
                return (nums2[index_2] + medianPlus) / 2;
            }



        }


    }

    public static double getBiggerValue(boolean isArr1, int[] nums1, int[] nums2, int index_1, int index_2, int theTotalLength) {
        if (isArr1) {
            index_1++;
            if (index_1 >= nums1.length) {
                return nums2[index_2];

            } else if (index_2 >= nums2.length) {
                return nums2[index_2];

            } else if (nums1[index_1] <= nums2[index_2]) {
                return nums1[index_1];

            } else if (nums1[index_1] > nums2[index_2]) {
                return nums2[index_2];
            }

        } else {
            index_2++;
            if (index_2 >= nums2.length) {
                return nums2[index_2];

            } else if (index_1 >= nums1.length) {
                return nums2[index_2];

            } else if (nums1[index_1] <= nums2[index_2]) {
                return nums1[index_1];

            } else if (nums1[index_1] > nums2[index_2]) {
                return nums2[index_2];
            }

        }

return 0.0;
}

}
