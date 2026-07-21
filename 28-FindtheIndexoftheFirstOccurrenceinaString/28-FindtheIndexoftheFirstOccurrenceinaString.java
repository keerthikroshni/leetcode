// Last updated: 7/21/2026, 9:48:40 AM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3        HashSet<String> set = new HashSet<>();
4
5        for (int i = 0; i < 9; i++) {
6            for (int j = 0; j < 9; j++) {
7                char num = board[i][j];
8
9                if (num == '.') {
10                    continue;
11                }
12
13                if (!set.add(num + "row" + i) ||
14                    !set.add(num + "col" + j) ||
15                    !set.add(num + "box" + (i / 3) + "-" + (j / 3))) {
16                    return false;
17                }
18            }
19        }
20
21        return true;
22    }
23}