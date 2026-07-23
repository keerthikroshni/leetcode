// Last updated: 7/23/2026, 9:10:53 AM
1class Solution {
2    public int[][] generateMatrix(int n) {
3        int[][] matrix = new int[n][n];
4
5        int top = 0, bottom = n - 1;
6        int left = 0, right = n - 1;
7        int num = 1;
8
9        while (top <= bottom && left <= right) {
10
11            for (int i = left; i <= right; i++) {
12                matrix[top][i] = num++;
13            }
14            top++;
15            for (int i = top; i <= bottom; i++) {
16                matrix[i][right] = num++;
17            }
18            right--;
19            if (top <= bottom) {
20                for (int i = right; i >= left; i--) {
21                    matrix[bottom][i] = num++;
22                }
23                bottom--;
24            }
25            if (left <= right) {
26                for (int i = bottom; i >= top; i--) {
27                    matrix[i][left] = num++;
28                }
29                left++;
30            }
31        }
32
33        return matrix;
34    }
35}