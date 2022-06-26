//Brute-Force approach

class 739_DailyTemperatures_BF {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int len =  temperatures.length;
        
        for(int i = 0; i< len; i++)
        {
            int curr =  temperatures[i];
            int j = i+1;
            int index =i;
            while(j<len)
            {
                if(curr < temperatures[j])
                {
                    index = j;
                    break;
                }
                
                else
                {
                    j++;
                }
            }
            temperatures[i] = index-i;
        }
        return temperatures;
    }
}