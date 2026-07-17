// Last updated: 7/17/2026, 2:56:56 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int[] arr=new int[nums.length];
        int add=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=add+nums[i];
            add=arr[i];
        }
        return arr;
    }
}