// Last updated: 7/31/2026, 8:59:08 AM
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode dummy = new ListNode(0);
14        dummy.next = head;
15
16        ListNode prev = dummy;
17
18        while (head != null) {
19            if (head.next != null && head.val == head.next.val) {
20                while (head.next != null && head.val == head.next.val) {
21                    head = head.next;
22                }
23                prev.next = head.next;
24            } else {
25                prev = prev.next;
26            }
27            head = head.next;
28        }
29
30        return dummy.next;
31    }
32}