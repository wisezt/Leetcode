public class Question_4_MedianofTwoSortedArrays {

    public static void main(String[] strings){

        int[] nums1 = {0,0};
        int[] nums2 = {0,0};


    System.out.println("num: " + findMedianSortedArrays(nums1, nums2));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        double result = 0.9;

        int theTotalLength = nums1.length + nums2.length;
        int medianIndex = 0;
        int index1 = 0;
        int index2 = 0;
        boolean isMedian1 = true;

        if (theTotalLength % 2 == 0){
            medianIndex = theTotalLength / 2 - 1;

        } else{
            medianIndex = (theTotalLength-1) / 2 ;
        }





        result = getMedian(isMedian1, medianIndex, index1, index2, nums1, nums2);
        return  result;

    }



    public static double getMedian(boolean isMedian1, int medianIndex, int index1, int index2, int[] nums1, int[] nums2){

        double result = 0.9;

        for (int i = 0 ; i <= medianIndex ; i++){
            System.out.println("meidanIndex: " + medianIndex + " i:" +  i +" a " +"  index1: " + index1 + " index2: " + index2 );





            if (index1 >= nums1.length){


                isMedian1 = false;
                if (i == medianIndex){
                    return getMedianValue(isMedian1, index1, index2, nums1, nums2);
                }
                index2++;

            } else if (index2 >= nums2.length){

                isMedian1 = true;
                if (i == medianIndex){
                    return getMedianValue(isMedian1, index1, index2, nums1, nums2);
                }
                index1++;
            } else{
                if (nums1[index1] < nums2[index2]){
                    isMedian1 = true;

                    if (i == medianIndex){
                        return getMedianValue(isMedian1, index1, index2, nums1, nums2);
                    }
                    index1++;

                } else if(nums1[index1] > nums2[index2]){

                    isMedian1 = false;

                    if (i == medianIndex){
                        return getMedianValue(isMedian1, index1, index2, nums1, nums2);
                    }
                    index2++;

                } else{
                    isMedian1 = false;
                    if (i == medianIndex){
                        return getMedianValue(isMedian1, index1, index2, nums1, nums2);
                    }
                    i++;

                    index1++;
                      result =  getMedian(isMedian1, medianIndex, index1, index2, nums1, nums2);

                    index2++;



                }

            }



        }




        return  result;
    }






    public static double getMedianValue(boolean isMedian1,int index1, int index2, int[] nums1, int[] nums2){
        double result = 0.0;

        int theTotalLength = nums1.length + nums2.length;
        int medianValue;
        double medianIndex;
        double medianValuePlus;
        int indexPlus;


        System.out.println("isMedian1: " + isMedian1 +  " nums1[" + index1 +"]:" + nums1[index1] +  " nums2[" + index2 +"]: " + nums2[index2] );


        if(theTotalLength % 2 == 0){


            if(isMedian1){
                indexPlus = index1 + 1;
                medianValuePlus = getNextValue(indexPlus, index2, nums1, nums2);
                result = (nums1[index1] + medianValuePlus)/2;

            } else{
                indexPlus = index2 +1;
                medianValuePlus = getNextValue(index1, indexPlus, nums1, nums2);
                result = (nums2[index2] + medianValuePlus)/2;

            }

        }else{



            if(isMedian1){
                result = nums1[index1];
            } else{
                result = nums2[index2];
            }




        }




        System.out.println("getMedianValue: " + result);

        return result;
    }





    // return the bigger if the index is out of border, return the value from other array
    public static double getNextValue(int index1, int index2, int[] nums1, int[] nums2 ){



            if (index1 >= nums1.length){
                return nums2[index2];
            }

            if (index2 >= nums2.length){
                return nums1[index1];
            }


            if(nums1[index1] <= nums2[index2]){
                return nums1[index1];
            }else{
                return nums2[index2];

            }



















    }






}
