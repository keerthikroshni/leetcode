// Last updated: 7/31/2026, 8:57:20 AM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        backtrack(0, nums, new ArrayList<>(), ans);
5        return ans;
6    }
7    private void backtrack(int index, int[] nums, List<Integer> temp, List<List<Integer>> ans) {
8        ans.add(new ArrayList<>(temp));
9        for (int i = index; i < nums.length; i++) {
10            temp.add(nums[i]);
11            backtrack(i + 1, nums, temp, ans);
12            temp.remove(temp.size() - 1);
13        }
14    }
15}