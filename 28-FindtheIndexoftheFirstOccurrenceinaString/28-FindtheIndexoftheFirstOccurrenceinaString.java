// Last updated: 7/21/2026, 9:57:41 AM
1class Solution {
2    List<List<Integer>> result = new ArrayList<>();
3
4    public List<List<Integer>> permute(int[] nums) {
5        backtrack(nums, new ArrayList<>(), new boolean[nums.length]);
6        return result;
7    }
8
9    private void backtrack(int[] nums, List<Integer> current, boolean[] used) {
10        if (current.size() == nums.length) {
11            result.add(new ArrayList<>(current));
12            return;
13        }
14
15        for (int i = 0; i < nums.length; i++) {
16            if (used[i]) {
17                continue;
18            }
19
20            used[i] = true;
21            current.add(nums[i]);
22            backtrack(nums, current, used);
23            current.remove(current.size() - 1);
24            used[i] = false;
25        }
26    }
27}