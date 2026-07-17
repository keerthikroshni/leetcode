// Last updated: 7/17/2026, 2:56:46 PM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum=0;
        int sq=0;
        while(n>0){
            int digit=n%10;
            digitsum+=digit;
            sq+=digit*digit;
            n=n/10;
        }
        return(sq-digitsum)>=50;
    }
}