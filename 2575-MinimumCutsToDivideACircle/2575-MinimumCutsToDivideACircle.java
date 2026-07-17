// Last updated: 7/17/2026, 2:56:50 PM
class Solution {
    public int numberOfCuts(int n) {
        if(n%2==0){
            int num2=n/2;
            return num2;
        }
        else if(n==1){
            return 0;
        }
        else{
            return n;
        }
    }
}