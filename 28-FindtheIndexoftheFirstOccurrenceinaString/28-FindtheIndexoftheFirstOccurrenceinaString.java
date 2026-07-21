// Last updated: 7/21/2026, 9:55:27 AM
1class Solution {
2    public boolean isMatch(String s, String p) {
3        int i = 0, j = 0;
4        int star = -1, match = 0;
5
6        while (i < s.length()) {
7            if (j < p.length() && (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i))) {
8                i++;
9                j++;
10            } else if (j < p.length() && p.charAt(j) == '*') {
11                star = j;
12                match = i;
13                j++;
14            } else if (star != -1) {
15                j = star + 1;
16                match++;
17                i = match;
18            } else {
19                return false;
20            }
21        }
22
23        while (j < p.length() && p.charAt(j) == '*') {
24            j++;
25        }
26
27        return j == p.length();
28    }
29}