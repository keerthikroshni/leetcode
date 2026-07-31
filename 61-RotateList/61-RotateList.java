// Last updated: 7/31/2026, 8:52:50 AM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        boolean firstRow = false;
7        boolean firstCol = false;
8
9        for (int i = 0; i < m; i++) {
10            if (matrix[i][0] == 0) {
11                firstCol = true;
12                break;
13            }
14        }
15
16        for (int j = 0; j < n; j++) {
17            if (matrix[0][j] == 0) {
18                firstRow = true;
19                break;
20            }
21        }
22
23        for (int i = 1; i < m; i++) {
24            for (int j = 1; j < n; j++) {
25                if (matrix[i][j] == 0) {
26                    matrix[i][0] = 0;
27                    matrix[0][j] = 0;
28                }
29            }
30        }
31
32        for (int i = 1; i < m; i++) {
33            if (matrix[i][0] == 0) {
34                for (int j = 1; j < n; j++) {
35                    matrix[i][j] = 0;
36                }
37            }
38        }
39
40        for (int j = 1; j < n; j++) {
41            if (matrix[0][j] == 0) {
42                for (int i = 1; i < m; i++) {
43                    matrix[i][j] = 0;
44                }
45            }
46        }
47
48        if (firstRow) {
49            for (int j = 0; j < n; j++) {
50                matrix[0][j] = 0;
51            }
52        }
53
54        if (firstCol) {
55            for (int i = 0; i < m; i++) {
56                matrix[i][0] = 0;
57            }
58        }
59    }
60}