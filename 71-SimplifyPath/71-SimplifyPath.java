// Last updated: 7/23/2026, 9:15:26 AM
1class Solution {
2    public String minWindow(String s, String t) {
3        if (s.length() < t.length()) return "";
4        int[] need = new int[128];
5        for (char c : t.toCharArray()) {
6            need[c]++;
7        }
8        int left = 0, right = 0;
9        int count = t.length();
10        int minLen = Integer.MAX_VALUE;
11        int start = 0;
12        while (right < s.length()) {
13            if (need[s.charAt(right)] > 0) {
14                count--;
15            }
16            need[s.charAt(right)]--;
17            right++;
18            while (count == 0) {
19                if (right - left < minLen) {
20                    minLen = right - left;
21                    start = left;
22                }
23                need[s.charAt(left)]++;
24                if (need[s.charAt(left)] > 0) {
25                    count++;
26                }
27                left++;
28            }
29        }
30        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
31    }
32}