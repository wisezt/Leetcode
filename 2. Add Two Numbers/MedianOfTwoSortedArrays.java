import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        double r = findMedianSortedArrays(nums1, nums2);
        System.out.println(r);
    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        List<Integer> listAll = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            listAll.add((Integer) nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            listAll.add((Integer) nums2[i]);
        }
        Collections.sort(listAll);
        int length = listAll.size();
        int index;
        if (length % 2 == 1) {
            index = (length + 1) / 2 - 1;
            return listAll.get(index);
        } else {
            int val1 = listAll.get(length / 2);
            int val2 = listAll.get(length / 2 - 1);
            int sum = val1 + val2;
            
            double result = sum/2;
            if (sum % 2 == 1){
                result +=0.5;
            }
            System.out.printf("val1: %s,\tval2: %s,\tresult: %s\n", val1, val2, result);
            return result;
        }

    }

}
