// 2264. Largest 3-Same-Digit Number in String

class Solution {
    public String largestGoodInteger(String num) {
        int left = 0, middle = 1, right = 2;
        char good = '0'-1;

        while(right < num.length()) {
            char cLeft = num.charAt(left);
            char cMiddle = num.charAt(middle);
            char cRight = num.charAt(right);

            if(cLeft == cMiddle && cRight == cMiddle && cLeft == cRight) {
                good = (char) Math.max(good, cLeft);
            }

            left++;
            middle++;
            right++;
        }

        if(good == '0'-1) {
            return "";
        }

        StringBuilder s = new StringBuilder();
        return s.append(good).append(good).append(good).toString();
    }
}
