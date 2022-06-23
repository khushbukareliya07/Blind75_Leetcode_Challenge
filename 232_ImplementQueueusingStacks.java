class 232_ImplementQueueusingStacks {

    Stack<Integer> data, temp;
    public 232_ImplementQueueusingStacks() {
        data = new Stack<>();
        temp = new Stack<>();
    }
    
    public void push(int x) {
        data.push(x);
    }
    
    public int pop() {
        //check if temp is empty
        if(temp.empty()) //true
        {
            //transfer all the data from data to temp
            transfer(data, temp);
        }
        return temp.pop();
    }
    
    public int peek() {
        if(temp.empty()) //true
        {
            //transfer all the data from data to temp
             transfer(data, temp);
        }
        return temp.peek();
    }
    
    public boolean empty() {
        return data.empty() && temp.empty();
    }
    
    public void transfer(Stack<Integer> data, Stack<Integer> temp)
    {
        int var=0;
        while(!data.empty())
        {
            var = data.pop();
            temp.push(var);
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */