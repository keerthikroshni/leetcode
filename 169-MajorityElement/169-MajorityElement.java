// Last updated: 7/17/2026, 2:58:38 PM
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}