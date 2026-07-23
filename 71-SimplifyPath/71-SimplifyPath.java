// Last updated: 7/23/2026, 9:17:41 AM
1class Solution {
2    public boolean exist(char[][] board, String word) {
3        int m = board.length;
4        int n = board[0].length;
5        for (int i = 0; i < m; i++) {
6            for (int j = 0; j < n; j++) {
7                if (dfs(board, word, i, j, 0)) {
8                    return true;
9                }
10            }
11        }
12        return false;
13    }
14    private boolean dfs(char[][] board, String word, int i, int j, int index) {
15        if (index == word.length()) {
16            return true;
17        }
18        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length ||
19            board[i][j] != word.charAt(index)) {
20            return false;
21        }
22        char temp = board[i][j];
23        board[i][j] = '#';
24        boolean found = dfs(board, word, i + 1, j, index + 1) ||
25                        dfs(board, word, i - 1, j, index + 1) ||
26                        dfs(board, word, i, j + 1, index + 1) ||
27                        dfs(board, word, i, j - 1, index + 1);
28
29        board[i][j] = temp;
30        return found;
31    }
32}