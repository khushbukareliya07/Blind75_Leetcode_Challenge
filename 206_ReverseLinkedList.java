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
class 206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        
        if(head == null) return null;
        
        Stack<ListNode> stack =  new Stack();
        
        while(head != null)
        {
            stack.push(head);
            head = head.next;
        }
        
        head = stack.pop();
        ListNode tail = head;
        
        while(!stack.isEmpty())
        {
            tail.next = stack.pop();
            tail = tail.next;
        }
        tail.next = null;
        return head;
        
    }
}