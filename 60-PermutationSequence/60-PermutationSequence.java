// Last updated: 7/31/2026, 8:46:27 AM
1import java.util.*;
2class Solution {
3    public String getPermutation(int n, int k) {
4        List<Integer> numbers = new ArrayList<>();
5        int[] fact = new int[n + 1];
6        fact[0] = 1;
7        for (int i = 1; i <= n; i++) {
8            fact[i] = fact[i - 1] * i;
9            numbers.add(i);
10        }
11        k--; 
12        StringBuilder ans = new StringBuilder();
13        for (int i = n; i >= 1; i--) {
14            int index = k / fact[i - 1];
15            ans.append(numbers.get(index));
16            numbers.remove(index);
17            k %= fact[i - 1];
18        }
19        return ans.toString();
20    }
21}