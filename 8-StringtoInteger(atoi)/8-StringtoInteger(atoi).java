// Last updated: 7/21/2026, 9:33:10 AM
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
12    public ListNode mergeKLists(ListNode[] lists) {
13        if (lists == null || lists.length == 0) {
14            return null;
15        }
16
17        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
18
19        for (ListNode node : lists) {
20            if (node != null) {
21                pq.offer(node);
22            }
23        }
24
25        ListNode dummy = new ListNode(0);
26        ListNode tail = dummy;
27
28        while (!pq.isEmpty()) {
29            ListNode node = pq.poll();
30            tail.next = node;
31            tail = tail.next;
32
33            if (node.next != null) {
34                pq.offer(node.next);
35            }
36        }
37
38        return dummy.next;
39    }
40}