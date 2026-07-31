// Last updated: 7/31/2026, 9:03:49 AM
1class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int m = s1.length();
4        int n = s2.length();
5        if (m + n != s3.length())
6            return false;
7        boolean[][] dp = new boolean[m + 1][n + 1];
8        dp[0][0] = true;
9        for (int i = 1; i <= m; i++) {
10            dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
11        }
12        for (int j = 1; j <= n; j++) {
13            dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
14        }
15        for (int i = 1; i <= m; i++) {
16            for (int j = 1; j <= n; j++) {
17                dp[i][j] = (dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(i + j - 1))
18                        || (dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
19            }
20        }
21        return dp[m][n];
22    }
23}