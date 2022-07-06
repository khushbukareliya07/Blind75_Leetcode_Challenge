class 225_ImplementStackusingOneQueue {
        Queue<Integer>que;
       
    public 225_ImplementStackusingOneQueue() {
        que = new LinkedList<>();
      }
    
    public void push(int x) 
    {
        que.add(x);
        int len = que.size();
        while(len >1)
        {
            Integer first = que.remove();
            que.add(first);
            len --;
        }
    }
    
    public int pop() {
        return que.remove();
        
    }
    
    public int top() {
      
            return que.peek();
    }
    
    public boolean empty() {
        return que.isEmpty();
    }
    
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */