class DoublyLLNode
{
            int key;
            int val;
            DoublyLLNode prev;
            DoublyLLNode next;
}

public class 146_LRUCache{
             //Define and initialize DoublyLL, Lihashmap, capacity 
             Map<Integer, DoublyLLNode> LRUmap = new HashMap<>();
             int capacity;
             DoublyLLNode head, tail;

            146_LRUCache(int capacity)
            {
                    this.capacity = capacity;

                    head = new DoublyLLNode();
                    tail = new DoublyLLNode();

                    head.next = tail;
                    tail.prev = head;
            }

        private void removeNode(DoublyLLNode node)
        {
                DoublyLLNode prev = node.prev;
                DoublyLLNode next = node.next;

                prev.next = next;
                next.prev = prev;

                node.prev = null;
                node.next = null;
        }

        private void addAfterHead(DoublyLLNode node)
        {
                DoublyLLNode prev = head;
                DoublyLLNode next = head.next;

                prev.next = node;
                node.prev = prev;

                node.next = next;
                next.prev=node;
        }


        private void moveToHeadSide(DoublyLLNode node)
        {
                removeNode(node);
                addAfterHead(node);
        }


        public int get(int key) 
        {
                DoublyLLNode node = LRUmap.get(key);

                if(node == null) return -1;

                moveToHeadSide(node);

                return node.val;

        }

        public DoublyLLNode removeFromTail(DoublyLLNode node)
        {
                DoublyLLNode result = tail.prev;

                removeNode(result);
                return result;
        }

        public void put(int key, int value)
        {

                DoublyLLNode node = LRUmap.get(key);

                if(node == null) 
                {
                    DoublyLLNode addnode = new DoublyLLNode();
                    addnode.key = key;
                    addnode.val = value;

                    LRUmap.put(key, addnode);
                    addAfterHead(addnode);

                    if(LRUmap.size() >capacity)
                    {
                    //delete node from tail
                        DoublyLLNode del_node = removeFromTail(node);
                        LRUmap.remove(del_node.key);
                    }
                }
                else
                {
                        node.val = value;
                        addAfterHead(node);

                }

        }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */