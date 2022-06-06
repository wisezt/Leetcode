import java.util.*;

class Solution03 {
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3) {
            return new ArrayList<>();
        }


        Map<Integer, Integer> hashMap = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {

                hashMap.put(nums[i], 1);
            }
        }

        int sum;
        Set<List<Integer>> tripletsSet = new HashSet<>();
        for (Map.Entry entryI : hashMap.entrySet()) {
            for (Map.Entry entryj : hashMap.entrySet()) {

                sum = (int) entryI.getKey() + (int) entryj.getKey();

                if (hashMap.containsKey(-sum)) {
                    if (hasNoSameElements(-sum, (int) entryI.getKey(), (int) entryj.getKey(),hashMap)){
                        List<Integer> list = new ArrayList(List.of(-sum, entryI.getKey(), entryj.getKey()));
                        System.out.printf("(int)entryI.getKey(): %s\t(int)entryj.getKey(): %s\t-sum: %s\thashmap.get(%s): %s\n", (int) entryI.getKey(), (int) entryj.getKey(), -sum, -sum, hashMap.get(-sum));
//                        System.out.printf(list);
                        Collections.sort(list);
                        tripletsSet.add(list);
                    }


                }


            }

        }


//        Set<List<Integer>> tripletsSet = new HashSet<>();
//
//
//        int sum;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                List<Integer> indexList = new ArrayList<>();
//
//                sum = nums[i] + nums[j];
//                indexList.add(i);
//                indexList.add(j);
//                List<List<Integer>> list = new ArrayList<>();
//
//                if (hashMap.get(-sum) != null) {
//                    list.addAll(hashMap.get(-sum));
//                    list.add(indexList);
//                } else {
//                    list = List.of(indexList);
//                }
//
//
//                hashMap.put(-sum, list);
//
//
//            }
//
//
//        }
//
//
//        for (int i = 0; i < nums.length; i++) {
//            if (hashMap.containsKey(nums[i])) {
//                for (List<Integer> list : hashMap.get(nums[i])) {
//                    if (list.get(0) != i && list.get(1) != i) {
//                        List<Integer> tripletsList = new ArrayList<>(List.of(nums[i], nums[list.get(0)], nums[list.get(1)]));
//                        Collections.sort(tripletsList);
//                        tripletsSet.add(tripletsList);
//                    }
//                }
////                List<Integer> indexList = hashMap.get(nums[i]);
//
//
//            }
//        }


//        for (int i = 0; i < nums.length; i++) {
//
//            if (hashMap.containsValue(nums[i])) {
//
//
//                for (Map.Entry tmpEntry : hashMap.entrySet()) {
//
//                    if ((int) tmpEntry.getValue() == nums[i]) {
//
//                    }
//
//
//                }
//
//            }
//
//        }


//        Map<Integer,Integer> hashMap = new HashMap<>();


//        for (Map.Entry tmp1: hashMap.entrySet()){
//
//            for (Map.Entry tmp2: hashMap.entrySet()) {
//
//                for (Map.Entry tmp3: hashMap.entrySet()) {
//
//                    if ((int)tmp1.getValue() + (int)tmp2.getValue() + (int)tmp3.getValue() == 0){
//                        System.out.printf( tmp1.getValue() + " " + (int)tmp2.getValue() + " " + (int)tmp3.getValue());
//                        hashMap.remove(tmp1.getKey());
//                        hashMap.remove(tmp2.getKey());
//                        hashMap.remove(tmp3.getKey());
//                    }
//
//
//                }
//
//            }
//
//
//        }

        List<List<Integer>> result = new ArrayList<>(tripletsSet);


        return result;
    }

    private boolean hasNoSameElements(int num1, int num2, int num3, Map<Integer, Integer> hashMap) {

        if ((num1 != num2 && num1 != num3 && num2 != num3) ||
                (num1 == num2 && num1 != num3 && hashMap.get(num1) >= 2) ||
                (num1 == num2 && num1 == num3 && hashMap.get(num1) >= 3)
        ) {

            return true;

        }
        return false;

    }


}