class 219_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        
      if(nums.length ==1) 
          return false; 
        
        Set<Integer> nums_copy = new HashSet();
        
       for(int i=0; i<nums.length; i++)
       {
           if(nums_copy.contains(nums[i]))
               return true;
               
           nums_copy.add(nums[i]);
                  
       }
        return false;
    }
}