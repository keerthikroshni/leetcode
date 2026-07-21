// Last updated: 7/21/2026, 9:41:45 AM
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15        ListNode prevGroup = dummy;
16
17        while (true) {
18            ListNode kth = prevGroup;
19
20            for (int i = 0; i < k && kth != null; i++) {
21                kth = kth.next;
22            }
23
24            if (kth == null) {
25                break;
26            }
27
28            ListNode groupNext = kth.next;
29            ListNode prev = groupNext;
30            ListNode curr = prevGroup.next;
31
32            while (curr != groupNext) {
33                ListNode temp = curr.next;
34                curr.next = prev;
35                prev = curr;
36                curr = temp;
37            }
38
39            ListNode temp = prevGroup.next;
40            prevGroup.next = kth;
41            prevGroup = temp;
42        }
43
44        return dummy.next;
45    }
46}