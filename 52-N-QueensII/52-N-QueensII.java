// Last updated: 7/23/2026, 9:06:41 AM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> result = new ArrayList<>();
4
5        int top = 0;
6        int bottom = matrix.length - 1;
7        int left = 0;
8        int right = matrix[0].length - 1;
9
10        while (top <= bottom && left <= right) {
11            for (int i = left; i <= right; i++) {
12                result.add(matrix[top][i]);
13            }
14            top++;
15            for (int i = top; i <= bottom; i++) {
16                result.add(matrix[i][right]);
17            }
18            right--;
19            if (top <= bottom) {
20                for (int i = right; i >= left; i--) {
21                    result.add(matrix[bottom][i]);
22                }
23                bottom--;
24            }
25            if (left <= right) {
26                for (int i = bottom; i >= top; i--) {
27                    result.add(matrix[i][left]);
28                }
29                left++;
30            }
31        }
32
33        return result;
34    }
35}