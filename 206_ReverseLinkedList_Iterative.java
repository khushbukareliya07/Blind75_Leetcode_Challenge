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
class 206_ReverseLinkedList_Iterative {
    public ListNode reverseList(ListNode head) {
        
        //iterative Solution
        
        if(head == null || head.next == null) return head;
        
        ListNode curr =head;
        ListNode prev =null;
        ListNode nextP = curr;
        
        while(curr.next != null)
        {
            //move next pointer to right
            //set current's pointer to previous
            //update previous
            //update current
            
            nextP = curr.next;
            curr.next = prev;
            prev = curr;
            curr =nextP;
        }
        curr.next = prev;
        return curr;
    }
}