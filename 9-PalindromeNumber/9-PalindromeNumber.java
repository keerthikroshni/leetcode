// Last updated: 7/17/2026, 2:59:52 PM
class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int digit=0;
        if(x<0)
        return false;
        while(x!=0){
            int remain=x%10;
            digit=(digit*10)+remain;
            x=x/10;
        }
        if(digit==original)
        return true;
        return false;
    }
}