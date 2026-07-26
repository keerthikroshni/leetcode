// Last updated: 7/26/2026, 8:45:34 AM
1class Solution {
2    public List<List<Integer>> aggregateTimeSeries(int[][] series1, int[][] series2) {
3        TreeSet<Integer> set=new TreeSet<>();
4        for(int[] x:series1){
5            set.add(x[0]);
6        }
7        for(int[] x:series2){
8            set.add(x[0]);
9        }
10        int[] times=new int[set.size()];
11        int idx=0;
12        for(int t:set){
13            times[idx++]=t;
14        }
15        List<List<Integer>> ans=new ArrayList<>();
16        int i=0,j=0;
17        for(int k=0;k<times.length;k++){
18            int t=times[k];
19            while(i<series1.length && series1[i][0]<t){
20                i++;
21            }
22            while(j<series2.length &&series2[j][0]<t){
23                j++;
24            }
25            int v1=(i<series1.length)?series1[i][1]:0;
26            int v2=(j<series2.length)?series2[j][1]:0;
27            ans.add(Arrays.asList(t,v1+v2));
28        }
29        return ans;
30    }
31}