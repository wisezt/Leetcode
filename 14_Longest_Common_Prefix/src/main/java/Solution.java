class Solution {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb = new StringBuilder();
        loop:
        for (int i = 0; i < strs[0].length(); i++) {

            char prefixChar = strs[0].charAt(i);

            for (String tmpStr : strs) {

                if (i > tmpStr.length()-1) {
                    break loop;
                }

                if (tmpStr.charAt(i) != prefixChar) {
                    break loop;
                }
            }

            sb.append(prefixChar);

        }

        return sb.toString();


    }
}