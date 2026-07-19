// Last updated: 7/19/2026, 8:04:36 AM
1class Solution {
2    public boolean canReach(int[] start, int[] target) {
3        int startsum=start[0]+start[1];
4        int targetsum=target[0]+target[1];
5        return (startsum-targetsum)%2==0;
6    }
7}