// Last updated: 7/21/2026, 9:18:45 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14
15class Solution {
16    public ListNode removeNthFromEnd(ListNode head, int n) {
17
18        ListNode dummy = new ListNode(0);
19        dummy.next = head;
20
21        ListNode fast = dummy;
22        ListNode slow = dummy;
23        for (int i = 0; i <= n; i++) {
24            fast = fast.next;
25        }
26        while (fast != null) {
27            fast = fast.next;
28            slow = slow.next;
29        }
30        slow.next = slow.next.next;
31
32        return dummy.next;
33    }
34}