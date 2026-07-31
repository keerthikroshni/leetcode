// Last updated: 7/31/2026, 9:01:53 AM
1class Solution {
2    public int numDecodings(String s) {
3        int n = s.length();
4
5        if (n == 0 || s.charAt(0) == '0')
6            return 0;
7
8        int[] dp = new int[n + 1];
9        dp[0] = 1;
10        dp[1] = 1;
11
12        for (int i = 2; i <= n; i++) {
13            int oneDigit = s.charAt(i - 1) - '0';
14            int twoDigits = Integer.parseInt(s.substring(i - 2, i));
15
16            if (oneDigit >= 1)
17                dp[i] += dp[i - 1];
18
19            if (twoDigits >= 10 && twoDigits <= 26)
20                dp[i] += dp[i - 2];
21        }
22
23        return dp[n];
24    }
25}