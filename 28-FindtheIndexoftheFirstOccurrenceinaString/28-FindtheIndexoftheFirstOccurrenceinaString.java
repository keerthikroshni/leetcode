// Last updated: 7/21/2026, 10:00:14 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap<>();
4
5        for (String s : strs) {
6            char[] arr = s.toCharArray();
7            Arrays.sort(arr);
8            String key = new String(arr);
9
10            map.putIfAbsent(key, new ArrayList<>());
11            map.get(key).add(s);
12        }
13
14        return new ArrayList<>(map.values());
15    }
16}