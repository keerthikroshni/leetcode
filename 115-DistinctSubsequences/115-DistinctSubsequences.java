// Last updated: 7/31/2026, 9:09:41 AM
1class Solution {
2    public int minCut(String s) {
3        int n = s.length();
4        boolean[][] palindrome = new boolean[n][n];
5        int[] dp = new int[n];
6        for (int i = 0; i < n; i++) {
7            dp[i] = i;
8        }
9        for (int end = 0; end < n; end++) {
10            for (int start = 0; start <= end; start++) {
11                if (s.charAt(start) == s.charAt(end) &&
12                    (end - start <= 2 || palindrome[start + 1][end - 1])) {
13                    palindrome[start][end] = true;
14                    if (start == 0) {
15                        dp[end] = 0;
16                    } else {
17                        dp[end] = Math.min(dp[end], dp[start - 1] + 1);
18                    }
19                }
20            }
21        }
22        return dp[n - 1];
23    }
24}