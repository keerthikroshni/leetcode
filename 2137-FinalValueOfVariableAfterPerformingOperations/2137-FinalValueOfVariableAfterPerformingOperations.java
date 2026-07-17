// Last updated: 7/17/2026, 2:56:52 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String op: operations){
            if(op.equals("++X") || op.equals("X++")){
            x++;
            }
            else{
                x--;
            }

        }
         return x;
    }
}