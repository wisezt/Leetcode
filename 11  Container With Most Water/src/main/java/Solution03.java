public class Solution03 {
    int[] heightArr;


    public int maxArea(int[] height) {
        heightArr = height;
        int maxArea;
        int heightLength = height.length;
        int leftPoint = 0;
        int rightPoint = heightLength - 1;
        int currentArea;
        int preMaxLeftIndex =leftPoint;
        int preMaxRightIndex = rightPoint;
        int count = 0;



//        Initial
        maxArea = 0;




        while(leftPoint < rightPoint){

//          optimize
            if (heightArr[leftPoint] < heightArr[preMaxLeftIndex]){
                leftPoint++;
                continue;
            } else if (heightArr[rightPoint] < heightArr[preMaxRightIndex]) {
                rightPoint--;
                continue;
            }

            count++;
            if(leftIsHigher(leftPoint, rightPoint)){
                currentArea = area(rightPoint, leftPoint);
                preMaxLeftIndex=leftPoint;
                System.out.printf("***leftPoint[%s]: %s\trightPoint[%s]: %s\t",leftPoint,heightArr[leftPoint],rightPoint,heightArr[rightPoint]);

                rightPoint--;
            }else {
                currentArea = area(leftPoint, rightPoint);
                preMaxRightIndex=rightPoint;
                System.out.printf("---leftPoint[%s]: %s\trightPoint[%s]: %s\t",leftPoint,heightArr[leftPoint],rightPoint,heightArr[rightPoint]);

                leftPoint++;
            }
//            currentArea = area(leftPoint, rightPoint);
//            if (currentArea >= maxArea){
//                maxArea = currentArea;
//
//            }

            maxArea = (currentArea > maxArea)? currentArea : maxArea;
            System.out.printf("currentArea: %s\tmaxArea: %s\t\n",currentArea, maxArea);
//            System.out.printf("leftPoint[%s]: %s\trightPoint[%s]: %s\tcurrentArea: %s\tmaxArea: %s\t\n",leftPoint,heightArr[leftPoint],rightPoint,heightArr[rightPoint],currentArea, maxArea);
//
//            if(leftIsHigher(leftPoint, rightPoint)){
//                rightPoint++;
//            }else {
//                leftPoint++;
//            }

        }

        System.out.printf("count: %s\n", count);
        return maxArea;
    }

    private boolean leftIsHigher(int leftPoint, int rightPoint) {

        return heightArr[leftPoint] > heightArr[rightPoint];
    }

    private int area(int lowerIndex, int higherIndex) {


        return  heightArr[lowerIndex] * Math.abs(lowerIndex - higherIndex);
    }


}
