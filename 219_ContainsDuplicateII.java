class 219_ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if(nums.length ==1 || k==0)
            return false;
        
        int value =0;
        Map<Integer, Integer> numbers =  new HashMap();
        
        for(int i=0; i< nums.length; i++)
        {
            
            if(!numbers.containsKey(nums[i]))
            {
                //add the key- number value -index
                numbers.put(nums[i], i);
            }
            else
            {
                value = numbers.get(nums[i]);
                //get the value - i <= k! true? return : continue
                if(Math.abs(i- value) <= k)
                    return true;
                else
                    numbers.put(nums[i], i);
                    
            }
        }
        return false;
        
    }
}