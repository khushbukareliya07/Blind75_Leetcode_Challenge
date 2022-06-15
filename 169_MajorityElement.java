class 169_MajorityElement {
    public int majorityElement(int[] nums) {
        
        int count=0;
        int n = nums.length;
        if(n==1) return nums[0];
        
        Arrays.sort(nums);
        
        count =1;
        for(int i=1; i<n; i++)
        {
                if( nums[i] == nums[i-1])
                {
                    count++;
                }
                else 
                {
                    if(count > (n/2))
                    {
                        return nums[i-1];
                    }
                    count =1;
                   
                }
        }
        return count > n/2 ? nums[nums.length-1] : -1;
    }
}