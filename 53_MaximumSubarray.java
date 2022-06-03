class 53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        
        int prev = 0, sum = nums[0];
        for(int i=0; i<nums.length; i++)
        {
            prev = prev+ nums[i];
            
            if(prev > sum)
                sum = prev;
            if(prev <0)
                prev =0;
        }
        return sum;
    }
}