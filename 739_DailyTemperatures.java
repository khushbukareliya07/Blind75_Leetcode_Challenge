//Optiized Approach

class 739_DailyTemperatures {
    
	public int[] dailyTemperatures(int[] temperatures) {
              
        Stack<Integer> temp = new Stack<>(); //index and temperature
        int result[] = new int [temperatures.length];
        
        for(int i = 0; i< temperatures.length; i++)
        {
            while(!temp.empty() && temperatures[temp.peek()] < temperatures[i])
            {
                result[temp.peek()] = i - temp.peek();
                temp.pop();
            }
            
            temp.push(i);
        }
        return result;
    }
}