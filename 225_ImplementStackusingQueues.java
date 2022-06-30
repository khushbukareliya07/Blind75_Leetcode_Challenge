class 225_ImplementStackusingQueues {
        Queue<Integer>main, temp;
        int topElement =0;
    public 225_ImplementStackusingQueues() {
        main = new PriorityQueue<>();
        temp = new PriorityQueue<>();
    }
    
    public void push(int x) {
        if(temp.isEmpty())
        {
            main.add(x);
        }
        else
        {
            temp.add(x);
        }
        topElement = x;
    }
    
    public int pop() {
        int t= 0;
        
        if(temp.isEmpty())
        {
            //main -> temp
            t = transferData(main, temp);
        }
        else
        {
            //temp -> main
            t = transferData(temp, main);
        }
        return t;
        
    }
    
    public int top() {
      
            return topElement;
    }
    
    public boolean empty() {
        return temp.isEmpty() && main.isEmpty();
    }
    
    private int transferData(Queue<Integer> main, Queue<Integer> temp)
    {
        int t = 0;
       for(int i = main.size(); i>1; i--)
       {
            topElement = main.poll();
            temp.add(topElement);
       }
        return main.poll(); 
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