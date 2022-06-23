class 155_MinStack_TwoStackApproach {

    Stack<Integer> data, min;
    int minVal ;
    
    public 155_MinStack_TwoStackApproach() {
        data = new Stack<>();
        min = new Stack<>();
        minVal = Integer.MAX_VALUE; //keep track of minimum!
    }
    
    public void push(int val) {
       
        data.push(val);
        minVal = (minVal>val) ? val: minVal;
        min.push(minVal);
    }
    
    public void pop() {
        data.pop();
        min.pop();
        if(min.empty())
        {
         minVal = Integer.MAX_VALUE;   
        }
        else
        {
            minVal = min.peek();
        }
    }
    
    public int top() {
        return data.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */