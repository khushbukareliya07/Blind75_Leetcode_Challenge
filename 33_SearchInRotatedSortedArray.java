 
class 33_SearchInRotatedSortedArray 
{
    public int search(int[] nums, int target) 
    {
        
        if(nums.length <1 || nums== null)
            return -1;
                
        int low =0; 
        int high = nums.length -1;
        
        while(low <=high)
        {
            int mid = low + (high - low)/2;
            
            if(target == nums[mid])
                return mid;
            
           //check which side is sorted
            if(nums[low] <=  nums[mid])
            {
                //left side is sorted
                if(nums[low]<= target && target < nums[mid])
                {
                    high = mid -1;
                }
                else
                {
                    low = mid +1;
                }
            }
            
            //right side sorted
            if(nums[mid] <= nums[high])
            {
                if(nums[mid]<= target && target <= nums[high])
                {
                    //target on right side
                    low = mid+1;
                }
                else
                {
                    //left side
                    high = mid-1;   
                }
            }
        }
        return -1;
        
     }
       
}