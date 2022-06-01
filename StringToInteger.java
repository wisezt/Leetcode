import javax.lang.model.util.ElementScanner6;

public class StringToInteger {
    public static void main(String[] args) {
        String str = "000-1";
        myAtoi(str);
    }

    public static int myAtoi(String s) {

        String trimedStr = s.trim();

        char[] charArr = trimedStr.toCharArray();

        boolean isPositive = true;

        boolean hasSign = false;
        boolean hasNum = false;

        int result = 0;
        int newValue = 0;

        for (char tmpChar : charArr) {

            if (tmpChar == '-' || tmpChar == '+') {
                if (hasSign == false && hasNum == false) {
                    hasSign = true;
                } else {
                    break;
                }

                if (tmpChar == '-') {
                    isPositive = !isPositive;
                }

            } else if (hasNum = true) {
                newValue = (int) tmpChar - (int) '0';
                if (newValue > 9 || newValue < 0) {
                    break;
                }
            } else if ((int) tmpChar - (int) '0' <= 9 && (int) tmpChar - (int) '0' >= 0) {
                newValue = (int) tmpChar - (int) '0';
                hasNum = true;
            } else {
                break;
            }

            // System.out.printf("result: %s\tnewValue: %s\n", result, newValue);

            if (isPositive) {
                if (result <= (Math.pow(2, 31) - 1 - newValue) / 10) {
                    // System.out.printf("1.result: %s\tnewValue: %s\n", result, newValue);
                    result = result * 10 + newValue;
                } else {
                    result = (int) Math.pow(2, 31);
                    // System.out.printf("2.result: %s\tnewValue: %s\n", result, newValue);
                }
            } else {
                if (result >= -(Math.pow(2, 31) - newValue) / 10) {

                    result = -(Math.abs(result * 10) + newValue);
                    // System.out.printf("3.result: %s\tnewValue: %s\n", result, newValue);
                } else {
                    result = (int) -Math.pow(2, 31);
                    // System.out.printf("4. result: %s\tnewValue: %s\n", result, newValue);
                }
            }

        }
        // System.out.println(result);
        return result;
    }

}
