class 167_TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        
        //edge case 
        if(numbers.length == 0) return null;
        
        int left = 0;
        int right = numbers.length -1;
        
        //traverse through array
        while(left <right)
        {
            //check for the sum = target
            if(numbers[left]+ numbers[right] == target)
                return new int[] {left+1, right+1};
            
            //left pointer - increments if left+ right < target
            else if(numbers[left]+ numbers[right] < target)
                left++;
            
            //right pointer - decrements if left +right > target
            else
                right--;
        }
        return new int[] {0, 0};
        
        
    }
}