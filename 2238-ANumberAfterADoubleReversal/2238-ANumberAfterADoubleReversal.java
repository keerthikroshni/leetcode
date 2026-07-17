// Last updated: 7/17/2026, 2:56:51 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int original=num;
        int digit=0;
        int digit1=0;
        while(num!=0){
            int rem1=num%10;
            digit=(digit*10)+rem1;
            num=num/10;
        }
        while(digit!=0){
            int rem1=digit%10;
            digit1=(digit1*10)+rem1;
            digit=digit/10;
        }
        if(original==digit1){
            return true;
        }
        else{
            return false;
        }
        
    }
}