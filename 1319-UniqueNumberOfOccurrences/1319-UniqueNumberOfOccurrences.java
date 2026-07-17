// Last updated: 7/17/2026, 2:57:00 PM
import java.util.*;
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set=new HashSet();
        for(int fre:map.values()){
            if(set.contains(fre)){
                return false;
            }
            set.add(fre);
        }
        return true;
    }
}