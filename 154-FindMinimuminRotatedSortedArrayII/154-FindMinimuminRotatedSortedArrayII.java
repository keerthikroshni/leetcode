// Last updated: 8/11/2026, 9:24:53 AM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int left = 0;
4        int right = numbers.length - 1;
5
6        while (left < right) {
7            int sum = numbers[left] + numbers[right];
8
9            if (sum == target) {
10                return new int[]{left + 1, right + 1};
11            } else if (sum < target) {
12                left++;
13            } else {
14                right--;
15            }
16        }
17
18        return new int[]{-1, -1};
19    }
20}