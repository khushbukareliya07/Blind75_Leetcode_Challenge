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
class 2095_DeletetheiddleNodeofaLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        //tortoise- hare algorithm
        
        if(head == null || head.next == null) return null;
        
        ListNode prev, slow, fast;
        
        prev = head;
        slow = head;
        fast = head;
        
        while(fast != null && fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // here after while execution, prev at the Node right before the SLOW pointer, so just update prev. 
        
        prev.next =  prev.next.next;
        return head;
        
    }
}