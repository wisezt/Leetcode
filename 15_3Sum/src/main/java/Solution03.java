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
                    if (hasNoSameElements(-sum, (int) entryI.getKey(), (int) entryj.getKey(), hashMap)) {
                        List<Integer> list = new ArrayList(List.of(-sum, entryI.getKey(), entryj.getKey()));
                        System.out.printf("(int)entryI.getKey(): %s\t(int)entryj.getKey(): %s\t-sum: %s\thashmap.get(%s): %s\n", (int) entryI.getKey(), (int) entryj.getKey(), -sum, -sum, hashMap.get(-sum));
//                        System.out.printf(list);
                        Collections.sort(list);
                        tripletsSet.add(list);
                    }
                }
            }
        }


//
        List<List<Integer>> result = new ArrayList<>(tripletsSet);
//        Collections.sort(result);


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