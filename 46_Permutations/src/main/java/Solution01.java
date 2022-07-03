import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution01 implements Solution{

    public List<List<Integer>> permute(int[] nums) {



        Integer[] integers =  Arrays.stream(nums).boxed().toArray(Integer[]::new);
        List<Integer> list = Arrays.asList(integers);
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<Integer>());


        return getPermutations(list,lists);
    }

    private List<List<Integer>> getPermutations(List<Integer> list, List<List<Integer>> lists) {

        List<List<Integer>> result = new ArrayList<>();

//        Tools.println("Nums in Box:");
//        Tools.printList(list);

        int countI= 0;
        for (int i = 0; i < lists.size(); i++) {
            countI++;
            if (countI == 10 ){

                break;


            }

            for (int j = 0; j < list.size(); j++) {

//                Tools.println("The current combination:");
//                Tools.printList(lists.get(i));
//
//                Tools.println("i,j,list.get(j)",i,j,list.get(j));

                List<Integer> tmplist = new ArrayList<>(list);

//                Tools.println(tmplist);

                tmplist.remove(j);
                Tools.println("after removing");
                Tools.println(tmplist);



                List<List<Integer>> tmpLists = new ArrayList<>(lists);
                tmpLists.get(i).add(list.get(j));



                Tools.println("lists:");
                Tools.println(lists.get(i));


                Tools.println("tmpLists:");
                Tools.println(tmpLists.get(i));

                Tools.println("");



                result.addAll(
                        getPermutations(tmplist, tmpLists)
                );


            }
       }





        return result;
    }
}
