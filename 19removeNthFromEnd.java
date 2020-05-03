/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head, current =  new ListNode(0); 
        current.next = head;
        int count = 0;
        if(temp == null){
            return null;
        }
        while(temp != null){
            temp =temp.next;
            count++;
        }
        System.out.println(count);
        count = count-n;
        temp = current;
        while(count>0){
            temp = temp.next;
            count--;
        }
        temp.next = temp.next.next;
        return current.next;  
    }
}
