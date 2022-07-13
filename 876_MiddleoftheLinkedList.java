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
class 876_MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        //brute - Force
        //calculate the size of the likedList
        //and then divide by2 will get the node 
        //complexity - O(n)
        
        if(head == null || head.next == null) return head;
        
        int count = 1;
        ListNode tempNode = head;
        while(head.next != null)
        {
            head = head.next;
            count++;
        }
        
        int temp = count/2;
        while(temp >0)
        {
            tempNode = tempNode.next;
            temp--;
        }
        return tempNode;
    }
}