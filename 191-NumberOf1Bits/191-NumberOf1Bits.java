// Last updated: 7/17/2026, 2:58:22 PM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=n&n-1;
            count++;
        }
        return count;
    }
}