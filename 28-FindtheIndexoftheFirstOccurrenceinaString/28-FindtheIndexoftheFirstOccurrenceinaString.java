// Last updated: 7/21/2026, 9:51:33 AM
1class Solution {
2    List<List<Integer>> result = new ArrayList<>();
3
4    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
5        Arrays.sort(candidates);
6        backtrack(candidates, target, 0, new ArrayList<>());
7        return result;
8    }
9
10    private void backtrack(int[] candidates, int target, int index, List<Integer> current) {
11        if (target == 0) {
12            result.add(new ArrayList<>(current));
13            return;
14        }
15
16        if (target < 0) {
17            return;
18        }
19
20        for (int i = index; i < candidates.length; i++) {
21            if (i > index && candidates[i] == candidates[i - 1]) {
22                continue;
23            }
24
25            if (candidates[i] > target) {
26                break;
27            }
28
29            current.add(candidates[i]);
30            backtrack(candidates, target - candidates[i], i + 1, current);
31            current.remove(current.size() - 1);
32        }
33    }
34}