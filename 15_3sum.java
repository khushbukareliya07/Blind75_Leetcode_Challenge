class 15_3sum
 {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> outputList = new ArrayList<>();
        
        if(nums.length <2)
            return outputList;
        
        //sort the array
        Arrays.sort(nums);
        
        //outer for loop for a
        for(int i =0; i < nums.length -1; i++)
        {
            if(nums[i]>0)
                return outputList;
            
            if(i>0 && nums[i-1] == nums[i] && i<nums.length-1)
            {
                 continue;
            }
            
            //left & right pointer for two sum
            int left =i+1, right = nums.length-1;

              while( left < right)
              {
                  if(nums[i] + nums[left] + nums[right] == 0 )
                  {
                      outputList.add(Arrays.asList(nums[i], nums[left], nums[right]));
                     while((left+1)<nums.length && nums[left+1] == nums[left]) {left++;}
                      left++;
                      right--;
                   }

                  else if(nums[i] + nums[left] + nums[right] < 0)
                      left++;

                  else
                      right--;
               }
        }
        return outputList;
    }
}