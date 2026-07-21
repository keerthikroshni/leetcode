// Last updated: 7/21/2026, 9:39:29 AM
1class Solution {
2    List<String> result = new ArrayList<>();
3
4    public List<String> letterCombinations(String digits) {
5        if (digits.length() == 0) {
6            return result;
7        }
8
9        String[] map = {
10            "", "", "abc", "def", "ghi", "jkl",
11            "mno", "pqrs", "tuv", "wxyz"
12        };
13
14        backtrack(digits, 0, new StringBuilder(), map);
15        return result;
16    }
17
18    private void backtrack(String digits, int index, StringBuilder current, String[] map) {
19        if (index == digits.length()) {
20            result.add(current.toString());
21            return;
22        }
23
24        String letters = map[digits.charAt(index) - '0'];
25
26        for (char c : letters.toCharArray()) {
27            current.append(c);
28            backtrack(digits, index + 1, current, map);
29            current.deleteCharAt(current.length() - 1);
30        }
31    }
32}