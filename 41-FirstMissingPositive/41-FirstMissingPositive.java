// Last updated: 7/17/2026, 2:59:30 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
       int n=nums.length;
       for(int i=0;i<n;i++){
        while(nums[i]>=1 && nums[i]<=n && nums[nums[i]-1]!=nums[i]){
            int c=nums[i]-1;
            int te=nums[i];
            nums[i]=nums[c];
            nums[c]=te;
        }
       }
       for(int i=0;i<n;i++){
        if(nums[i]!=i+1){
            return i+1;
        }
       }
       return n+1;
    }
}