class 844_BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack_1 =  new Stack<>();
        Stack<Character> stack_2 =  new Stack<>();
        
        if(s==null || t == null) return false;
        
        //insert characters to stack
        for(int i=0; i< s.length(); i++)
        {
            if(s.charAt(i) == '#')
            {
                if(stack_1.size() !=0)
                    stack_1.pop();
            }
            else
            {
                stack_1.push(s.charAt(i));
            }
        }
        
        for(int i=0; i< t.length(); i++)
        {
            if(t.charAt(i) == '#')
            {
                if(stack_2.size() !=0)
                    stack_2.pop();
            }
            else
            {
                stack_2.push(t.charAt(i));
            }
        }
        
        //validating if strings are equal
        while(!stack_1.empty() && !stack_2.empty())
        {
            if(stack_1.pop() != stack_2.pop())
                return false;
        }
        return (stack_1.empty() && stack_2.empty());
    }
}