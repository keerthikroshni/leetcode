// Last updated: 7/21/2026, 9:32:18 AM
1class Solution {
2    List<String> result = new ArrayList<>();
3
4    public List<String> generateParenthesis(int n) {
5        backtrack("", 0, 0, n);
6        return result;
7    }
8
9    private void backtrack(String current, int open, int close, int n) {
10        if (current.length() == 2 * n) {
11            result.add(current);
12            return;
13        }
14
15        if (open < n) {
16            backtrack(current + "(", open + 1, close, n);
17        }
18
19        if (close < open) {
20            backtrack(current + ")", open, close + 1, n);
21        }
22    }
23}