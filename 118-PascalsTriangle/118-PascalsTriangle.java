// Last updated: 7/17/2026, 2:58:46 PM
import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal= new ArrayList();
        for(int i=0;i<numRows;i++){
            List<Integer> Row=new ArrayList();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    Row.add(1);
                }
                else{
                    List<Integer> previous=pascal.get(i-1);
                    Row.add(previous.get(j)+previous.get(j-1));
                }
                
            }
            pascal.add(Row);
        }
        return pascal;
    }
}