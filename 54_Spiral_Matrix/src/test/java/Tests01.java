import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tests01 {

    Solution solution;


    @BeforeEach
    void setup(){
        solution = new Solution01();
    }


    @Test
    void test01(){

        int[][] intArr= new int[3][4];

        int count = 1;
        for (int i = 0 ; i < 3; i++){
            for (int j = 0 ; j < 4; j++){
                intArr[i][j] = count;
                count++;

            }
        }




        solution.spiralOrder(intArr);



    }


}
