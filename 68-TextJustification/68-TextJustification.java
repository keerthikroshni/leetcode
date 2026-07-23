// Last updated: 7/23/2026, 9:12:23 AM
1import java.util.*;
2
3class Solution {
4    public List<String> fullJustify(String[] words, int maxWidth) {
5        List<String> result = new ArrayList<>();
6        int i = 0;
7
8        while (i < words.length) {
9            int j = i;
10            int lineLength = 0;
11
12            while (j < words.length && lineLength + words[j].length() + (j - i) <= maxWidth) {
13                lineLength += words[j].length();
14                j++;
15            }
16
17            int gaps = j - i - 1;
18            StringBuilder sb = new StringBuilder();
19
20            if (j == words.length || gaps == 0) {
21                for (int k = i; k < j; k++) {
22                    sb.append(words[k]);
23                    if (k < j - 1)
24                        sb.append(" ");
25                }
26
27                while (sb.length() < maxWidth)
28                    sb.append(" ");
29            } else {
30                int totalSpaces = maxWidth - lineLength;
31                int spaceEach = totalSpaces / gaps;
32                int extra = totalSpaces % gaps;
33
34                for (int k = i; k < j; k++) {
35                    sb.append(words[k]);
36
37                    if (k < j - 1) {
38                        for (int s = 0; s < spaceEach; s++)
39                            sb.append(" ");
40
41                        if (extra > 0) {
42                            sb.append(" ");
43                            extra--;
44                        }
45                    }
46                }
47            }
48
49            result.add(sb.toString());
50            i = j;
51        }
52
53        return result;
54    }
55}