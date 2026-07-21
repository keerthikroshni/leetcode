// Last updated: 7/21/2026, 9:50:41 AM
1class Solution {
2    List<List<Integer>> result = new ArrayList<>();
3
4    public List<List<Integer>> combinationSum(int[] candidates, int target) {
5        backtrack(candidates, target, 0, new ArrayList<>());
6        return result;
7    }
8
9    private void backtrack(int[] candidates, int target, int index, List<Integer> current) {
10        if (target == 0) {
11            result.add(new ArrayList<>(current));
12            return;
13        }
14
15        if (target < 0) {
16            return;
17        }
18
19        for (int i = index; i < candidates.length; i++) {
20            current.add(candidates[i]);
21            backtrack(candidates, target - candidates[i], i, current);
22            current.remove(current.size() - 1);
23        }
24    }
25}