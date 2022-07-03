import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution02 implements Solution {

    public List<List<Integer>> permute(int[] nums) {
        Integer[] integers = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        List<Integer> listNums = Arrays.asList(integers);
        List<Integer> listPermutation = new ArrayList<>();


        return getPermutations(listNums, listPermutation);
    }

    private List<List<Integer>> getPermutations(List<Integer> listNums, List<Integer> listPermutation) {


        List<List<Integer>> result = new ArrayList<>();
        if (listNums.size() == 0) {
            result.add(listPermutation);
            return result;
        }

        for (int i = 0; i < listNums.size(); i++) {

            List<Integer> tmplist = new ArrayList<>(listNums);
            tmplist.remove(i);
//            Tools.println("after removing");
//            Tools.println(tmplist);


            List<Integer> tmplistPermutation = new ArrayList<>(listPermutation);
            tmplistPermutation.add(listNums.get(i));


//            Tools.println("listPermutation:");
//            Tools.println(listPermutation);



//            Tools.println("tmplistPermutation:");
//            Tools.println(tmplistPermutation);
//
//            Tools.println("");


            result.addAll(
                    getPermutations(tmplist, tmplistPermutation)
            );


        }


        return result;
    }

}
