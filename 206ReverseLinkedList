/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class 206ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode revHead = null;
        while(head != null){
            ListNode new_node = new ListNode(head.val);
            new_node.next = revHead;
            revHead = new_node; 
            head = head.next;
        }
        return revHead;
    }
}
