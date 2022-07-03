import java.util.*;

class Solution06 {
    public List<List<Integer>> threeSum(int[] nums) {
        int count = 0;
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length < 3) {
            return result;
        }

//        Arrays.sort(nums);

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

        Collections.sort(sortedList);

        int sum;
//        Map<String, >
        Set<String> cache = new HashSet<>();
        Set<String> tripletsSet = new HashSet<>();
        int leftIndex = 0;
        int rightIndex = sortedList.size() - 1;
        while (leftIndex <= rightIndex) {
            int num1 = sortedList.get(leftIndex);
            if (num1 > 0) {
                break;
            }

            int num2 = sortedList.get(rightIndex);
            if (num2 < 0) {
                break;
            }

            int num3 = -(num1 + num2);

            hashMap.put(num1, hashMap.get(num1) - 1);
            if (hashMap.get(num1) < 1) hashMap.remove(num1);

            hashMap.put(num2, hashMap.get(num2) - 1);
            if (hashMap.get(num2) < 1) hashMap.remove(num2);


            if (hashMap.containsKey(num3)) {
                List<Integer> list = new ArrayList(List.of(num3, sortedList.get(i), sortedList.get(j)));
                result.add(list);
                leftIndex++;
                rightIndex++;
                hashMap.remove(num1);

                continue;

            }


            if()


        }


//
//        result = new ArrayList<>(tripletsSet);
//        Collections.sort(result);

        System.out.println("count: " + count);
        return result;
    }

    private boolean hasNoSameElements(int num1, int num2, int num3, Map<Integer, Integer> hashMap) {
//        System.out.println(num1 + " " + num2 + " " + num3);

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