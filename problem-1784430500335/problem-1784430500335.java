// Last updated: 7/19/2026, 8:38:20 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    private int dominantcount=0;
18    public int countDominantNodes(TreeNode root) {
19        dominantcount=0;
20        findsubtreemax(root);
21        return dominantcount;
22        
23    }
24    private int findsubtreemax(TreeNode node){
25        if(node==null){
26            return Integer.MIN_VALUE;
27        }
28        int leftmax=findsubtreemax(node.left);
29        int rightmax=findsubtreemax(node.right);
30        int currentmax=Math.max(node.val,Math.max(leftmax,rightmax));
31        if(node.val==currentmax){
32            dominantcount++;
33        }
34        return currentmax;
35    }
36}