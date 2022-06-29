class 704_BinarySearch {
    public int search(int[] nums, int target) {
        
        
        if(nums == null ) return -1;
        
        int low =0; 
        int high = nums.length -1;
        
        while(low <=high)
        {
            int mid = calculateMid(low, high);
            
            //target  ==mid
            if(target == nums[mid])
                return mid;
            
            //target < mid
            else if (target < nums[mid] )
            {
                high = mid-1;
            }
            
            //target > mid
            else if(target > nums[mid])
            {
                low = mid +1;
            }
                        
        }
         return -1;
    }
    
    public int calculateMid (int high, int low)
    {
        int mid =0;
        mid = (high + low)/2;
        return mid;
    }
    
}