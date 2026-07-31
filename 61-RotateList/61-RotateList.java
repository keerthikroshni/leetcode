// Last updated: 7/31/2026, 8:49:20 AM
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
12    public ListNode rotateRight(ListNode head, int k) {
13        if (head == null || head.next == null || k == 0)
14            return head;
15
16        ListNode tail = head;
17        int length = 1;
18
19        while (tail.next != null) {
20            tail = tail.next;
21            length++;
22        }
23
24        k = k % length;
25
26        if (k == 0)
27            return head;
28
29        tail.next = head;
30
31        int steps = length - k;
32        ListNode newTail = head;
33
34        for (int i = 1; i < steps; i++) {
35            newTail = newTail.next;
36        }
37
38        ListNode newHead = newTail.next;
39        newTail.next = null;
40
41        return newHead;
42    }
43}