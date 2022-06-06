import java.util.*;

class Solution04 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result =  new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);

        Map<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> sortedList = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                sortedList.add(nums[i]);
                hashMap.put(nums[i], 1);
            }
        }

        int sum;
        Set<List<Integer>> tripletsSet = new HashSet<>();
        for (int i = 0; i < sortedList.size(); i++) {
            if (sortedList.get(i) > 0) {
                break;
            }

            for (int j = i; j < sortedList.size(); j++) {
//                System.out.printf("sortedList.get(i): " + sortedList.get(i) + "\t");
//                System.out.printf("sortedList.get(j): " + sortedList.get(j) + "\t");
                sum = sortedList.get(i) + sortedList.get(j);

                if (hashMap.containsKey(-sum)) {
//                    System.out.printf("containsKey[-sum]: %s\n\n", hashMap.containsKey(-sum));
                    if (hasNoSameElements(-sum, sortedList.get(i), sortedList.get(j), hashMap)) {
                        List<Integer> list = new ArrayList(List.of(-sum, sortedList.get(i), sortedList.get(j)));
//                        System.out.printf("(int)entryI.getKey(): %s\t(int)entryj.getKey(): %s\t-sum: %s\thashmap.get(%s): %s\n", (int) entryI.getKey(), (int) entryj.getKey(), -sum, -sum, hashMap.get(-sum));
//                        System.out.printf(list + "\n");
                        Collections.sort(list);
                        tripletsSet.add(list);
//                        result.add(list);
                    }
                }
//                System.out.println();
            }
        }


//
        result = new ArrayList<>(tripletsSet);
//        Collections.sort(result);


        return result;
    }

    private boolean hasNoSameElements(int num1, int num2, int num3, Map<Integer, Integer> hashMap) {
        System.out.println(num1 + " " + num2 + " " + num3);

        if ((num1 != num2 && num1 != num3 && num2 != num3) ||
                (num1 == num2 && num1 != num3 && hashMap.get(num1) >= 2) ||
                (num1 != num2 && num1 == num3 && hashMap.get(num1) >= 2) ||
                (num1 != num2 && num2 == num3 && hashMap.get(num2) >= 2) ||
                (num1 == num2 && num1 == num3 && hashMap.get(num1) >= 3)
        ) {

            return true;

        }
        return false;

    }


}