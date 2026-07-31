// Last updated: 7/31/2026, 8:50:04 AM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5
6        int[][] dp = new int[m][n];
7
8        if (obstacleGrid[0][0] == 1)
9            return 0;
10
11        dp[0][0] = 1;
12
13        for (int i = 1; i < m; i++) {
14            if (obstacleGrid[i][0] == 0)
15                dp[i][0] = dp[i - 1][0];
16        }
17
18        for (int j = 1; j < n; j++) {
19            if (obstacleGrid[0][j] == 0)
20                dp[0][j] = dp[0][j - 1];
21        }
22
23        for (int i = 1; i < m; i++) {
24            for (int j = 1; j < n; j++) {
25                if (obstacleGrid[i][j] == 0)
26                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
27            }
28        }
29
30        return dp[m - 1][n - 1];
31    }
32}