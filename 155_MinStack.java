class 155_MinStack {

    /** initialize your data structure here. */
    Stack<Integer> data_stack, min_stack;
    int min;
    
    public MinStack() 
    {
        data_stack = new Stack<>();    
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) 
    {
        if(val <= min)
        {
            data_stack.push(min);
            min = val;
        }
        data_stack.push(val);
        
    }
    
    public void pop() 
    {
        int temp = data_stack.pop();
        min = temp <= min ? data_stack.pop(): min;
    }
    
    public int top() 
    {
        return data_stack.peek();    
    }
    
    public int getMin() 
    {
        return min;    
    }
}