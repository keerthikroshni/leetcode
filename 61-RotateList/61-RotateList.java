// Last updated: 7/31/2026, 9:02:33 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if (head == null || left == right)
14            return head;
15
16        ListNode dummy = new ListNode(0);
17        dummy.next = head;
18
19        ListNode prev = dummy;
20
21        for (int i = 1; i < left; i++) {
22            prev = prev.next;
23        }
24
25        ListNode curr = prev.next;
26
27        for (int i = 0; i < right - left; i++) {
28            ListNode next = curr.next;
29            curr.next = next.next;
30            next.next = prev.next;
31            prev.next = next;
32        }
33
34        return dummy.next;
35    }
36}