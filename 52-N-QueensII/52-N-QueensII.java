// Last updated: 7/23/2026, 9:07:24 AM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int farthest = 0;
4
5        for (int i = 0; i < nums.length; i++) {
6            if (i > farthest) {
7                return false;
8            }
9
10            farthest = Math.max(farthest, i + nums[i]);
11
12            if (farthest >= nums.length - 1) {
13                return true;
14            }
15        }
16
17        return true;
18    }
19}