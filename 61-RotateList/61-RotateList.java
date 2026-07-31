// Last updated: 7/31/2026, 9:01:10 AM
1class Solution {
2    public List<List<Integer>> subsetsWithDup(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        Arrays.sort(nums);
5        backtrack(0, nums, new ArrayList<>(), ans);
6        return ans;
7    }
8
9    private void backtrack(int index, int[] nums, List<Integer> temp, List<List<Integer>> ans) {
10        ans.add(new ArrayList<>(temp));
11
12        for (int i = index; i < nums.length; i++) {
13            if (i > index && nums[i] == nums[i - 1])
14                continue;
15
16            temp.add(nums[i]);
17            backtrack(i + 1, nums, temp, ans);
18            temp.remove(temp.size() - 1);
19        }
20    }
21}