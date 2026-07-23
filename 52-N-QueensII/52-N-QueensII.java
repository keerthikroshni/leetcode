// Last updated: 7/23/2026, 9:05:37 AM
1class Solution {
2    int count = 0;
3
4    public int totalNQueens(int n) {
5        boolean[] cols = new boolean[n];
6        boolean[] diag1 = new boolean[2 * n];
7        boolean[] diag2 = new boolean[2 * n];
8
9        solve(0, n, cols, diag1, diag2);
10        return count;
11    }
12
13    private void solve(int row, int n, boolean[] cols, boolean[] diag1, boolean[] diag2) {
14        if (row == n) {
15            count++;
16            return;
17        }
18
19        for (int col = 0; col < n; col++) {
20            int d1 = row - col + n;
21            int d2 = row + col;
22
23            if (cols[col] || diag1[d1] || diag2[d2])
24                continue;
25
26            cols[col] = true;
27            diag1[d1] = true;
28            diag2[d2] = true;
29
30            solve(row + 1, n, cols, diag1, diag2);
31
32            cols[col] = false;
33            diag1[d1] = false;
34            diag2[d2] = false;
35        }
36    }
37}