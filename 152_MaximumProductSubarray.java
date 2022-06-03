class 152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int calculatemax=0, calculatemin=0,  max = nums[0], min = nums[0], result=nums[0]; 
        
        for(int i =1; i< nums.length; i++)
        {
            calculatemax = nums[i]*max;
            calculatemin = nums[i]*min;
            
            max = Math.max(nums[i], Math.max(calculatemax, calculatemin));
            min = Math.min(nums[i], Math.min(calculatemax, calculatemin));
            result = Math.max(max, result);
        }
        return result;
    }
}