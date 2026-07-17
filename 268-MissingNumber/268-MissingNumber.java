// Last updated: 7/17/2026, 2:58:08 PM
class Solution {
    public int missingNumber(int[] nums) {

        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
            xor ^= i;
            xor ^= nums[i];
        }

        return xor;
    }
}