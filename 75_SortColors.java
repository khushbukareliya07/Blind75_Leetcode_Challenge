class 75_SortColors {
    public void sortColors(int[] nums) {
        
        if(nums == null || nums.length ==1) return;

        //three pointer
        //low will be swapped for ->  0
        //midium takes care of  and just increases-> 1
        //high will be swapped for -> 2
        
        int low = 0, mid = 0, high = nums.length-1;
        int temp =0;
        
        while(mid<= high)
        {
            if(nums[mid] == 0)
            {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 2)
            {
                swap(nums, high, mid);
                high--;
            }
            else
            {
                mid++;
            }
        }
        
    }
    
    public void swap(int[] nums, int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        
    }
}