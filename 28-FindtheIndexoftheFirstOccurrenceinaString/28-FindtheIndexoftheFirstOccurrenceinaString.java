// Last updated: 7/21/2026, 9:44:49 AM
1class Solution {
2    public void nextPermutation(int[] nums) {
3        int i = nums.length - 2;
4
5        while (i >= 0 && nums[i] >= nums[i + 1]) {
6            i--;
7        }
8
9        if (i >= 0) {
10            int j = nums.length - 1;
11
12            while (nums[j] <= nums[i]) {
13                j--;
14            }
15
16            swap(nums, i, j);
17        }
18
19        reverse(nums, i + 1, nums.length - 1);
20    }
21
22    private void swap(int[] nums, int i, int j) {
23        int temp = nums[i];
24        nums[i] = nums[j];
25        nums[j] = temp;
26    }
27
28    private void reverse(int[] nums, int left, int right) {
29        while (left < right) {
30            swap(nums, left++, right--);
31        }
32    }
33}