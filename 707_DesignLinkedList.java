class 707_DesignLinkedList {

    public class Node
    {
        int val;
        Node next;
    
        public Node(int val)
        {
            this.val = val; 
        }
    }
    
    Node head, tail;
    int size;
    
    public MyLinkedList() {
     head =  new Node(-1);
     tail = new Node(-1);
        size =0;
    }
    
    public int get(int index) {
        if(index > size -1 || index <0)
            return -1;
        
        //traverse through the list till index-1 position
        Node curr =  traverseThroughLL(head, index-1);
        return curr.next.val;
    }
    
    public void addAtHead(int val) {
        
        Node newNode = new Node(val);
        
        if(head.val == -1)
        {
            head.next = newNode;
            tail = head.next;
            
        }
        else
        {
            Node temp = head.next;
            head.next = newNode;
            newNode.next = temp.next;
        }
        size++;
    }
    
    public void addAtTail(int val) {
        
        Node newNode = new Node(val);
        
        if(tail.val == -1 && tail.next == null)
        {
            head.next = newNode;
            tail = head.next;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        
        if(index > size -1 || index <0)
            return;
        
        Node newNode = new Node(val);
        //traverse through the list till index-1 position
        Node prev =  traverseThroughLL(head, index-1);
        Node temp = prev;
        
        prev.next =  newNode;
        newNode.next = temp.next;
        size++;
    }
    
    public void deleteAtIndex(int index) {
    
        if(index > size -1 || index <0)
            return;
        
       
        //traverse through the list till index-1 position
        Node prev =  traverseThroughLL(head, index-1);  
         if(index== size -1)
         {
            tail = prev;
             size--;
         }
        else
        {
            prev.next = prev.next.next;
            size--;
        }
       
    }
    
    public Node traverseThroughLL(Node head, int index)
    {
        Node curr = head;
        
        int count =0;
        while(count < index)
        {
            curr = curr.next;
            count++;
        }
        return curr;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */