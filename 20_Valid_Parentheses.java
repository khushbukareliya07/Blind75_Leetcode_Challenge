class 20_Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> data = new Stack<>();
        
        if(s.length() == 1 || s==null) return false;
        
        for(int i =0;i<s.length(); i++)
        {
            if(data.size() == 0 ||s.charAt(i) == '(' ||s.charAt(i) == '{' ||s.charAt(i) == '[' ) //||s.charAt(i) == '' 
            {
                //push data to stack
                data.push(s.charAt(i));
            }
            
            else
            {
                char temp = data.pop();
                if((s.charAt(i) == ')' && temp == '(' ) || (s.charAt(i) == '}' && temp  == '{') || (s.charAt(i) == ']' && temp  == '[' ))
                    continue;
                else
                {
                    return false;
                }
            }
        }
        return data.empty();
    }
}