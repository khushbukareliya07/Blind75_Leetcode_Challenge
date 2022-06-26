class 224_BasicCalculator {
    public int calculate(String s) {
        
        Stack<Integer> data =  new Stack<>();
        int sign =1;
        int  result = 0;
        int len = s.length();
        for(int i = 0; i< len; i++)
        {
            Character c= s.charAt(i);
                       
            if(Character.isDigit(c))
            {
                int sum = Character.getNumericValue(c);
                
                while(i+1 < len && Character.isDigit(s.charAt(i+1)))
                {
                    c = s.charAt(i+1);
                    int temp = Character.getNumericValue(c);
                    sum = (sum*10) + temp;
                    i++;
                }
                result = result + (sum*sign); 
            }
            
            else if(c == '(')
            {
                //push the existing value to the stack
                //push result first
                data.push(result);
                //push sign after
                data.push(sign);
                
                //reset the result and sign
                result =0;
                sign =1;
                
            }
            else if(c == ')')
            {
                result = result*data.pop() + data.pop(); //first we pop the sign and then result
            }
            else if(c == '+')
            {
                sign =1;
            }
            else if(c == '-')
            {
                sign = -1;
            }
            else
            {
                continue;
            }
            
        }
        return result;
    }
}