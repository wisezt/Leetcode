public class Question_4_MedianofTwoSortedArrays {

    public static void main(String[] strings){

        int[] nums1 = {1,3};
        int[] nums2 = {2};


    System.out.println("num: " + findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double result;
        int theLength = nums1.length + nums2.length;
        int[] theArr = new int[theLength];
        int theNum;
        int index_i = 0;
        int index_j = 0;

        for (int i = 0 ; i < theLength ; i++){

            System.out.println("index_i: " + index_i + " index_j: " + index_j);

                    if (nums1.length > 0 && nums2.length >0) {


                        if (nums1[index_i] == nums2[index_j]) {
                            theNum = nums1[index_i];
                            theArr[i] = theNum;
                            i++;
                            theArr[i] = theNum;
                            index_i = index_i + 1 < nums1.length ? ++index_i : index_i;
                            index_j = index_j + 1 < nums2.length ? ++index_j : index_j;
                        } else if (nums1[index_i] < nums2[index_j]) {
                            theNum = nums1[index_i];
                            theArr[i] = theNum;
                            index_i = index_i + 1 < nums1.length ? ++index_i : index_i;
                        } else {
                            theNum = nums2[index_j];
                            theArr[i] = theNum;
                            index_j = index_j + 1 < nums2.length ? ++index_j : index_j;
                        }

                    } else if (nums1.length == 0 && nums2.length > 0){
                        theNum = nums2[index_j];
                        theArr[i] = theNum;
                        index_j = index_j + 1 < nums2.length ? ++index_j : index_j;
                    } else if (nums1.length > 0 && nums2.length == 0){
                        theNum = nums1[index_i];
                        theArr[i] = theNum;
                        index_i = index_i + 1 < nums1.length ? ++index_i : index_i;
                    }









        }
        double median;

        if (theLength % 2 == 0){
            median = theArr[theLength / 2];



        } else{
            median = theArr[(theLength-1)/2];
        }




        result = median;
        return result;
    }



}
