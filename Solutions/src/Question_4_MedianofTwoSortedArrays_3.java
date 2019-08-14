public class Question_4_MedianofTwoSortedArrays_3 {

    public static void main(String[] strings) {

        int[] nums1 = {};
        int[] nums2 = {2,3};


        System.out.println("num: " + findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int theTotalLength = nums1.length + nums2.length;
        int index1=0, index2=0;
        int nums1L = nums1.length, nums2L = nums2.length;
        double medianIndex;
        int count;
        boolean isArr1 = false;
        boolean isIndex1OutOfBorder = false;
        boolean isIndex2OutOfBorder = false;


        int currentIndex = 0;

        int medianIndexPlus = 0, medianIndexMinus=0;
        double medianIndexPlusValue = 0;
        double medianIndexMinusValue = 0;

        // Odd
        if (theTotalLength % 2 == 1) {
            medianIndex = (theTotalLength - 1) / 2;


            for (count = 0; count <= medianIndex; count++) {
                if (index1 >= nums1L) {
                    isIndex1OutOfBorder = true;

                    break;
                }

                if (index2 >= nums2L) {
                    isIndex2OutOfBorder = true;

                    break;
                }

                if (nums1[index1] <= nums2[index2]) {
                    currentIndex = index1;
                    isArr1 = true;
                    index1++;
                } else {
                    currentIndex = index2;
                    isArr1 = false;
                    index2++;
                }


            }


            if (isIndex1OutOfBorder) {
                for (int i = count; i < medianIndex; i++) {
                    index2++;
                }

                return nums2[index2];
            }


            if (isIndex2OutOfBorder) {
                for (int i = count; i < medianIndex; i++) {
                    index1++;
                }

                return nums1[index1];
            }


            if (isArr1) {
                return nums1[currentIndex];

            } else {
                return nums2[currentIndex];
            }


        } else{


            //Even

            medianIndexMinus = (theTotalLength) / 2 - 1;


            for (count = 0; count <= medianIndexMinus; count++) {


                if (index1 >= nums1L) {
                    isIndex1OutOfBorder = true;

                    break;
                }

                if (index2 >= nums2L) {
                    isIndex2OutOfBorder = true;

                    break;
                }

                if (nums1[index1] <= nums2[index2]) {
                    currentIndex = index1;
                    isArr1 = true;
                    index1++;
                } else {
                    currentIndex = index2;
                    isArr1 = false;
                    index2++;
                }


            }


            if (isIndex1OutOfBorder) {
                for (int i = count; i < medianIndexMinus; i++) {
                    index2++;
                }

                medianIndexPlus = index2 + 1;



                return ((nums2[index2] + nums2[medianIndexPlus])/2.0);
            }


            if (isIndex2OutOfBorder) {
                for (int i = count; i < medianIndexMinus; i++) {
                    index1++;
                }

                return (nums1[index1] + nums1[++index1])/2.0;
            }


            if (isArr1) {

                medianIndexMinusValue = nums1[currentIndex];



                if (index1 >= nums1L) {

                    medianIndexPlusValue = nums2[index2];
                } else


                if (nums1[index1] <= nums2[index2]) {
                    medianIndexPlusValue = nums1[index1];
                } else {
                    medianIndexPlusValue = nums2[index2];
                }


                return (medianIndexMinusValue + medianIndexPlusValue)/2.0;

            } else {

                medianIndexMinusValue = nums2[currentIndex];



                if (index2 >= nums2L) {

                    medianIndexPlusValue = nums1[index1];
                } else

                if (nums1[index1] <= nums2[index2]) {
                    medianIndexPlusValue = nums1[index1];
                } else {
                    medianIndexPlusValue = nums2[index2];
                }





                return (medianIndexMinusValue + medianIndexPlusValue)/2.0;
            }








        }












    }

}
