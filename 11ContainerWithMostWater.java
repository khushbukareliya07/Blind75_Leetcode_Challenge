class 11ContainerWithMostWater {
    public int maxArea(int[] height) {
        
        int maxArea =0, tempArea=0;
        int leftIndex = 0;
        int rightIndex = height.length -1;
        
        while(leftIndex < rightIndex)
        {
            //calculate area
            
            //tempArea =  (Math.min(height[leftIndex], height[rightIndex])) * (rightIndex - leftIndex);
            maxArea = Math.max(((Math.min(height[leftIndex], height[rightIndex])) * (rightIndex - leftIndex)), maxArea);
            
            if(height[leftIndex] <= height[rightIndex])
                leftIndex++;
            else
                rightIndex--;
        }
        return maxArea;
    }
}