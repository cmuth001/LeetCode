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
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists.length==0){
            return null;
        }
        int l = lists.length-1;
        
        if(l>0){
            while(l>0){
            lists[0] = mergeTwoLists(lists[0], lists[l]);
            l--;
            }
        }
        
        return lists[0];
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0), current = head;
        while(l1 != null && l2 !=null){
            if(l1.val<l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 !=null) current.next = l1;
        if(l2 !=null) current.next = l2;
        return head.next;
    }
}


// Second method
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
    public ListNode mergeKLists(ListNode[] lists) {
       if(lists.length==0){
            return null;
        }
        int l = lists.length-1;
        while(l>0){
            int i =0, j = l;
            while(i<j){
                lists[i] = mergeTwoLists(lists[i], lists[j]);
                i++; 
                j--;
            }
            if(i>=j){
                l = j;
            }
            
        }
        
        return lists[0];
    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0), current = head;
        while(l1 != null && l2 !=null){
            if(l1.val<l2.val){
                current.next = l1;
                l1 = l1.next;
            }else{
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if(l1 !=null) current.next = l1;
        if(l2 !=null) current.next = l2;
        return head.next;
    }
}
