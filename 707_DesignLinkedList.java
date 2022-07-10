
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
    
    Node head;
    int size;
    
    public 707_DesignLinkedList() {
     head =  null;
     size =0;
    }
    
    public int get(int index) {
        Node node = FindNodeAtGivenIndex(index);
        return node == null? -1 : node.val;
    }
   
    public void addAtHead(int val) {
        addAtIndex(0, val);
        
    }
  
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        
        if(index > size)
            return ;
        
        Node node = new Node(val);
        Node curr = FindNodeAtGivenIndex(index-1);
        
        if(index == 0)
        {
         node.next = head;
         head = node;
        }
        
        else if(curr == null)
        {
            head = node;
        }
        else
        {
            node.next = curr.next;
            curr.next = node;
        }
        size++;
        
    }

    
    public void deleteAtIndex(int index) {
        if(size == 0 || index > size-1 || index <0)
            return;
        
        if(index ==0)
            head = head.next;
        
        else
        {
            Node curr = FindNodeAtGivenIndex(index-1);
            if(curr.next !=null)
            {
                curr.next = curr.next.next;
            }
            
        }
        size--;
        
       
    }
    
    public Node FindNodeAtGivenIndex(int index)
    {
        if(index<=0)
            return head;
        
        if(size ==0 || index > size -1)
            return null;
        
        Node curr = head.next;
        
        int count = 1;
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