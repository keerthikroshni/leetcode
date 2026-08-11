// Last updated: 8/11/2026, 9:26:27 AM
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
17    public int countNodes(TreeNode root) {
18        if (root == null) {
19            return 0;
20        }
21
22        int leftHeight = getLeftHeight(root.left);
23        int rightHeight = getLeftHeight(root.right);
24
25        if (leftHeight == rightHeight) {
26            return (1 << leftHeight) + countNodes(root.right);
27        } else {
28            return (1 << rightHeight) + countNodes(root.left);
29        }
30    }
31
32    private int getLeftHeight(TreeNode node) {
33        int height = 0;
34        while (node != null) {
35            height++;
36            node = node.left;
37        }
38        return height;
39    }
40}