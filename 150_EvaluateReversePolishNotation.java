class 150_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        
        if( tokens ==null) return -1;
        Stack<Integer> data =  new Stack<>();
        int n1=0, n2=0;
        for(String token : tokens)
        {
            switch (token)
            {
                case "+":
                    n2 = data.pop();
                    n1 = data.pop();
                    data.push(n1+n2);
                    break;
                      
                  case "-":
                    n2 = data.pop();
                    n1 = data.pop();
                    data.push(n1 - n2);
                    break;
                      
                  case "*":
                    n2 = data.pop();
                    n1 = data.pop();
                    data.push(n1 * n2);  
                    break;
                      
                  case "/":
                    n2 = data.pop();
                    n1 = data.pop();
                    data.push(n1/n2);
                    break;
            
                  default: 
                    data.push(Integer.parseInt(token));
                
            }     
        }
        return data.pop();
    }
}

