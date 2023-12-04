// https://leetcode.com/problems/summary-ranges/description/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result = solution.summaryRanges(new int[]{0,1,2,4,5,6,7,9,10,15,16});
        System.out.println(result);
    }
}

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if(nums.length == 0) return result;
        if(nums.length == 1) {
            result.add("" + nums[0]);
            return result;
        }

        int left = 0;
        int right = 0;

        while(right < nums.length) {
            while(right < nums.length-1 && nums[right+1] - nums[right] == 1) {
                right++;
            }
            StringBuilder s = new StringBuilder(nums[left] + "");
            if(left != right) {
                s.append("->").append(nums[right]);
            }
            result.add(s.toString());
            right++;
            left = right;
        }

        return result;
    }
}
