// Last updated: 7/17/2026, 2:59:46 PM
import java.util.*;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) {
            return "";
        }
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0,i);
        
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String input=s.nextLine();
        String[] strs = input.split(" ");
        Solution sol=new Solution();
        System.out.println(sol.longestCommonPrefix(strs));
    }
}