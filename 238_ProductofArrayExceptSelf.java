class 238_ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int output[] = new int [nums.length];
        int length = nums.length;
        int temp =1;
        //traversing from left
        for(int i =0 ; i<length; i++)
        {
            output[i] = temp;
            temp *= nums[i];
        }
                
        //traversing from Right
        temp = 1;
        for(int i =length -1 ; i>=0; i--)
        {
                output[i] *= temp;                       
                temp *= nums[i];    
        }
        
       return output;
    }
}