// Last updated: 7/17/2026, 2:59:55 PM
class Solution {
    public int reverse(int x) {
        int original=x;
        long digit=0;
        while(x!=0){
            int remain=x%10;
            digit=(digit*10)+remain;
            x=x/10;
        }
        if (digit < Integer.MIN_VALUE || digit > Integer.MAX_VALUE) {
            return 0;
        }
        return (int)digit;
    }
}