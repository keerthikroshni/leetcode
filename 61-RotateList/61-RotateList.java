// Last updated: 7/31/2026, 8:58:17 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        if (nums.length <= 2)
4            return nums.length;
5        int index = 2;
6        for (int i = 2; i < nums.length; i++) {
7            if (nums[i] != nums[index - 2]) {
8                nums[index] = nums[i];
9                index++;
10            }
11        }
12        return index;
13    }
14}