import java.util.*;

class Solution02 {
    public List<List<Integer>> threeSum(int[] nums) {

//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> sum

        Map<Integer, List<List<Integer>>> hashMap = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            hashMap.put(nums[i], i);
//
//        }

        Set<List<Integer>> tripletsSet = new HashSet<>();


        int sum;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> indexList = new ArrayList<>();

                sum = nums[i] + nums[j];
                indexList.add(i);
                indexList.add(j);
                List<List<Integer>> list = new ArrayList<>();

                if (hashMap.get(-sum) != null) {
                    list.addAll(hashMap.get(-sum));
                    list.add(indexList);
                } else {
                    list = List.of(indexList);
                }


                hashMap.put(-sum, list);

//                if (hashMap.containsKey(-sum)) {
//                    List<Integer> tripletsList = List.of(nums[i], nums[j], -sum);
//                    Collections.sort(tripletsList);
//                    tripletsSet.add(tripletsList);
//
//                } else if(!hashMap.containsKey(-sum)){
//
//
//                }
            }
//                List<Integer> tmpKey = new ArrayList<>();
//                if (nums[i] > nums[j]) {
//                    tmpKey.add(j);
//                    tmpKey.add(i);
//                } else {
//                    tmpKey.add(i);
//                    tmpKey.add(j);
//                }
//
//                if (hashMap.get(tmpKey) != null) {
//                    hashMap.put(tmpKey, nums[i] + nums[j]);
//                }


//                if (hashMap.containsValue(-nums[i])){
//
//                    for (Map.Entry tmpEntry : hashMap.entrySet()){
//                        if ((int)tmpEntry.getValue() == -nums[i]){
//                            ((List<Integer>)tmpEntry.getKey()).add(nums[i]);
//                            ((List<Integer>) tmpEntry.getKey()).sort( );
//                            Collection.sort()
//                            hashMap.put()
//                        }
//                    }
//
//
//                }
//
//
//                Integer[] intArr = new Integer[]{nums[i], nums[j]};
//                Arrays.sort(intArr);
//                hashMap.put(intArr, nums[i]+nums[j]);

//                for (int k = j +2; k < nums.length; k++) {
//                    if (nums[i]+nums[j]+nums[k] == 0){
////                        List<Integer> tmpList = new ArrayList<>();
////                        tmpList.add(nums[i]);
//                        Integer[] intArr = new Integer[]{nums[i], nums[k], nums[k]};
//                        Arrays.sort(intArr);
//
//
//                    }
//                }

//                hashMap.put(i + " " + j, nums[i]+ nums[j]);

        }


        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                for (List<Integer> list : hashMap.get(nums[i])) {
                    if (list.get(0) != i && list.get(1) != i) {
                        List<Integer> tripletsList = new ArrayList<>(List.of(nums[i], nums[list.get(0)], nums[list.get(1)]));
                        Collections.sort(tripletsList);
                        tripletsSet.add(tripletsList);
                    }
                }
//                List<Integer> indexList = hashMap.get(nums[i]);


            }
        }


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

    private boolean hasNoDuplicatedMapKeys(int value, Map<Integer, Integer> hashMap, int i, int j) {


        for (Map.Entry entry : hashMap.entrySet()) {
            if ((int) entry.getValue() == value && (int) entry.getKey() != i && (int) entry.getKey() != j) {
                return true;
            }

        }
        return false;


    }


}