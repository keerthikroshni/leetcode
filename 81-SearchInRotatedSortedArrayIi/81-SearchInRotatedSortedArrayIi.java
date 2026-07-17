// Last updated: 7/17/2026, 2:59:12 PM
class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target || nums[left]==target || nums[right]==target)
                return true;
            left++;
            right--;
        }
        return false;
    }
}