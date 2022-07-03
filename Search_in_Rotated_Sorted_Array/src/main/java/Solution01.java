public class Solution01 implements Solution {

    @Override
    public int search(int[] nums, int target) {


        int l = 0;

        int r = nums.length - 1;

        int cur = (l + r) / 2;

//        if (nums[l] > target) {
//            return -1;
//        } else if (nums[r] < target) {
//            return -1;
//        }


        int numL;
        int numR;
        int numCur;
        int result = -1;


        cur = (l + r) / 2;
        numL = nums[l];
        numR = nums[r];
        numCur = nums[cur];


        println("Z: cur,numCur,l,numL,r,numR,target", cur, numCur, l, numL, r, numR, target);


        if (l == r) {

            if (numCur == target) {

                return cur;

            } else {
                return -1;
            }
        }


        while (l != r) {

            cur = (l + r) / 2;
            numL = nums[l];
            numR = nums[r];
            numCur = nums[cur];


            println("O: cur,numCur,l,numL,r,numR,target", cur, numCur, l, numL, r, numR, target);

            if (target == numL) {
                return l;
            } else if (target == numR) {
                return r;
            } else if (target == numCur) {
                return cur;
            }


            if (numL < numCur && numCur < numR) {


                println("A: cur,numCur,l,numL,r,numR,target", cur, numCur, l, numL, r, numR, target);

                if (target < numL) {
                    return -1;
                } else if (target > numR) {
                    return -1;
                } else if (target < numCur) {
                    r = cur;

                } else if (target > numCur) {
                    l = cur;
                } else if (target == numCur) {
                    return cur;
                } else {
                    println("There is an error: AAA");
                }

            } else if (numL < numCur && numL > numR) {


                println("B: cur,numCur,l,numL,r,numR,target", cur, numCur, l, numL, r, numR, target);
                if (target < numL && target > numR) {
                    return -1;
                } else if (target < numCur && target >= numL) {
                    r = cur;

                } else if (target > numCur || target < numR) {
                    l = cur;
                } else if (target == numCur) {
                    return cur;
                } else {
                    println("There is an error: BBB");
//                    throw new Exception("BBB");
                }
            } else if (numL > numR && numCur < numR) {


                println("C:cur,numCur,l,numL,r,numR,target", cur, numCur, l, numL, r, numR, target);
                if (target < numL && target > numR) {
                    return -1;
                } else if (target < numCur || target >= numR) {
                    r = cur;

                } else if (target > numCur && target <= numR) {
                    l = cur;
                } else if (target == numCur) {
                    return cur;
                } else {
                    println("There is an error: CCC");
                }
            } else {


                println("D: cur,numCur,l,numL,r,numR,target", cur, numCur, l, numL, r, numR, target);
//                println("There is an error");
                return -1;
            }

            println("");

        }


        return result;
    }


    static <T> void println(T t) {
        System.out.println(t);
    }

    static <T> void println(String names, T... vals) {
        String[] strs = names.split(",");
        for (int i = 0; i < vals.length; i++) {
            System.out.print(strs[i] + ": " + vals[i] + "\t");
        }
        System.out.println();

    }
}
