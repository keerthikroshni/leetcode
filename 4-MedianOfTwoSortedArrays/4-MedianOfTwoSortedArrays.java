// Last updated: 7/17/2026, 3:00:00 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged=new int[nums1.length+nums2.length];
        for (int i=0;i<nums1.length;i++){
            merged[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            merged[nums1.length+j]=nums2[j];
        }
        Arrays.sort(merged);
        int n = merged.length;
        if (n % 2 == 1) { 
            return merged[(n /2) ];
        } else { 
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
    
    }
}