public class Question_11_Container_With_Most_Water {

    public static void main(String[] strings){

        int[] array = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(array));



    }




    public static int maxArea(int[] height) {



        int theMaxArea = 0;
        int theArea;



        for (int i = 0 ; i < height.length - 1 ; i++){



            for (int j = i + 1 ; j < height.length ; j++){



                theArea = height[i] < height[j] ? height[i] * ( j - i) : height[j] * ( j - i );


                if ( theArea > theMaxArea){
                    theMaxArea = theArea;

                }



            }







        }






        return theMaxArea;

    }



}
