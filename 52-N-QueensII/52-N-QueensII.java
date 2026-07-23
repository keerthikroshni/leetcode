// Last updated: 7/23/2026, 9:09:18 AM
1import java.util.*;
2class Solution {
3    public int[][] insert(int[][] intervals, int[] newInterval) {
4        List<int[]> result = new ArrayList<>();
5        int i = 0;
6        int n = intervals.length;
7        while (i < n && intervals[i][1] < newInterval[0]) {
8            result.add(intervals[i]);
9            i++;
10        }
11        while (i < n && intervals[i][0] <= newInterval[1]) {
12            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
13            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
14            i++;
15        }
16        result.add(newInterval);
17        while (i < n) {
18            result.add(intervals[i]);
19            i++;
20        }
21
22        return result.toArray(new int[result.size()][]);
23    }
24}