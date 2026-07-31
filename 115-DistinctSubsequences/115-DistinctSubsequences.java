// Last updated: 7/31/2026, 9:08:42 AM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        Set<String> dict = new HashSet<>(wordList);
4
5        if (!dict.contains(endWord))
6            return 0;
7
8        Queue<String> queue = new LinkedList<>();
9        queue.offer(beginWord);
10
11        Set<String> visited = new HashSet<>();
12        visited.add(beginWord);
13
14        int level = 1;
15
16        while (!queue.isEmpty()) {
17            int size = queue.size();
18
19            for (int i = 0; i < size; i++) {
20                String word = queue.poll();
21
22                if (word.equals(endWord))
23                    return level;
24
25                char[] arr = word.toCharArray();
26
27                for (int j = 0; j < arr.length; j++) {
28                    char old = arr[j];
29
30                    for (char c = 'a'; c <= 'z'; c++) {
31                        arr[j] = c;
32                        String next = new String(arr);
33
34                        if (dict.contains(next) && !visited.contains(next)) {
35                            visited.add(next);
36                            queue.offer(next);
37                        }
38                    }
39
40                    arr[j] = old;
41                }
42            }
43
44            level++;
45        }
46
47        return 0;
48    }
49}