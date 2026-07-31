// Last updated: 7/31/2026, 8:56:35 AM
1class Solution {
2    public List<List<Integer>> combine(int n, int k) {
3        List<List<Integer>> ans = new ArrayList<>();
4        backtrack(1, n, k, new ArrayList<>(), ans);
5        return ans;
6    }
7    private void backtrack(int start, int n, int k, List<Integer> temp, List<List<Integer>> ans) {
8        if (temp.size() == k) {
9            ans.add(new ArrayList<>(temp));
10            return;
11        }
12        for (int i = start; i <= n; i++) {
13            temp.add(i);
14            backtrack(i + 1, n, k, temp, ans);
15            temp.remove(temp.size() - 1);
16        }
17    }
18}